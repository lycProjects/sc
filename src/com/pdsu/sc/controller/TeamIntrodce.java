package com.pdsu.sc.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pdsu.sc.news.util.NewsNewUtil;
import com.pdsu.sc.po.NewsNew;
import com.pdsu.sc.po.NewsNewExample;
import com.pdsu.sc.service.NewsService;

@Controller
public class TeamIntrodce {
	@Autowired
	private NewsService newsServiceImpl;
	// 默认的 团队文章类别id
	private static final Integer DEFAULT_GROUP_CATEGORY_ID = 2;
	// 默认的 公告类别id
	private static final Integer DEFAULT_ANNOUNCEMENT_CATEGORY_ID = 1;
	// 默认的 公告类文章数量
	private static final Integer DEFAULT_ANNOUNCEMENT_CATEGORY_LIST_COUNT = 6;
	// 默认的 新闻类别id
	private static final Integer DEFAULT_NEWSEST_CATEGORY_ID = 3;
	// 默认的 新闻类新闻数量
	private static final Integer DEFAULT_NEWSEST_CATEGORY_LIST_COUNT = 6;

	/**
	 * 获取 团队列表展示页
	 */
	@RequestMapping("/team/teamIntrodce")
	public String getTeamIntodcePage(HttpServletRequest request) {
		// 获取公告
		NewsNewExample newsNewExample_announ = new NewsNewExample();
		newsNewExample_announ
				.setOrderByClause("newsnew_pubTime DESC LIMIT 0," + DEFAULT_ANNOUNCEMENT_CATEGORY_LIST_COUNT);
		NewsNewExample.Criteria criteria_announ = newsNewExample_announ.createCriteria();
		criteria_announ.andNewscateIdEqualTo(DEFAULT_ANNOUNCEMENT_CATEGORY_ID);
		List<NewsNew> list_announ = newsServiceImpl.selectNewsNew(newsNewExample_announ);
		// 获取新闻
		NewsNewExample newsNewExample_news = new NewsNewExample();
		newsNewExample_news.setOrderByClause("newsnew_pubTime DESC LIMIT 0," + DEFAULT_NEWSEST_CATEGORY_LIST_COUNT);
		NewsNewExample.Criteria criteria_news = newsNewExample_news.createCriteria();
		criteria_news.andNewscateIdEqualTo(DEFAULT_NEWSEST_CATEGORY_ID);
		List<NewsNew> list_news = newsServiceImpl.selectNewsNew(newsNewExample_news);
		// 获取团队介绍
		NewsNewExample newsNewExample = new NewsNewExample();
		NewsNewExample.Criteria criteria = newsNewExample.createCriteria();
		criteria.andNewscateIdEqualTo(DEFAULT_GROUP_CATEGORY_ID);
		List<NewsNew> list = newsServiceImpl.selectNewsNew(newsNewExample);
		List<NewsNew> newsNewList = new ArrayList<NewsNew>();
		// 对文章图片地址的提取
		//String getPicResult="";
		NewsNewUtil newsNewUtil = null;
		for (NewsNew mNewsNew : list) {
			newsNewUtil = new NewsNewUtil(mNewsNew);
			if (newsNewUtil.isGetPictureOk()) {
				mNewsNew.setImageUrl(newsNewUtil.getPictureUrl());
				newsNewList.add(mNewsNew);
			}else{
				mNewsNew.setImageUrl("/sc/DataFile/news/demo/images/noPic.png");
				newsNewList.add(mNewsNew);
			}
			//getPicResult=getPicResult+newsNewUtil.getMsg()+"|";
		}
		int listRowsCount = 0;
		if (newsNewList != null) {
			BigDecimal bd = new BigDecimal(newsNewList.size());
			bd = bd.divide(new BigDecimal(2));
			listRowsCount = bd.add(new BigDecimal(0.5)).intValue();
		}
		// 添加数据到前台
		request.setAttribute("listRowsCount", listRowsCount);
		request.setAttribute("newsNewList", newsNewList);
		request.setAttribute("list_announ", list_announ);
		request.setAttribute("list_news", list_news);
		//request.setAttribute("getPicResult", getPicResult);
		return "behind/team/teamIntrodce";
	}

	/**
	 * 获取 团队介绍页
	 */
	@RequestMapping("/team/teamShow/{newsnewid}")
	public String getTeamShwoPage(@PathVariable("newsnewid") String newsnewidString, HttpServletRequest request) {
		Integer newsnewId = null;
		try {
			newsnewId = Integer.parseInt(newsnewidString);
		} catch (NumberFormatException e) {
		}
		if (newsnewId == null) {
			return "behind/404";
		} else {
			// 先判断一下这个新闻是不是存在
			NewsNew newsNew = null;
			newsNew = newsServiceImpl.selectNewsNewByPrimaryKey(newsnewId);
			if (newsNew == null) {
				return "behind/404";
			} else {// 输出新闻内容
				// 获取公告
				NewsNewExample newsNewExample_announ = new NewsNewExample();
				newsNewExample_announ
						.setOrderByClause("newsnew_pubTime DESC LIMIT 0," + DEFAULT_ANNOUNCEMENT_CATEGORY_LIST_COUNT);
				NewsNewExample.Criteria criteria_announ = newsNewExample_announ.createCriteria();
				criteria_announ.andNewscateIdEqualTo(DEFAULT_ANNOUNCEMENT_CATEGORY_ID);
				List<NewsNew> list_announ = newsServiceImpl.selectNewsNew(newsNewExample_announ);
				// 获取新闻列表的新闻
				NewsNewExample newsNewExample_news = new NewsNewExample();
				newsNewExample_news
						.setOrderByClause("newsnew_pubTime DESC LIMIT 0," + DEFAULT_NEWSEST_CATEGORY_LIST_COUNT);
				NewsNewExample.Criteria criteria_news = newsNewExample_news.createCriteria();
				criteria_news.andNewscateIdEqualTo(DEFAULT_NEWSEST_CATEGORY_ID);
				List<NewsNew> list_news = newsServiceImpl.selectNewsNew(newsNewExample_news);
				// 添加数据到前台
				request.setAttribute("newsNew", newsNew);
				request.setAttribute("list_announ", list_announ);
				request.setAttribute("list_news", list_news);
				return "behind/team/teamShow";
			}
		}
	}
}
