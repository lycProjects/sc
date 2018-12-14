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

	// 默认的 新闻首页 显示类别id
	private static final Integer DEFAULT_NEWS_CATEGORY_ID = 3;
	// 默认的 新闻首页 左主区新闻列表的新闻数量
	private static final Integer DEFAULT_NEWS_LEFT_MAIN_LIST_ITEM_SIZE = 3;
	// 默认的 新闻首页 右区最新新闻列表的新闻数量
	private static final Integer DEFAULT_NEWS_RIGHT_NEWEST_LIST_ITEM_SIZE = 4;
	// 默认的 新闻首页 最热最火新闻 源新闻类别Id
	private static final Integer DEFAULT_NEWS_HOT_FIRE_LIST_SOURCE_CATEGORY_ID = 4;
	// 默认的 新闻首页 最热新闻数量
	private static final Integer DEFAULT_NEWS_HOT_LIST_SIZE = 4;
	// 默认的 新闻首页 最火新闻数量
	private static final Integer DEFAULT_NEWS_FIRE_LIST_SIZE = 3;

	/**
	 * 获取 新闻首页
	 */
	@RequestMapping("/News/News")
	public String getNewsIndexPage(HttpServletRequest request) {
		Integer newscateId = null;
		try {
			newscateId = Integer.parseInt(request.getParameter("newscateId"));
		} catch (NumberFormatException e) {
		}
		// 默认显示的新闻类别标题
		String mNewsNewList_categoryTitle = "热点新闻";
		List<NewsNew> newsNewList = null;
		NewsNewExample newsNewExample = new NewsNewExample();
		newsNewExample.setOrderByClause("newsnew_pubTime DESC LIMIT 0," + DEFAULT_NEWS_LEFT_MAIN_LIST_ITEM_SIZE);
		NewsNewExample.Criteria criteria = newsNewExample.createCriteria();
		if (newscateId == null) {// 说明是没有选定该类别
			criteria.andNewscateIdEqualTo(DEFAULT_NEWS_CATEGORY_ID);
			newsNewList = newsServiceImpl.selectNewsNew(newsNewExample);
		} else {// 说明已经选定类别了
			NewsCategory newsCategory = newsServiceImpl.selectNewsCategoryByPrimaryKey(newscateId);
			if (newsCategory == null) {
				// 说明没有这个类别，让它为默认的
				newscateId = DEFAULT_NEWS_CATEGORY_ID;
			} else {
				mNewsNewList_categoryTitle = newsCategory.getNewscateTitle();
			}
			criteria.andNewscateIdEqualTo(newscateId);
			newsNewList = newsServiceImpl.selectNewsNew(newsNewExample);
		}
		// 对文章图片地址的提取
		NewsNewUtil newsNewUtil = null;
		for (NewsNew mNewsNew : newsNewList) {
			newsNewUtil = new NewsNewUtil(mNewsNew);
			if (newsNewUtil.isGetPictureOk()) {
				mNewsNew.setImageUrl(newsNewUtil.getPictureUrl());
			}
		}
		// 设定新闻类别列表
		NewsCategoryExample newsCategoryExample = new NewsCategoryExample();
		NewsCategoryExample.Criteria criteria2 = newsCategoryExample.createCriteria();
		criteria2.andNewscateMarkEqualTo(NewsCategoryShowTypeEnum.show_news_index.toString());
		List<NewsCategory> newsCategory = newsServiceImpl.selectNewsCategory(newsCategoryExample);
		// 设定最新 新闻显示在列表
		NewsNewExample newsNewExample_newsest = new NewsNewExample();
		newsNewExample_newsest
				.setOrderByClause("newsnew_pubTime DESC LIMIT 0," + DEFAULT_NEWS_RIGHT_NEWEST_LIST_ITEM_SIZE);
		List<NewsNew> newsNewList_newsest = newsServiceImpl.selectNewsNew(newsNewExample_newsest);
		// 设定最热和最火的新闻
		// 带图的最热列表
		List<NewsNew> newsNewList_hot = new ArrayList<NewsNew>(DEFAULT_NEWS_HOT_LIST_SIZE);
		// 不带图的最火新闻列表
		List<NewsNew> newsNewList_fire = new ArrayList<NewsNew>(DEFAULT_NEWS_FIRE_LIST_SIZE);
		NewsNewExample newsNewExample_newsCateId3 = new NewsNewExample();
		// 从分类id为3的最火列表取新闻
		newsNewExample_newsCateId3.createCriteria().andNewscateIdEqualTo(DEFAULT_NEWS_HOT_FIRE_LIST_SOURCE_CATEGORY_ID);
		newsNewExample_newsest.setOrderByClause("newsnew_pubTime DESC LIMIT 0,100");
		List<NewsNew> newsNewList_hot_fire = newsServiceImpl.selectNewsNew(newsNewExample_newsCateId3);
		// 分发带图和不带图新闻
		for (NewsNew mNewsNew : newsNewList_hot_fire) {
			// 对新闻来图片提取分析
			newsNewUtil = new NewsNewUtil(mNewsNew);
			if (newsNewUtil.isGetPictureOk()) {// 成功获得图片
				if (newsNewList_hot.size() < DEFAULT_NEWS_HOT_LIST_SIZE) {// 添加到最热的列表
					mNewsNew.setImageUrl(newsNewUtil.getPictureUrl());
					newsNewList_hot.add(mNewsNew);
				} else if (newsNewList_fire.size() < DEFAULT_NEWS_FIRE_LIST_SIZE) {// 添加到最火的列表
					newsNewList_fire.add(mNewsNew);
				} else {
					break;
				}
			} else {
				// 添加到最火的列表
				if (newsNewList_fire.size() < DEFAULT_NEWS_FIRE_LIST_SIZE) {
					newsNewList_fire.add(mNewsNew);
				}
				// System.err.println(newsNewUtil.getMsg());
			}
		}
		// 显示的新闻类别列表
		request.setAttribute("newsCategory", newsCategory);
		// 左主区 新闻列表 类别标题
		request.setAttribute("mNewsNewList_categoryTitle", mNewsNewList_categoryTitle);
		// 左主区 新闻列表
		request.setAttribute("newsNewList", newsNewList);
		// 右上部 最新列表
		request.setAttribute("newsNewList_newsest", newsNewList_newsest);
		// 右中部 带图 最热列表
		request.setAttribute("newsNewList_hot", newsNewList_hot);
		// 右下部 不带图 最火列表
		request.setAttribute("newsNewList_fire", newsNewList_fire);
		return "behind/news/News";
	}

	/**
	 * 获取 新闻浏览页
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
			// 先判断一下这个新闻是不是存在
			NewsNew newsNew = null;
			newsNew = newsServiceImpl.selectNewsNewByPrimaryKey(newsnewId);
			if (newsNew == null) {
				return "404";
			} else {// 输出新闻内容
					// 对文章图片地址的提取
				NewsNewUtil newsNewUtil = null;
				// 设定新闻类别列表
				NewsCategoryExample newsCategoryExample = new NewsCategoryExample();
				NewsCategoryExample.Criteria criteria2 = newsCategoryExample.createCriteria();
				criteria2.andNewscateMarkEqualTo(NewsCategoryShowTypeEnum.show_news_index.toString());
				List<NewsCategory> newsCategory = newsServiceImpl.selectNewsCategory(newsCategoryExample);
				// 设定最新 新闻显示在列表
				NewsNewExample newsNewExample_newsest = new NewsNewExample();
				newsNewExample_newsest
						.setOrderByClause("newsnew_pubTime DESC LIMIT 0," + DEFAULT_NEWS_RIGHT_NEWEST_LIST_ITEM_SIZE);
				List<NewsNew> newsNewList_newsest = newsServiceImpl.selectNewsNew(newsNewExample_newsest);
				// 设定最热和最火的新闻
				// 带图的最热列表
				List<NewsNew> newsNewList_hot = new ArrayList<NewsNew>(DEFAULT_NEWS_HOT_LIST_SIZE);
				NewsNewExample newsNewExample_newsCateId3 = new NewsNewExample();
				// 从分类id为3的最火列表取新闻
				newsNewExample_newsCateId3.createCriteria()
						.andNewscateIdEqualTo(DEFAULT_NEWS_HOT_FIRE_LIST_SOURCE_CATEGORY_ID);
				newsNewExample_newsest.setOrderByClause("newsnew_pubTime DESC LIMIT 0,100");
				List<NewsNew> newsNewList_hot_fire = newsServiceImpl.selectNewsNew(newsNewExample_newsCateId3);
				// 分发带图和不带图新闻
				for (NewsNew mNewsNew : newsNewList_hot_fire) {
					// 对新闻来图片提取分析
					newsNewUtil = new NewsNewUtil(mNewsNew);
					if (newsNewUtil.isGetPictureOk()) {// 成功获得图片
						if (newsNewList_hot.size() < DEFAULT_NEWS_HOT_LIST_SIZE) {// 添加到最热的列表
							mNewsNew.setImageUrl(newsNewUtil.getPictureUrl());
							newsNewList_hot.add(mNewsNew);
						} else {
							break;
						}
					}
				}
				// 默认显示的新闻类别标题
				String mNewsNewList_categoryTitle = "热点新闻";
				if (newsNew.getNewscateId() != null) {
					NewsCategory newsCategory2 = newsServiceImpl
							.selectNewsCategoryByPrimaryKey(newsNew.getNewscateId());
					if (newsCategory2 != null) {
						mNewsNewList_categoryTitle = newsCategory2.getNewscateTitle();
					}
				}
				// 显示的新闻类别列表
				request.setAttribute("newsCategory", newsCategory);
				// 左主区 新闻列表 类别标题
				request.setAttribute("mNewsNewList_categoryTitle", mNewsNewList_categoryTitle);
				// 右上部 最新列表
				request.setAttribute("newsNewList_newsest", newsNewList_newsest);
				// 右中部 带图 最热列表
				request.setAttribute("newsNewList_hot", newsNewList_hot);
				request.setAttribute("newsNew", newsNew);
				return "behind/news/NewsSingle";
			}
		}
	}

	/*********************************
	 * 新闻类别 管理
	 *********************************/

	/**
	 * 获取 新闻类别管理 页面
	 */
	@RequestMapping("/news/news-category")
	public String getNewsCategoryManagerAction(HttpServletRequest request) {
		List<NewsCategory> list = new ArrayList<NewsCategory>();
		list = newsServiceImpl.selectNewsCategory(null);
		request.setAttribute("newsCategoryList", list);
		return "behind/news/news-category";
	}

	/**
	 * 添加 新闻类别 页面
	 */
	@RequestMapping(value = "news/news-category/add", method = RequestMethod.POST)
	public String getNewsCategoryAddDoAction(HttpServletRequest request) {
		String newscateTitle = request.getParameter("newscateTitle");
		String newscateMark = request.getParameter("newscateMark");
		String newscateBrief = request.getParameter("newscateBrief");
		if (newscateTitle == null || "".equals(newscateTitle)) {
			request.setAttribute("msg", "添加失败，类别名不能为空");
		} else {
			NewsCategory newsCategory = new NewsCategory();
			newsCategory.setNewscateTitle(newscateTitle);
			newsCategory.setNewscateMark(newscateMark);
			newsCategory.setNewscateBrief(newscateBrief);
			int result = newsServiceImpl.addNewsCategory(newsCategory);
			if (result > 0) {
				request.setAttribute("msg", "添加成功");
			} else {
				request.setAttribute("msg", "添加失败");
			}
		}
		request.setAttribute("nextUrl", "/news/news-category-add");
		return "jsp/passMessage";
	}

	/**
	 * 获取 添加新闻类别 页面
	 */
	@RequestMapping("news/news-category-add")
	public String getNewsCategoryAddManagerAction() {
		return "behind/news/news-category-add";
	}

	/**
	 * 获取 新闻类别编辑 页面
	 */
	@RequestMapping(value = "news/news-category-edit", method = RequestMethod.GET)
	public String getNewsCategoryEditPageManagerAction(HttpServletRequest request) {
		Integer newscateId = null;
		try {
			newscateId = Integer.parseInt(request.getParameter("newscateId"));
		} catch (NumberFormatException e) {

		}
		if (newscateId == null) {
			request.setAttribute("msg", "类别Id有误");
			request.setAttribute("nextUrl", "/news/news-category");
			return "jsp/passMessage";
		}
		NewsCategory newsCategory = newsServiceImpl.selectNewsCategoryByPrimaryKey(newscateId);
		request.setAttribute("newsCategory", newsCategory);
		return "behind/news/news-category-edit";
	}

	/**
	 * 获取 新闻类别编辑提交
	 */
	@RequestMapping(value = "news/news-category-edit/edit", method = RequestMethod.POST)
	public String getNewsCategoryEditManagerAction(HttpServletRequest request) {
		Integer newscateId = null;
		try {
			newscateId = Integer.parseInt(request.getParameter("newscateId"));
		} catch (NumberFormatException e) {

		}
		if (newscateId == null) {
			request.setAttribute("msg", "类别Id有误");
			request.setAttribute("nextUrl", "/news/news-category");
			return "jsp/passMessage";
		} else {
			String newscateTitle = request.getParameter("newscateTitle");
			if (newscateTitle == null || "".equals(newscateTitle)) {
				request.setAttribute("msg", "标题不能为空");
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
					request.setAttribute("msg", "修改成功");
				} else {
					request.setAttribute("msg", "修改失败，请稍后再试");
				}
				request.setAttribute("nextUrl", "/news/news-category-edit?newscateId=" + newscateId);
				return "jsp/passMessage";
			}
		}
	}

	/**
	 * 新闻类别 删除
	 */
	@RequestMapping("news/news-category/delete")
	public String getNewsCategoryDeleteManagerAction(HttpServletRequest request) {
		String newscateIds = request.getParameter("newscateIds").trim();
		if (newscateIds.contains(":")) {// 说明是批量删除
			boolean deletedOne = false;
			Integer newscateId = null;
			for (String newscateIdString : newscateIds.split(":")) {
				try {
					newscateId = Integer.parseInt(newscateIdString);
				} catch (NumberFormatException e) {
					request.setAttribute("msg", "删除失败，新闻Id有误");
					request.setAttribute("nextUrl", "/news/news-category");
					return "jsp/passMessage";
				}
				if(newscateId<5){
					request.setAttribute("msg", "删除失败，该类别不可删除");
					request.setAttribute("nextUrl", "/news/news-category");
					return "jsp/passMessage";
				}
				int result = newsServiceImpl.removeNewsCategory(newscateId);
				if (result > 0) {
					deletedOne = true;
				}
			}
			if (deletedOne) {
				request.setAttribute("msg", "删除完成");
			} else {
				request.setAttribute("msg", "删除失败，请稍后再试");
			}
			request.setAttribute("nextUrl", "/news/news-category");
			return "jsp/passMessage";
		} else {
			Integer newscateId = null;
			try {
				newscateId = Integer.parseInt(newscateIds);
			} catch (NumberFormatException e) {
				request.setAttribute("msg", "删除失败，新闻Id有误");
				request.setAttribute("nextUrl", "/news/news-category");
				return "jsp/passMessage";
			}
			if(newscateId<5){
				request.setAttribute("msg", "删除失败，该类别不可删除");
				request.setAttribute("nextUrl", "/news/news-category");
				return "jsp/passMessage";
			}
			int result = newsServiceImpl.removeNewsCategory(newscateId);
			if (result > 0) {
				request.setAttribute("msg", "删除成功");
			} else {
				request.setAttribute("msg", "删除失败，请稍后再试");
			}
			request.setAttribute("nextUrl", "/news/news-category");
			return "jsp/passMessage";
		}
	}

	/********************************* 新闻 管理 **********************************/

	private static String base_classes = NewsController.class.getClassLoader().getResource("").toString();
	/**
	 * 服务器的根目录地址
	 */
	private static String base_WebContentPath = base_classes.substring(6, base_classes.length() - 16);
	/**
	 * 存储html文件的地址
	 */
	private static String HtmlNews_FilesUri = "DataFile/news";
	/**
	 * 存储html文件的地址
	 */
	private static String HtmlNews_ImagesUri = "DataFile/news/images";

	/**
	 * 获取 新闻列表管理 页面
	 */
	@RequestMapping("/news/news-newsList")
	public String getNewsListManagerAction(HttpServletRequest request) {
		//获取新闻所有的类别
		List<NewsCategory> newsCategoryList = new ArrayList<NewsCategory>();
		newsCategoryList = newsServiceImpl.selectNewsCategory(null);
		request.setAttribute("newsCategoryList", newsCategoryList);
		//获取所有新闻
		List<NewsNew> list = new ArrayList<NewsNew>();
		NewsNewExample newsNewExample=new NewsNewExample();
		newsNewExample.setOrderByClause("newsnew_pubTime DESC");
		list = newsServiceImpl.selectNewsNew(newsNewExample);
		request.setAttribute("newsNewList", list);
		return "behind/news/news-newsList";
	}

	/**
	 * 上传图片接口
	 */
	@ResponseBody
	@RequestMapping(value = "/news/news-newsList/image", method = RequestMethod.POST)
	public String getNewsUplodeImageManagerAction(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			System.err.println("对请求设定编码时出错：NewsController.getNewsUplodeImageManagerAction()");
		}
		response.setCharacterEncoding("utf-8");
		UEditorUploader up = new UEditorUploader(request);
		up.setSavePath(HtmlNews_ImagesUri);
		String[] fileType = { ".gif", ".png", ".jpg", ".jpeg", ".bmp" };
		up.setAllowFiles(fileType);
		up.setMaxSize(10000); // 单位KB
		try {
			up.upload();
		} catch (Exception e) {
			System.err.println("新闻图片文件上传失败：NewsController.getNewsUplodeImageManagerAction()");
		}
		String callback = request.getParameter("callback");
		String result = "{\"name\":\"" + up.getFileName() + "\", \"originalName\": \"" + up.getOriginalName()
				+ "\", \"size\": " + up.getSize() + ", \"state\": \"" + up.getState() + "\", \"type\": \""
				+ up.getType() + "\", \"url\": \"" + up.getUrl() + "\"}";
		result = result.replaceAll("\\\\", "\\\\");
		/*
		 * PrintWriter pw=null; try { pw = response.getWriter(); } catch
		 * (IOException e) { System.err.println(
		 * "获取response.getWriter()输出流时出错：NewsController.getNewsUplodeImageManagerAction()"
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
	 * 获取 添加新闻 页面
	 */
	@RequestMapping(value = "news/news-newsList-addnew/add", method = RequestMethod.POST)
	public String getNewsAddNewAddManagerAction(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			System.err.println("对请求设定编码时出错：NewsController.getNewsUplodeImageManagerAction()");
		}
		String newsnewTitle = request.getParameter("newsnewTitle");
		if (newsnewTitle != null && !"".equals(newsnewTitle)) { // 表示要添加一个新的文章了
			String newscateIdString = request.getParameter("newscateId");
			// 判断文章类别是否存在
			Integer newscateId = new Integer(0);
			try {
				newscateId = Integer.parseInt(newscateIdString);
			} catch (NumberFormatException e) {
				// 说明传过来的newsCateId无法转为整数型
				request.setAttribute("msg", "修改失败，新闻类别有误");
				request.setAttribute("nextUrl", "/news/news-newsList-addnew");
				return "jsp/passMessage";
			}
			// 查询一下是否有这个新闻类别
			if (newscateId == null || newsServiceImpl.selectNewsCategoryByPrimaryKey(newscateId) == null) {
				request.setAttribute("msg", "修改失败，新闻类别不存在");
				request.setAttribute("nextUrl", "/news/news-newsList-addnew");
				return "jsp/passMessage";
			}
			String newsnewHtmlContent = request.getParameter("newsnewHtmlContent");
			String newsnewBrief = request.getParameter("newsnewBrief");
			// 对文档解码
			String newsnewHtmlContentString = "";
			try {
				// 双解码
				newsnewHtmlContentString = URLDecoder.decode(newsnewHtmlContent, "utf-8");
				newsnewHtmlContentString = URLDecoder.decode(newsnewHtmlContentString, "utf-8");
				newsnewBrief = URLDecoder.decode(newsnewBrief, "utf-8");
				newsnewBrief = URLDecoder.decode(newsnewBrief, "utf-8");
			} catch (UnsupportedEncodingException e1) {
				System.err.println("新建文章解码失败：文章如下【");
				System.err.println(newsnewHtmlContent + "】");
				request.setAttribute("msg", "添加失败，文章内容解码错误");
				request.setAttribute("nextUrl", "/news/news-newsList-addnew");
				return "jsp/passMessage";
			}
			// 开始存储html文件
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
				request.setAttribute("msg", "添加失败，文章内容保存失败");
				request.setAttribute("nextUrl", "/news/news-newsList-addnew");
				return "jsp/passMessage";
			}
			// 这里应该对文章中的图片进行一些操作的

			// 开始保存新闻
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
				request.setAttribute("msg", "添加成功");
			} else {
				request.setAttribute("msg", "添加失败，请稍后再试");
			}
			request.setAttribute("nextUrl", "/news/news-newsList-addnew");
			return "jsp/passMessage";
		} else {
			request.setAttribute("msg", "添加失败，文章标题不能为空");
			request.setAttribute("nextUrl", "/news/news-newsList-addnew");
			return "jsp/passMessage";
		}
	}

	/**
	 * 获取 添加新闻 页面
	 */
	@RequestMapping(value = "news/news-newsList-addnew", method = RequestMethod.GET)
	public String getNewsAddNewManagerAction(HttpServletRequest request) {
		// 设置文章类别Id
		List<NewsCategory> cateList = newsServiceImpl.selectNewsCategory(null);
		request.setAttribute("cateList", cateList);
		return "behind/news/news-newsList-addnew";
	}

	/**
	 * 获取 新闻编辑 页面
	 */
	@RequestMapping(value = "news/news-newsList-editnew", method = RequestMethod.GET)
	public String getNewsEditNewManagerAction(HttpServletRequest request) {
		Integer newsnewId = null;
		try {
			newsnewId = Integer.parseInt(request.getParameter("newsnewId"));
		} catch (NumberFormatException e) {

		}
		if (newsnewId == null) {
			request.setAttribute("msg", "新闻Id有误");
			request.setAttribute("nextUrl", "/news/news-newsList");
			return "jsp/passMessage";
		} else {
			// 先判断一下这个新闻是不是存在
			NewsNew newsNew = null;
			newsNew = newsServiceImpl.selectNewsNewByPrimaryKey(newsnewId);
			if (newsNew == null) {
				request.setAttribute("msg", "修改失败，新闻不存在");
				request.setAttribute("nextUrl", "/news/news-newsList");
				return "jsp/passMessage";
			} else {
				// 设置文章类别Id
				List<NewsCategory> cateList = newsServiceImpl.selectNewsCategory(null);
				request.setAttribute("cateList", cateList);
				request.setAttribute("newsNew", newsNew);
				return "behind/news/news-newsList-editnew";
			}
		}
	}

	/**
	 * 获取 新闻编辑 提交
	 */
	@RequestMapping(value = "news/news-newsList-editnew/edit", method = RequestMethod.POST)
	public String getNewsEditNewEditManagerAction(HttpServletRequest request) {
		Integer newsnewId = null;
		try {
			newsnewId = Integer.parseInt(request.getParameter("newsnewId"));
		} catch (NumberFormatException e) {
		}
		if (newsnewId == null) {
			request.setAttribute("msg", "新闻Id有误");
			request.setAttribute("nextUrl", "/news/news-newsList");
			return "jsp/passMessage";
		} else {
			// 先判断一下这个新闻是不是存在
			NewsNew newsNew = null;
			newsNew = newsServiceImpl.selectNewsNewByPrimaryKey(newsnewId);
			if (newsNew == null) {
				request.setAttribute("msg", "修改失败，新闻不存在");
				request.setAttribute("nextUrl", "/news/news-newsList");
				return "jsp/passMessage";
			}
			String newsnewTitle = request.getParameter("newsnewTitle");
			if (newsnewTitle == null || "".equals(newsnewTitle)) { // 表示才进入了编辑界面
				request.setAttribute("msg", "修改失败，新闻标题不能为空");
				request.setAttribute("nextUrl", "/news/news-newsList-editnew?newsnewId=" + newsnewId);
				return "jsp/passMessage";
			} else { // 表示要提交修改这个新闻了
				String newscateIdString = request.getParameter("newscateId");
				Integer newscateId = new Integer(0);
				try {
					newscateId = Integer.parseInt(newscateIdString);
				} catch (NumberFormatException e) {
					// 说明传过来的newsCateId无法转为整数型
					request.setAttribute("msg", "修改失败，新闻类别有误");
					request.setAttribute("nextUrl", "/news/news-newsList-editnew?newsnewId=" + newsnewId);
					return "jsp/passMessage";
				}
				// 查询一下是否有这个新闻类别
				if (newscateId == null || newsServiceImpl.selectNewsCategoryByPrimaryKey(newscateId) == null) {
					request.setAttribute("msg", "修改失败，新闻类别不存在");
					request.setAttribute("nextUrl", "/news/news-newsList-editnew?newsnewId=" + newsnewId);
					return "jsp/passMessage";
				}
				String newsnewHtmlContent = request.getParameter("newsnewHtmlContent");
				String newsnewBrief = request.getParameter("newsnewBrief");
				// 对文档解码
				String newsnewHtmlContentString = "";
				try {
					// 双解码
					newsnewHtmlContentString = URLDecoder.decode(newsnewHtmlContent, "utf-8");
					newsnewHtmlContentString = URLDecoder.decode(newsnewHtmlContentString, "utf-8");
					newsnewBrief = URLDecoder.decode(newsnewBrief, "utf-8");
					newsnewBrief = URLDecoder.decode(newsnewBrief, "utf-8");
				} catch (UnsupportedEncodingException e1) {
					System.err.println("文章解码失败：newsNew.newsnewId=" + newsnewId + " 文章如下【");
					System.err.println(newsnewHtmlContent + "】");
					request.setAttribute("msg", "修改失败，文章内容解码错误");
					request.setAttribute("nextUrl", "/news/news-newsList-editnew?newsnewId=" + newsnewId);
					return "jsp/passMessage";
				}
				// 开始存储html文件
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
					request.setAttribute("msg", "修改失败，文章内容保存失败");
					request.setAttribute("nextUrl", "/news/news-newsList-editnew?newsnewId=" + newsnewId);
					return "jsp/passMessage";
				}
				// 这里应该对文章中的图片进行一些操作的

				// 开始保存新闻
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
					request.setAttribute("msg", "修改成功");
				} else {
					request.setAttribute("msg", "修改失败，请稍后再试");
				}
				request.setAttribute("nextUrl", "/news/news-newsList-editnew?newsnewId=" + newsnewId);
				return "jsp/passMessage";
			}
		}
	}

	/**
	 * 新闻 删除
	 */
	@RequestMapping("news/news-new/delete")
	public String getNewsNewDeleteManagerAction(HttpServletRequest request) {
		String newsNewIds = request.getParameter("newsNewIds").trim();
		if (newsNewIds.contains(":")) {// 说明是批量删除
			boolean deletedOne = false;
			Integer newsNewId = null;
			for (String newscateIdString : newsNewIds.split(":")) {
				try {
					newsNewId = Integer.parseInt(newscateIdString);
				} catch (NumberFormatException e) {
					request.setAttribute("msg", "删除失败，新闻Id为空");
					request.setAttribute("nextUrl", "/news/news-newsList");
					return "jsp/passMessage";
				}
				NewsNew newsNew = newsServiceImpl.selectNewsNewByPrimaryKey(newsNewId);
				if (newsNew == null) {
					request.setAttribute("msg", "新闻不存在");
					request.setAttribute("nextUrl", "/news/news-newsList");
					return "jsp/passMessage";
				}
				// 删除文件
				String htmlFilePath = base_WebContentPath + newsNew.getNewsnewHtmluri();
				File htmlFile = new File(htmlFilePath);
				if (htmlFile.exists()) {
					if (!htmlFile.delete()) {
						System.err.println("新闻文件删除失败:htmlFilePath=" + htmlFilePath);
					}
				}
				int result = newsServiceImpl.removeNewsNew(newsNewId);
				if (result > 0) {
					deletedOne = true;
				}
			}
			if (deletedOne) {
				request.setAttribute("msg", "删除完成");
			} else {
				request.setAttribute("msg", "删除失败，请稍后再试");
			}
			request.setAttribute("nextUrl", "/news/news-newsList");
			return "jsp/passMessage";
		} else {
			Integer newsNewId = null;
			try {
				newsNewId = Integer.parseInt(newsNewIds);
			} catch (NumberFormatException e) {
				request.setAttribute("msg", "删除失败，新闻Id为空");
				request.setAttribute("nextUrl", "/news/news-newsList");
				return "jsp/passMessage";
			}
			NewsNew newsNew = newsServiceImpl.selectNewsNewByPrimaryKey(newsNewId);
			if (newsNew == null) {
				request.setAttribute("msg", "新闻不存在");
				request.setAttribute("nextUrl", "/news/news-newsList");
				return "jsp/passMessage";
			}
			// 删除文件
			String htmlFilePath = base_WebContentPath + newsNew.getNewsnewHtmluri();
			File htmlFile = new File(htmlFilePath);
			if (htmlFile.exists()) {
				if (!htmlFile.delete()) {
					System.err.println("新闻文件删除失败:htmlFilePath=" + htmlFilePath);
				}
			}
			int result = newsServiceImpl.removeNewsNew(newsNewId);
			if (result > 0) {
				request.setAttribute("msg", "删除成功");
			} else {
				request.setAttribute("msg", "删除失败，请稍后再试");
			}
			request.setAttribute("nextUrl", "/news/news-newsList");
			return "jsp/passMessage";
		}
	}

	/************************ 其他新闻界面 *********************************/

	/**
	 * 新闻 联系我们
	 */
	@RequestMapping("/News/NewsContact")
	public String getNewsContactAction(HttpServletRequest request) {
		// 设定新闻类别列表
		NewsCategoryExample newsCategoryExample = new NewsCategoryExample();
		NewsCategoryExample.Criteria criteria2 = newsCategoryExample.createCriteria();
		criteria2.andNewscateMarkEqualTo(NewsCategoryShowTypeEnum.show_news_index.toString());
		List<NewsCategory> newsCategory = newsServiceImpl.selectNewsCategory(newsCategoryExample);
		// 显示的新闻类别列表
		request.setAttribute("newsCategory", newsCategory);
		return "behind/news/NewsContact";
	}

	/**
	 * 新闻 合作公司
	 */
	@RequestMapping("/News/Company")
	public String getNewsCompanyAction(HttpServletRequest request) {
		// 设定新闻类别列表
		NewsCategoryExample newsCategoryExample = new NewsCategoryExample();
		NewsCategoryExample.Criteria criteria2 = newsCategoryExample.createCriteria();
		criteria2.andNewscateMarkEqualTo(NewsCategoryShowTypeEnum.show_news_index.toString());
		List<NewsCategory> newsCategory = newsServiceImpl.selectNewsCategory(newsCategoryExample);
		// 显示的新闻类别列表
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
