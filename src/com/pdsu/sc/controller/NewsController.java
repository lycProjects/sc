package com.pdsu.sc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdsu.sc.news.util.NewsCategoryShowTypeEnum;
import com.pdsu.sc.news.util.NewsNewUtil;
import com.pdsu.sc.news.util.UEditorUploader;
import com.pdsu.sc.po.NewsCategory;
import com.pdsu.sc.po.NewsCategoryExample;
import com.pdsu.sc.po.NewsNew;
import com.pdsu.sc.po.NewsNewExample;
import com.pdsu.sc.service.NewsService;
import com.pdsu.sc.service.impl.NewsServiceImpl;

@Controller
public class NewsController {

	@Autowired
	private NewsService newsServiceImpl;

	// Ĭ�ϵ� ������ҳ ��ʾ���id
	private static final Integer DEFAULT_NEWS_CATEGORY_ID = 3;
	// Ĭ�ϵ� ������ҳ �����������б����������
	private static final Integer DEFAULT_NEWS_LEFT_MAIN_LIST_ITEM_SIZE = 3;
	// Ĭ�ϵ� ������ҳ �������������б����������
	private static final Integer DEFAULT_NEWS_RIGHT_NEWEST_LIST_ITEM_SIZE = 4;
	// Ĭ�ϵ� ������ҳ ����������� Դ�������Id
	private static final Integer DEFAULT_NEWS_HOT_FIRE_LIST_SOURCE_CATEGORY_ID = 4;
	// Ĭ�ϵ� ������ҳ ������������
	private static final Integer DEFAULT_NEWS_HOT_LIST_SIZE = 4;
	// Ĭ�ϵ� ������ҳ �����������
	private static final Integer DEFAULT_NEWS_FIRE_LIST_SIZE = 3;

	/**
	 * ��ȡ ������ҳ
	 */
	@RequestMapping("/News/News")
	public String getNewsIndexPage(HttpServletRequest request) {
		Integer newscateId = null;
		try {
			newscateId = Integer.parseInt(request.getParameter("newscateId"));
		} catch (NumberFormatException e) {
		}
		// Ĭ����ʾ������������
		String mNewsNewList_categoryTitle = "�ȵ�����";
		List<NewsNew> newsNewList = null;
		NewsNewExample newsNewExample = new NewsNewExample();
		newsNewExample.setOrderByClause("newsnew_pubTime DESC LIMIT 0," + DEFAULT_NEWS_LEFT_MAIN_LIST_ITEM_SIZE);
		NewsNewExample.Criteria criteria = newsNewExample.createCriteria();
		if (newscateId == null) {// ˵����û��ѡ�������
			criteria.andNewscateIdEqualTo(DEFAULT_NEWS_CATEGORY_ID);
			newsNewList = newsServiceImpl.selectNewsNew(newsNewExample);
		} else {// ˵���Ѿ�ѡ�������
			NewsCategory newsCategory = newsServiceImpl.selectNewsCategoryByPrimaryKey(newscateId);
			if (newsCategory == null) {
				// ˵��û������������ΪĬ�ϵ�
				newscateId = DEFAULT_NEWS_CATEGORY_ID;
			} else {
				mNewsNewList_categoryTitle = newsCategory.getNewscateTitle();
			}
			criteria.andNewscateIdEqualTo(newscateId);
			newsNewList = newsServiceImpl.selectNewsNew(newsNewExample);
		}
		// ������ͼƬ��ַ����ȡ
		NewsNewUtil newsNewUtil = null;
		for (NewsNew mNewsNew : newsNewList) {
			newsNewUtil = new NewsNewUtil(mNewsNew);
			if (newsNewUtil.isGetPictureOk()) {
				mNewsNew.setImageUrl(newsNewUtil.getPictureUrl());
			}
		}
		// �趨��������б�
		NewsCategoryExample newsCategoryExample = new NewsCategoryExample();
		NewsCategoryExample.Criteria criteria2 = newsCategoryExample.createCriteria();
		criteria2.andNewscateMarkEqualTo(NewsCategoryShowTypeEnum.show_news_index.toString());
		List<NewsCategory> newsCategory = newsServiceImpl.selectNewsCategory(newsCategoryExample);
		// �趨���� ������ʾ���б�
		NewsNewExample newsNewExample_newsest = new NewsNewExample();
		newsNewExample_newsest
				.setOrderByClause("newsnew_pubTime DESC LIMIT 0," + DEFAULT_NEWS_RIGHT_NEWEST_LIST_ITEM_SIZE);
		List<NewsNew> newsNewList_newsest = newsServiceImpl.selectNewsNew(newsNewExample_newsest);
		// �趨���Ⱥ���������
		// ��ͼ�������б�
		List<NewsNew> newsNewList_hot = new ArrayList<NewsNew>(DEFAULT_NEWS_HOT_LIST_SIZE);
		// ����ͼ����������б�
		List<NewsNew> newsNewList_fire = new ArrayList<NewsNew>(DEFAULT_NEWS_FIRE_LIST_SIZE);
		NewsNewExample newsNewExample_newsCateId3 = new NewsNewExample();
		// �ӷ���idΪ3������б�ȡ����
		newsNewExample_newsCateId3.createCriteria().andNewscateIdEqualTo(DEFAULT_NEWS_HOT_FIRE_LIST_SOURCE_CATEGORY_ID);
		newsNewExample_newsest.setOrderByClause("newsnew_pubTime DESC LIMIT 0,100");
		List<NewsNew> newsNewList_hot_fire = newsServiceImpl.selectNewsNew(newsNewExample_newsCateId3);
		// �ַ���ͼ�Ͳ���ͼ����
		for (NewsNew mNewsNew : newsNewList_hot_fire) {
			// ��������ͼƬ��ȡ����
			newsNewUtil = new NewsNewUtil(mNewsNew);
			if (newsNewUtil.isGetPictureOk()) {// �ɹ����ͼƬ
				if (newsNewList_hot.size() < DEFAULT_NEWS_HOT_LIST_SIZE) {// ��ӵ����ȵ��б�
					mNewsNew.setImageUrl(newsNewUtil.getPictureUrl());
					newsNewList_hot.add(mNewsNew);
				} else if (newsNewList_fire.size() < DEFAULT_NEWS_FIRE_LIST_SIZE) {// ��ӵ������б�
					newsNewList_fire.add(mNewsNew);
				} else {
					break;
				}
			} else {
				// ��ӵ������б�
				if (newsNewList_fire.size() < DEFAULT_NEWS_FIRE_LIST_SIZE) {
					newsNewList_fire.add(mNewsNew);
				}
				// System.err.println(newsNewUtil.getMsg());
			}
		}
		// ��ʾ����������б�
		request.setAttribute("newsCategory", newsCategory);
		// ������ �����б� ������
		request.setAttribute("mNewsNewList_categoryTitle", mNewsNewList_categoryTitle);
		// ������ �����б�
		request.setAttribute("newsNewList", newsNewList);
		// ���ϲ� �����б�
		request.setAttribute("newsNewList_newsest", newsNewList_newsest);
		// ���в� ��ͼ �����б�
		request.setAttribute("newsNewList_hot", newsNewList_hot);
		// ���²� ����ͼ ����б�
		request.setAttribute("newsNewList_fire", newsNewList_fire);
		return "behind/news/News";
	}

	/**
	 * ��ȡ �������ҳ
	 */
	@RequestMapping("/News/News/New")
	public String getNewsNewShowPage(HttpServletRequest request) {
		Integer newsnewId = null;
		try {
			newsnewId = Integer.parseInt(request.getParameter("newsnewId"));
		} catch (NumberFormatException e) {
		}
		if (newsnewId == null) {
			return "404";
		} else {
			// ���ж�һ����������ǲ��Ǵ���
			NewsNew newsNew = null;
			newsNew = newsServiceImpl.selectNewsNewByPrimaryKey(newsnewId);
			if (newsNew == null) {
				return "404";
			} else {// �����������
					// ������ͼƬ��ַ����ȡ
				NewsNewUtil newsNewUtil = null;
				// �趨��������б�
				NewsCategoryExample newsCategoryExample = new NewsCategoryExample();
				NewsCategoryExample.Criteria criteria2 = newsCategoryExample.createCriteria();
				criteria2.andNewscateMarkEqualTo(NewsCategoryShowTypeEnum.show_news_index.toString());
				List<NewsCategory> newsCategory = newsServiceImpl.selectNewsCategory(newsCategoryExample);
				// �趨���� ������ʾ���б�
				NewsNewExample newsNewExample_newsest = new NewsNewExample();
				newsNewExample_newsest
						.setOrderByClause("newsnew_pubTime DESC LIMIT 0," + DEFAULT_NEWS_RIGHT_NEWEST_LIST_ITEM_SIZE);
				List<NewsNew> newsNewList_newsest = newsServiceImpl.selectNewsNew(newsNewExample_newsest);
				// �趨���Ⱥ���������
				// ��ͼ�������б�
				List<NewsNew> newsNewList_hot = new ArrayList<NewsNew>(DEFAULT_NEWS_HOT_LIST_SIZE);
				NewsNewExample newsNewExample_newsCateId3 = new NewsNewExample();
				// �ӷ���idΪ3������б�ȡ����
				newsNewExample_newsCateId3.createCriteria()
						.andNewscateIdEqualTo(DEFAULT_NEWS_HOT_FIRE_LIST_SOURCE_CATEGORY_ID);
				newsNewExample_newsest.setOrderByClause("newsnew_pubTime DESC LIMIT 0,100");
				List<NewsNew> newsNewList_hot_fire = newsServiceImpl.selectNewsNew(newsNewExample_newsCateId3);
				// �ַ���ͼ�Ͳ���ͼ����
				for (NewsNew mNewsNew : newsNewList_hot_fire) {
					// ��������ͼƬ��ȡ����
					newsNewUtil = new NewsNewUtil(mNewsNew);
					if (newsNewUtil.isGetPictureOk()) {// �ɹ����ͼƬ
						if (newsNewList_hot.size() < DEFAULT_NEWS_HOT_LIST_SIZE) {// ��ӵ����ȵ��б�
							mNewsNew.setImageUrl(newsNewUtil.getPictureUrl());
							newsNewList_hot.add(mNewsNew);
						} else {
							break;
						}
					}
				}
				// Ĭ����ʾ������������
				String mNewsNewList_categoryTitle = "�ȵ�����";
				if (newsNew.getNewscateId() != null) {
					NewsCategory newsCategory2 = newsServiceImpl
							.selectNewsCategoryByPrimaryKey(newsNew.getNewscateId());
					if (newsCategory2 != null) {
						mNewsNewList_categoryTitle = newsCategory2.getNewscateTitle();
					}
				}
				// ��ʾ����������б�
				request.setAttribute("newsCategory", newsCategory);
				// ������ �����б� ������
				request.setAttribute("mNewsNewList_categoryTitle", mNewsNewList_categoryTitle);
				// ���ϲ� �����б�
				request.setAttribute("newsNewList_newsest", newsNewList_newsest);
				// ���в� ��ͼ �����б�
				request.setAttribute("newsNewList_hot", newsNewList_hot);
				request.setAttribute("newsNew", newsNew);
				return "behind/news/NewsSingle";
			}
		}
	}

	/*********************************
	 * ������� ����
	 *********************************/

	/**
	 * ��ȡ ���������� ҳ��
	 */
	@RequestMapping("/news/news-category")
	public String getNewsCategoryManagerAction(HttpServletRequest request) {
		List<NewsCategory> list = new ArrayList<NewsCategory>();
		list = newsServiceImpl.selectNewsCategory(null);
		request.setAttribute("newsCategoryList", list);
		return "behind/news/news-category";
	}

	/**
	 * ��� ������� ҳ��
	 */
	@RequestMapping(value = "news/news-category/add", method = RequestMethod.POST)
	public String getNewsCategoryAddDoAction(HttpServletRequest request) {
		String newscateTitle = request.getParameter("newscateTitle");
		String newscateMark = request.getParameter("newscateMark");
		String newscateBrief = request.getParameter("newscateBrief");
		if (newscateTitle == null || "".equals(newscateTitle)) {
			request.setAttribute("msg", "���ʧ�ܣ����������Ϊ��");
		} else {
			NewsCategory newsCategory = new NewsCategory();
			newsCategory.setNewscateTitle(newscateTitle);
			newsCategory.setNewscateMark(newscateMark);
			newsCategory.setNewscateBrief(newscateBrief);
			int result = newsServiceImpl.addNewsCategory(newsCategory);
			if (result > 0) {
				request.setAttribute("msg", "��ӳɹ�");
			} else {
				request.setAttribute("msg", "���ʧ��");
			}
		}
		request.setAttribute("nextUrl", "/news/news-category-add");
		return "jsp/passMessage";
	}

	/**
	 * ��ȡ ���������� ҳ��
	 */
	@RequestMapping("news/news-category-add")
	public String getNewsCategoryAddManagerAction() {
		return "behind/news/news-category-add";
	}

	/**
	 * ��ȡ �������༭ ҳ��
	 */
	@RequestMapping(value = "news/news-category-edit", method = RequestMethod.GET)
	public String getNewsCategoryEditPageManagerAction(HttpServletRequest request) {
		Integer newscateId = null;
		try {
			newscateId = Integer.parseInt(request.getParameter("newscateId"));
		} catch (NumberFormatException e) {

		}
		if (newscateId == null) {
			request.setAttribute("msg", "���Id����");
			request.setAttribute("nextUrl", "/news/news-category");
			return "jsp/passMessage";
		}
		NewsCategory newsCategory = newsServiceImpl.selectNewsCategoryByPrimaryKey(newscateId);
		request.setAttribute("newsCategory", newsCategory);
		return "behind/news/news-category-edit";
	}

	/**
	 * ��ȡ �������༭�ύ
	 */
	@RequestMapping(value = "news/news-category-edit/edit", method = RequestMethod.POST)
	public String getNewsCategoryEditManagerAction(HttpServletRequest request) {
		Integer newscateId = null;
		try {
			newscateId = Integer.parseInt(request.getParameter("newscateId"));
		} catch (NumberFormatException e) {

		}
		if (newscateId == null) {
			request.setAttribute("msg", "���Id����");
			request.setAttribute("nextUrl", "/news/news-category");
			return "jsp/passMessage";
		} else {
			String newscateTitle = request.getParameter("newscateTitle");
			if (newscateTitle == null || "".equals(newscateTitle)) {
				request.setAttribute("msg", "���ⲻ��Ϊ��");
				request.setAttribute("nextUrl", "/news/news-category-edit");
				return "jsp/passMessage";
			} else {
				String newscateMark = request.getParameter("newscateMark");
				String newscateBrief = request.getParameter("newscateBrief");
				NewsCategory newsCategory = new NewsCategory();
				newsCategory.setNewscateId(newscateId);
				newsCategory.setNewscateTitle(newscateTitle);
				newsCategory.setNewscateMark(newscateMark);
				newsCategory.setNewscateBrief(newscateBrief);
				int result = newsServiceImpl.modifyNewsCategory(newsCategory);
				if (result > 0) {
					request.setAttribute("msg", "�޸ĳɹ�");
				} else {
					request.setAttribute("msg", "�޸�ʧ�ܣ����Ժ�����");
				}
				request.setAttribute("nextUrl", "/news/news-category-edit?newscateId=" + newscateId);
				return "jsp/passMessage";
			}
		}
	}

	/**
	 * ������� ɾ��
	 */
	@RequestMapping("news/news-category/delete")
	public String getNewsCategoryDeleteManagerAction(HttpServletRequest request) {
		String newscateIds = request.getParameter("newscateIds").trim();
		if (newscateIds.contains(":")) {// ˵��������ɾ��
			boolean deletedOne = false;
			Integer newscateId = null;
			for (String newscateIdString : newscateIds.split(":")) {
				try {
					newscateId = Integer.parseInt(newscateIdString);
				} catch (NumberFormatException e) {
					request.setAttribute("msg", "ɾ��ʧ�ܣ�����Id����");
					request.setAttribute("nextUrl", "/news/news-category");
					return "jsp/passMessage";
				}
				if(newscateId<5){
					request.setAttribute("msg", "ɾ��ʧ�ܣ�����𲻿�ɾ��");
					request.setAttribute("nextUrl", "/news/news-category");
					return "jsp/passMessage";
				}
				int result = newsServiceImpl.removeNewsCategory(newscateId);
				if (result > 0) {
					deletedOne = true;
				}
			}
			if (deletedOne) {
				request.setAttribute("msg", "ɾ�����");
			} else {
				request.setAttribute("msg", "ɾ��ʧ�ܣ����Ժ�����");
			}
			request.setAttribute("nextUrl", "/news/news-category");
			return "jsp/passMessage";
		} else {
			Integer newscateId = null;
			try {
				newscateId = Integer.parseInt(newscateIds);
			} catch (NumberFormatException e) {
				request.setAttribute("msg", "ɾ��ʧ�ܣ�����Id����");
				request.setAttribute("nextUrl", "/news/news-category");
				return "jsp/passMessage";
			}
			if(newscateId<5){
				request.setAttribute("msg", "ɾ��ʧ�ܣ�����𲻿�ɾ��");
				request.setAttribute("nextUrl", "/news/news-category");
				return "jsp/passMessage";
			}
			int result = newsServiceImpl.removeNewsCategory(newscateId);
			if (result > 0) {
				request.setAttribute("msg", "ɾ���ɹ�");
			} else {
				request.setAttribute("msg", "ɾ��ʧ�ܣ����Ժ�����");
			}
			request.setAttribute("nextUrl", "/news/news-category");
			return "jsp/passMessage";
		}
	}

	/********************************* ���� ���� **********************************/

	private static String base_classes = NewsController.class.getClassLoader().getResource("").toString();
	/**
	 * �������ĸ�Ŀ¼��ַ
	 */
	private static String base_WebContentPath = base_classes.substring(6, base_classes.length() - 16);
	/**
	 * �洢html�ļ��ĵ�ַ
	 */
	private static String HtmlNews_FilesUri = "DataFile/news";
	/**
	 * �洢html�ļ��ĵ�ַ
	 */
	private static String HtmlNews_ImagesUri = "DataFile/news/images";

	/**
	 * ��ȡ �����б���� ҳ��
	 */
	@RequestMapping("/news/news-newsList")
	public String getNewsListManagerAction(HttpServletRequest request) {
		//��ȡ�������е����
		List<NewsCategory> newsCategoryList = new ArrayList<NewsCategory>();
		newsCategoryList = newsServiceImpl.selectNewsCategory(null);
		request.setAttribute("newsCategoryList", newsCategoryList);
		//��ȡ��������
		List<NewsNew> list = new ArrayList<NewsNew>();
		NewsNewExample newsNewExample=new NewsNewExample();
		newsNewExample.setOrderByClause("newsnew_pubTime DESC");
		list = newsServiceImpl.selectNewsNew(newsNewExample);
		request.setAttribute("newsNewList", list);
		return "behind/news/news-newsList";
	}

	/**
	 * �ϴ�ͼƬ�ӿ�
	 */
	@ResponseBody
	@RequestMapping(value = "/news/news-newsList/image", method = RequestMethod.POST)
	public String getNewsUplodeImageManagerAction(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			System.err.println("�������趨����ʱ����NewsController.getNewsUplodeImageManagerAction()");
		}
		response.setCharacterEncoding("utf-8");
		UEditorUploader up = new UEditorUploader(request);
		up.setSavePath(HtmlNews_ImagesUri);
		String[] fileType = { ".gif", ".png", ".jpg", ".jpeg", ".bmp" };
		up.setAllowFiles(fileType);
		up.setMaxSize(10000); // ��λKB
		try {
			up.upload();
		} catch (Exception e) {
			System.err.println("����ͼƬ�ļ��ϴ�ʧ�ܣ�NewsController.getNewsUplodeImageManagerAction()");
		}
		String callback = request.getParameter("callback");
		String result = "{\"name\":\"" + up.getFileName() + "\", \"originalName\": \"" + up.getOriginalName()
				+ "\", \"size\": " + up.getSize() + ", \"state\": \"" + up.getState() + "\", \"type\": \""
				+ up.getType() + "\", \"url\": \"" + up.getUrl() + "\"}";
		result = result.replaceAll("\\\\", "\\\\");
		/*
		 * PrintWriter pw=null; try { pw = response.getWriter(); } catch
		 * (IOException e) { System.err.println(
		 * "��ȡresponse.getWriter()�����ʱ����NewsController.getNewsUplodeImageManagerAction()"
		 * ); } if(pw!=null){ if(callback == null ){ pw.write(result); }else{
		 * pw.write("<script>"+ callback +"(" + result + ")</script>"); } }
		 */
		if (callback == null) {
			return result;
		} else {
			return "<script>" + callback + "(" + result + ")</script>";
		}
	}

	/**
	 * ��ȡ ������� ҳ��
	 */
	@RequestMapping(value = "news/news-newsList-addnew/add", method = RequestMethod.POST)
	public String getNewsAddNewAddManagerAction(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			System.err.println("�������趨����ʱ����NewsController.getNewsUplodeImageManagerAction()");
		}
		String newsnewTitle = request.getParameter("newsnewTitle");
		if (newsnewTitle != null && !"".equals(newsnewTitle)) { // ��ʾҪ���һ���µ�������
			String newscateIdString = request.getParameter("newscateId");
			// �ж���������Ƿ����
			Integer newscateId = new Integer(0);
			try {
				newscateId = Integer.parseInt(newscateIdString);
			} catch (NumberFormatException e) {
				// ˵����������newsCateId�޷�תΪ������
				request.setAttribute("msg", "�޸�ʧ�ܣ������������");
				request.setAttribute("nextUrl", "/news/news-newsList-addnew");
				return "jsp/passMessage";
			}
			// ��ѯһ���Ƿ�������������
			if (newscateId == null || newsServiceImpl.selectNewsCategoryByPrimaryKey(newscateId) == null) {
				request.setAttribute("msg", "�޸�ʧ�ܣ�������𲻴���");
				request.setAttribute("nextUrl", "/news/news-newsList-addnew");
				return "jsp/passMessage";
			}
			String newsnewHtmlContent = request.getParameter("newsnewHtmlContent");
			String newsnewBrief = request.getParameter("newsnewBrief");
			// ���ĵ�����
			String newsnewHtmlContentString = "";
			try {
				// ˫����
				newsnewHtmlContentString = URLDecoder.decode(newsnewHtmlContent, "utf-8");
				newsnewHtmlContentString = URLDecoder.decode(newsnewHtmlContentString, "utf-8");
				newsnewBrief = URLDecoder.decode(newsnewBrief, "utf-8");
				newsnewBrief = URLDecoder.decode(newsnewBrief, "utf-8");
			} catch (UnsupportedEncodingException e1) {
				System.err.println("�½����½���ʧ�ܣ��������¡�");
				System.err.println(newsnewHtmlContent + "��");
				request.setAttribute("msg", "���ʧ�ܣ��������ݽ������");
				request.setAttribute("nextUrl", "/news/news-newsList-addnew");
				return "jsp/passMessage";
			}
			// ��ʼ�洢html�ļ�
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");
			String htmlFileFloderName = sdf.format(date) + (new Random()).nextInt(1000);
			String newsnewHtmluri = "/" + HtmlNews_FilesUri + "/" + htmlFileFloderName + "/htmlContent.html";
			String htmlFilePath = base_WebContentPath + newsnewHtmluri;
			File htmlFile = new File(htmlFilePath);
			File htmlFileFloder = htmlFile.getParentFile();
			if (!htmlFileFloder.exists()) {
				htmlFileFloder.mkdirs();
			}
			try {
				FileOutputStream fos = new FileOutputStream(htmlFile);
				OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
				osw.write(newsnewHtmlContentString);
				osw.flush();
				osw.close();
				fos.close();
			} catch (IOException e) {
				request.setAttribute("msg", "���ʧ�ܣ��������ݱ���ʧ��");
				request.setAttribute("nextUrl", "/news/news-newsList-addnew");
				return "jsp/passMessage";
			}
			// ����Ӧ�ö������е�ͼƬ����һЩ������

			// ��ʼ��������
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			NewsNew newsNew = new NewsNew();
			String newsnewAuthorname = request.getParameter("newsnewAuthorname");
			String newsnewPubtime = sdf2.format(date);
			newsNew.setNewsnewAuthorname(newsnewAuthorname);
			newsNew.setNewsnewBrief(newsnewBrief);
			newsNew.setNewscateId(newscateId);
			newsNew.setNewsnewPubtime(newsnewPubtime);
			newsNew.setNewsnewTitle(newsnewTitle);
			newsNew.setNewsnewHtmluri(newsnewHtmluri);

			int result = newsServiceImpl.addNewsNew(newsNew);
			if (result > 0) {
				request.setAttribute("msg", "��ӳɹ�");
			} else {
				request.setAttribute("msg", "���ʧ�ܣ����Ժ�����");
			}
			request.setAttribute("nextUrl", "/news/news-newsList-addnew");
			return "jsp/passMessage";
		} else {
			request.setAttribute("msg", "���ʧ�ܣ����±��ⲻ��Ϊ��");
			request.setAttribute("nextUrl", "/news/news-newsList-addnew");
			return "jsp/passMessage";
		}
	}

	/**
	 * ��ȡ ������� ҳ��
	 */
	@RequestMapping(value = "news/news-newsList-addnew", method = RequestMethod.GET)
	public String getNewsAddNewManagerAction(HttpServletRequest request) {
		// �����������Id
		List<NewsCategory> cateList = newsServiceImpl.selectNewsCategory(null);
		request.setAttribute("cateList", cateList);
		return "behind/news/news-newsList-addnew";
	}

	/**
	 * ��ȡ ���ű༭ ҳ��
	 */
	@RequestMapping(value = "news/news-newsList-editnew", method = RequestMethod.GET)
	public String getNewsEditNewManagerAction(HttpServletRequest request) {
		Integer newsnewId = null;
		try {
			newsnewId = Integer.parseInt(request.getParameter("newsnewId"));
		} catch (NumberFormatException e) {

		}
		if (newsnewId == null) {
			request.setAttribute("msg", "����Id����");
			request.setAttribute("nextUrl", "/news/news-newsList");
			return "jsp/passMessage";
		} else {
			// ���ж�һ����������ǲ��Ǵ���
			NewsNew newsNew = null;
			newsNew = newsServiceImpl.selectNewsNewByPrimaryKey(newsnewId);
			if (newsNew == null) {
				request.setAttribute("msg", "�޸�ʧ�ܣ����Ų�����");
				request.setAttribute("nextUrl", "/news/news-newsList");
				return "jsp/passMessage";
			} else {
				// �����������Id
				List<NewsCategory> cateList = newsServiceImpl.selectNewsCategory(null);
				request.setAttribute("cateList", cateList);
				request.setAttribute("newsNew", newsNew);
				return "behind/news/news-newsList-editnew";
			}
		}
	}

	/**
	 * ��ȡ ���ű༭ �ύ
	 */
	@RequestMapping(value = "news/news-newsList-editnew/edit", method = RequestMethod.POST)
	public String getNewsEditNewEditManagerAction(HttpServletRequest request) {
		Integer newsnewId = null;
		try {
			newsnewId = Integer.parseInt(request.getParameter("newsnewId"));
		} catch (NumberFormatException e) {
		}
		if (newsnewId == null) {
			request.setAttribute("msg", "����Id����");
			request.setAttribute("nextUrl", "/news/news-newsList");
			return "jsp/passMessage";
		} else {
			// ���ж�һ����������ǲ��Ǵ���
			NewsNew newsNew = null;
			newsNew = newsServiceImpl.selectNewsNewByPrimaryKey(newsnewId);
			if (newsNew == null) {
				request.setAttribute("msg", "�޸�ʧ�ܣ����Ų�����");
				request.setAttribute("nextUrl", "/news/news-newsList");
				return "jsp/passMessage";
			}
			String newsnewTitle = request.getParameter("newsnewTitle");
			if (newsnewTitle == null || "".equals(newsnewTitle)) { // ��ʾ�Ž����˱༭����
				request.setAttribute("msg", "�޸�ʧ�ܣ����ű��ⲻ��Ϊ��");
				request.setAttribute("nextUrl", "/news/news-newsList-editnew?newsnewId=" + newsnewId);
				return "jsp/passMessage";
			} else { // ��ʾҪ�ύ�޸����������
				String newscateIdString = request.getParameter("newscateId");
				Integer newscateId = new Integer(0);
				try {
					newscateId = Integer.parseInt(newscateIdString);
				} catch (NumberFormatException e) {
					// ˵����������newsCateId�޷�תΪ������
					request.setAttribute("msg", "�޸�ʧ�ܣ������������");
					request.setAttribute("nextUrl", "/news/news-newsList-editnew?newsnewId=" + newsnewId);
					return "jsp/passMessage";
				}
				// ��ѯһ���Ƿ�������������
				if (newscateId == null || newsServiceImpl.selectNewsCategoryByPrimaryKey(newscateId) == null) {
					request.setAttribute("msg", "�޸�ʧ�ܣ�������𲻴���");
					request.setAttribute("nextUrl", "/news/news-newsList-editnew?newsnewId=" + newsnewId);
					return "jsp/passMessage";
				}
				String newsnewHtmlContent = request.getParameter("newsnewHtmlContent");
				String newsnewBrief = request.getParameter("newsnewBrief");
				// ���ĵ�����
				String newsnewHtmlContentString = "";
				try {
					// ˫����
					newsnewHtmlContentString = URLDecoder.decode(newsnewHtmlContent, "utf-8");
					newsnewHtmlContentString = URLDecoder.decode(newsnewHtmlContentString, "utf-8");
					newsnewBrief = URLDecoder.decode(newsnewBrief, "utf-8");
					newsnewBrief = URLDecoder.decode(newsnewBrief, "utf-8");
				} catch (UnsupportedEncodingException e1) {
					System.err.println("���½���ʧ�ܣ�newsNew.newsnewId=" + newsnewId + " �������¡�");
					System.err.println(newsnewHtmlContent + "��");
					request.setAttribute("msg", "�޸�ʧ�ܣ��������ݽ������");
					request.setAttribute("nextUrl", "/news/news-newsList-editnew?newsnewId=" + newsnewId);
					return "jsp/passMessage";
				}
				// ��ʼ�洢html�ļ�
				String htmlFilePath = base_WebContentPath + newsNew.getNewsnewHtmluri();
				File htmlFile = new File(htmlFilePath);
				if (!htmlFile.getParentFile().exists()) {
					htmlFile.getParentFile().mkdirs();
				}
				try {
					FileOutputStream fos = new FileOutputStream(htmlFile);
					OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
					osw.write(newsnewHtmlContentString);
					osw.flush();
					osw.close();
					fos.close();
				} catch (IOException e) {
					request.setAttribute("msg", "�޸�ʧ�ܣ��������ݱ���ʧ��");
					request.setAttribute("nextUrl", "/news/news-newsList-editnew?newsnewId=" + newsnewId);
					return "jsp/passMessage";
				}
				// ����Ӧ�ö������е�ͼƬ����һЩ������

				// ��ʼ��������
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String newsnewAuthorname = request.getParameter("newsnewAuthorname");
				String newsnewPubtime = sdf.format(date);
				newsNew.setNewsnewAuthorname(newsnewAuthorname);
				newsNew.setNewsnewBrief(newsnewBrief);
				newsNew.setNewscateId(newscateId);
				newsNew.setNewsnewPubtime(newsnewPubtime);
				newsNew.setNewsnewTitle(newsnewTitle);
				int result = newsServiceImpl.modifyNewsNew(newsNew);
				if (result > 0) {
					request.setAttribute("msg", "�޸ĳɹ�");
				} else {
					request.setAttribute("msg", "�޸�ʧ�ܣ����Ժ�����");
				}
				request.setAttribute("nextUrl", "/news/news-newsList-editnew?newsnewId=" + newsnewId);
				return "jsp/passMessage";
			}
		}
	}

	/**
	 * ���� ɾ��
	 */
	@RequestMapping("news/news-new/delete")
	public String getNewsNewDeleteManagerAction(HttpServletRequest request) {
		String newsNewIds = request.getParameter("newsNewIds").trim();
		if (newsNewIds.contains(":")) {// ˵��������ɾ��
			boolean deletedOne = false;
			Integer newsNewId = null;
			for (String newscateIdString : newsNewIds.split(":")) {
				try {
					newsNewId = Integer.parseInt(newscateIdString);
				} catch (NumberFormatException e) {
					request.setAttribute("msg", "ɾ��ʧ�ܣ�����IdΪ��");
					request.setAttribute("nextUrl", "/news/news-newsList");
					return "jsp/passMessage";
				}
				NewsNew newsNew = newsServiceImpl.selectNewsNewByPrimaryKey(newsNewId);
				if (newsNew == null) {
					request.setAttribute("msg", "���Ų�����");
					request.setAttribute("nextUrl", "/news/news-newsList");
					return "jsp/passMessage";
				}
				// ɾ���ļ�
				String htmlFilePath = base_WebContentPath + newsNew.getNewsnewHtmluri();
				File htmlFile = new File(htmlFilePath);
				if (htmlFile.exists()) {
					if (!htmlFile.delete()) {
						System.err.println("�����ļ�ɾ��ʧ��:htmlFilePath=" + htmlFilePath);
					}
				}
				int result = newsServiceImpl.removeNewsNew(newsNewId);
				if (result > 0) {
					deletedOne = true;
				}
			}
			if (deletedOne) {
				request.setAttribute("msg", "ɾ�����");
			} else {
				request.setAttribute("msg", "ɾ��ʧ�ܣ����Ժ�����");
			}
			request.setAttribute("nextUrl", "/news/news-newsList");
			return "jsp/passMessage";
		} else {
			Integer newsNewId = null;
			try {
				newsNewId = Integer.parseInt(newsNewIds);
			} catch (NumberFormatException e) {
				request.setAttribute("msg", "ɾ��ʧ�ܣ�����IdΪ��");
				request.setAttribute("nextUrl", "/news/news-newsList");
				return "jsp/passMessage";
			}
			NewsNew newsNew = newsServiceImpl.selectNewsNewByPrimaryKey(newsNewId);
			if (newsNew == null) {
				request.setAttribute("msg", "���Ų�����");
				request.setAttribute("nextUrl", "/news/news-newsList");
				return "jsp/passMessage";
			}
			// ɾ���ļ�
			String htmlFilePath = base_WebContentPath + newsNew.getNewsnewHtmluri();
			File htmlFile = new File(htmlFilePath);
			if (htmlFile.exists()) {
				if (!htmlFile.delete()) {
					System.err.println("�����ļ�ɾ��ʧ��:htmlFilePath=" + htmlFilePath);
				}
			}
			int result = newsServiceImpl.removeNewsNew(newsNewId);
			if (result > 0) {
				request.setAttribute("msg", "ɾ���ɹ�");
			} else {
				request.setAttribute("msg", "ɾ��ʧ�ܣ����Ժ�����");
			}
			request.setAttribute("nextUrl", "/news/news-newsList");
			return "jsp/passMessage";
		}
	}

	/************************ �������Ž��� *********************************/

	/**
	 * ���� ��ϵ����
	 */
	@RequestMapping("/News/NewsContact")
	public String getNewsContactAction(HttpServletRequest request) {
		// �趨��������б�
		NewsCategoryExample newsCategoryExample = new NewsCategoryExample();
		NewsCategoryExample.Criteria criteria2 = newsCategoryExample.createCriteria();
		criteria2.andNewscateMarkEqualTo(NewsCategoryShowTypeEnum.show_news_index.toString());
		List<NewsCategory> newsCategory = newsServiceImpl.selectNewsCategory(newsCategoryExample);
		// ��ʾ����������б�
		request.setAttribute("newsCategory", newsCategory);
		return "behind/news/NewsContact";
	}

	/**
	 * ���� ������˾
	 */
	@RequestMapping("/News/Company")
	public String getNewsCompanyAction(HttpServletRequest request) {
		// �趨��������б�
		NewsCategoryExample newsCategoryExample = new NewsCategoryExample();
		NewsCategoryExample.Criteria criteria2 = newsCategoryExample.createCriteria();
		criteria2.andNewscateMarkEqualTo(NewsCategoryShowTypeEnum.show_news_index.toString());
		List<NewsCategory> newsCategory = newsServiceImpl.selectNewsCategory(newsCategoryExample);
		// ��ʾ����������б�
		request.setAttribute("newsCategory", newsCategory);
		return "behind/news/Company";
	}

	class NewsResponseJsonModel {
		private String result;
		private String msg;
		private String nextUrl;

		public NewsResponseJsonModel(String result, String msg, String nextUrl) {
			this.result = result;
			this.msg = msg;
			this.nextUrl = nextUrl;
		}

		public String getResult() {
			return result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public String getNextUrl() {
			return nextUrl;
		}

		public void setNextUrl(String nextUrl) {
			this.nextUrl = nextUrl;
		}

		public String toJson() {
			String json = "{\"result\":\"" + this.result + "\",\"msg\":\"" + this.msg + "\",\"nextUrl\":\""
					+ this.nextUrl + "\"}";
			return json;
		}
	}
}
