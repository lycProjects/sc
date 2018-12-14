package com.pdsu.sc.news.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.pdsu.sc.po.NewsNew;

public class NewsNewUtil {
	
	private NewsNew newsNew;
	private String newContent="";
	private boolean getPictureOk=false;//是否提取出图片
	private boolean containPicture=false;//是否包含图片
	private String msg;//分析结果说明
	private File htmlFile;
	private String pictureUrl;
	private static final String localClassPath=NewsNewUtil.getWebAppsRealPath("");
	private static final String localPath=localClassPath;
	
	public String getNewContent() {
		return newContent;
	}

	public boolean isGetPictureOk() {
		return getPictureOk;
	}

	public boolean isContainPicture() {
		return containPicture;
	}

	public String getMsg() {
		return msg;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public NewsNewUtil(NewsNew newsNew){
		this.newsNew=newsNew;
		init();
	}
	
	private void init(){
		String htmlFilepath=NewsNewUtil.getWebAppsRealPath(this.newsNew.getNewsnewHtmluri());
		
		//System.err.println(htmlFilepath);
		
		htmlFile=new File(htmlFilepath);
		if(!htmlFile.exists()){
			this.getPictureOk=false;
			this.msg="html文件不存在path="+htmlFilepath;
			return;
		}
		if(htmlFile.isDirectory()){
			this.getPictureOk=false;
			this.msg="目标目录不为html文件";
			return;
		}
		this.newContent=getContentFromFile(htmlFile);
		getPictureFromContent();
	}
	
	private String getContentFromFile(File file){
		StringBuilder sb=new StringBuilder();
		try {
			FileReader fr=new FileReader(file);
			BufferedReader bReader=new BufferedReader(fr);
			String s="";
			while(( s=bReader.readLine() ) != null){
				sb.append(s);
			}
			bReader.close();
			fr.close();
		} catch (IOException e) {
			this.getPictureOk=false;
			this.msg="读取文件内容失败";
		}
		return sb.toString();
	}
	
	private void getPictureFromContent(){
		if(newContent.contains("<img")){
			getPictureByType("<img");
		}else if(newContent.contains("<image")){
			getPictureByType("<image");
		}else{
			this.msg="无图片";
		}
	}
	
	private void getPictureByType(String picType){
		this.containPicture=true;
		int imgStart=newContent.indexOf(picType);
		String imgContent0=newContent.substring(imgStart);
		
		//System.err.println("imgContent0="+imgContent0);
		
		int imgImgEndIndex=imgContent0.indexOf(">");
		String imgContent=imgContent0.substring(0,imgImgEndIndex);
		
		//System.err.println("imgContent="+imgContent);
		
		int imgSrcStartIndex=imgContent.indexOf("src=");
		
		if(imgSrcStartIndex<0){
			this.msg="图片地址不存在";
			return;
		}
		
		String imgSrcContent=imgContent.substring(imgSrcStartIndex+5);
		
		//System.err.println("imgSrcContent="+imgSrcContent);
		
		int imgSrcEndIndex=10000;//防止下面第5行的 imgSrcContent.indexOf("\"") 大于 imgSrcEndIndex 时不赋值
		if(imgSrcContent.indexOf("'")!=-1){
			imgSrcEndIndex=imgSrcContent.indexOf("'");
		}
		if(imgSrcContent.indexOf("\"")!=-1){
			if(imgSrcContent.indexOf("\"")<imgSrcEndIndex){
				imgSrcEndIndex=imgSrcContent.indexOf("\"");
			}
		}
		if(imgSrcEndIndex==10000){
			this.msg=picType.substring(1)+"图片地址不存在";
			return;
		}
		this.pictureUrl=imgSrcContent.substring(0, imgSrcEndIndex);
		
		//System.err.println("pictureUrl="+pictureUrl);
		
		if(this.pictureUrl!=null&&!"".equals(this.pictureUrl)){
			this.getPictureOk=true;
			this.msg="完成";
		}
	}
	
	public static String getWebAppsRealPath(String uri){
		String classpath=Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String rootPath="";
		
		//判断是在服务器还是在Eclipse测试
		if(classpath.contains("WEB-INF")){//在服务器 去掉\sc\WEB-INF\classes
			classpath=classpath.substring(0,classpath.length()-17);
		}else{//在Eclipse测试 去掉\sc\build\classes\
			classpath=classpath.substring(0,classpath.length()-16);
		}
		
		//windows系统下
		if("\\".equals(File.separator)){
			rootPath=(classpath+uri).replaceAll("/", "\\\\");
			if(rootPath.substring(0, 1).equals("\\")){
				rootPath=rootPath.substring(1);
			}
		}
		//linux系统下
		if("/".equals(File.separator)){
			rootPath=(classpath+uri).replaceAll("\\\\", "/");
		}
		
		
		return rootPath;
	}
	
	public static void main(String[] args) {
		//System.out.println(localPath+"\n"+NewsNewUtil.getWebAppsRealPath(""));
	}
}
