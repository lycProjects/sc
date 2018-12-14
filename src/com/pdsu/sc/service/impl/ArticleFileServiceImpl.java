package com.pdsu.sc.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.tomcat.jni.Directory;
import org.springframework.stereotype.Service;

import com.pdsu.sc.controller.project.company.ProjectShopCompanyController;
import com.pdsu.sc.news.util.NewsNewUtil;
import com.pdsu.sc.service.ArticleFileService;

@Service
public class ArticleFileServiceImpl implements ArticleFileService {
	/** web目录：包含了项目名称 **/
	private static String webPath = NewsNewUtil.getWebAppsRealPath("");
	/** 默认的文章位置 **/
	private static final String DEFAULT_ARTICLE_URI = "/DataFile/articles/";

	@Override
	public String addArticleFile(String articleFileParentUri, String articleContent) {
		if (articleFileParentUri == null) {
			articleFileParentUri = DEFAULT_ARTICLE_URI;
		}
		if (!(articleFileParentUri.startsWith("/") && articleFileParentUri.endsWith("/"))) {
			System.err.println(
					"com.pdsu.sc.service.impl.ArticleFileServiceImpl->addArticleFile:参数articleFileParentUri不合法");
			return "参数articleFileParentUri不合法";
		}
		// 开始存储html文件
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");
		String htmlFileFloderName = sdf.format(date) + (new Random()).nextInt(1000);
		String articleHtmluri = articleFileParentUri + htmlFileFloderName + "/index.html";
		String htmlFilePath = NewsNewUtil.getWebAppsRealPath(articleHtmluri);
		File htmlFile = new File(htmlFilePath);
		File htmlFileFloder=htmlFile.getParentFile();
		htmlFileFloder.mkdirs();
		try {
			FileOutputStream fos = new FileOutputStream(htmlFile);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			osw.write(articleContent);
			osw.flush();
			osw.close();
			fos.close();
		} catch (IOException e) {
			System.err.println(
					"com.pdsu.sc.service.impl.ArticleFileServiceImpl->addArticleFile 文章保存失败：" + e.getMessage());
			return "文章内容保存失败";
		}
		return articleHtmluri;
	}

	@Override
	public String readArticleFile(String articleHtmlUri) {
		if (articleHtmlUri == null) {
			return null;
		}
		String htmlFilePath = NewsNewUtil.getWebAppsRealPath(articleHtmlUri);
		File htmlFile = new File(htmlFilePath);
		if (!htmlFile.exists()) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		try {
			FileInputStream fis = new FileInputStream(htmlFile);
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			char[] tempchars = new char[30];
			int charread = 0;
			while ((charread = isr.read(tempchars)) != -1) {
				// 同样屏蔽掉\r不显示
				if ((charread == tempchars.length) && (tempchars[tempchars.length - 1] != '\r')) {
					sb.append(tempchars);
				} else {
					for (int i = 0; i < charread; i++) {
						if (tempchars[i] == '\r') {
							continue;
						} else {
							sb.append(tempchars[i]);
						}
					}
				}
			}
		} catch (Exception e) {
			return null;
		}
		return sb.toString();
	}

	@Override
	public String updateArticleFile(String articleHtmlUri, String articleContent) {
		String htmlFilePath = NewsNewUtil.getWebAppsRealPath(articleHtmlUri);
		File htmlFile = new File(htmlFilePath);
		htmlFile.deleteOnExit();
		htmlFile.getParentFile().mkdirs();
		try {
			FileOutputStream fos = new FileOutputStream(htmlFile);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			osw.write(articleContent);
			osw.flush();
			osw.close();
			fos.close();
		} catch (IOException e) {
			System.err.println(
					"com.pdsu.sc.service.impl.ArticleFileServiceImpl->updateArticleFile 文章保存失败：" + e.getMessage());
			return "文章内容保存失败";
		}
		return "success";
	}

	@Override
	public String deleteArticleFile(String articleHtmlUri) {
		File htmlFile = new File(articleHtmlUri);
		File floderFile = htmlFile.getParentFile();
		if (floderFile != null) {
			if (floderFile.delete()) {
				return "success";
			}
			return "删除失败";
		}
		return "文件不存在";
	}
}
