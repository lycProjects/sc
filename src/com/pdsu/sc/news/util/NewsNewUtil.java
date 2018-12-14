package com.pdsu.sc.news.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.pdsu.sc.po.NewsNew;

public class NewsNewUtil {
	
	private NewsNew newsNew;
	private String newContent="";
	private boolean getPictureOk=false;//�Ƿ���ȡ��ͼƬ
	private boolean containPicture=false;//�Ƿ����ͼƬ
	private String msg;//�������˵��
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
			this.msg="html�ļ�������path="+htmlFilepath;
			return;
		}
		if(htmlFile.isDirectory()){
			this.getPictureOk=false;
			this.msg="Ŀ��Ŀ¼��Ϊhtml�ļ�";
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
			this.msg="��ȡ�ļ�����ʧ��";
		}
		return sb.toString();
	}
	
	private void getPictureFromContent(){
		if(newContent.contains("<img")){
			getPictureByType("<img");
		}else if(newContent.contains("<image")){
			getPictureByType("<image");
		}else{
			this.msg="��ͼƬ";
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
			this.msg="ͼƬ��ַ������";
			return;
		}
		
		String imgSrcContent=imgContent.substring(imgSrcStartIndex+5);
		
		//System.err.println("imgSrcContent="+imgSrcContent);
		
		int imgSrcEndIndex=10000;//��ֹ�����5�е� imgSrcContent.indexOf("\"") ���� imgSrcEndIndex ʱ����ֵ
		if(imgSrcContent.indexOf("'")!=-1){
			imgSrcEndIndex=imgSrcContent.indexOf("'");
		}
		if(imgSrcContent.indexOf("\"")!=-1){
			if(imgSrcContent.indexOf("\"")<imgSrcEndIndex){
				imgSrcEndIndex=imgSrcContent.indexOf("\"");
			}
		}
		if(imgSrcEndIndex==10000){
			this.msg=picType.substring(1)+"ͼƬ��ַ������";
			return;
		}
		this.pictureUrl=imgSrcContent.substring(0, imgSrcEndIndex);
		
		//System.err.println("pictureUrl="+pictureUrl);
		
		if(this.pictureUrl!=null&&!"".equals(this.pictureUrl)){
			this.getPictureOk=true;
			this.msg="���";
		}
	}
	
	public static String getWebAppsRealPath(String uri){
		String classpath=Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String rootPath="";
		
		//�ж����ڷ�����������Eclipse����
		if(classpath.contains("WEB-INF")){//�ڷ����� ȥ��\sc\WEB-INF\classes
			classpath=classpath.substring(0,classpath.length()-17);
		}else{//��Eclipse���� ȥ��\sc\build\classes\
			classpath=classpath.substring(0,classpath.length()-16);
		}
		
		//windowsϵͳ��
		if("\\".equals(File.separator)){
			rootPath=(classpath+uri).replaceAll("/", "\\\\");
			if(rootPath.substring(0, 1).equals("\\")){
				rootPath=rootPath.substring(1);
			}
		}
		//linuxϵͳ��
		if("/".equals(File.separator)){
			rootPath=(classpath+uri).replaceAll("\\\\", "/");
		}
		
		
		return rootPath;
	}
	
	public static void main(String[] args) {
		//System.out.println(localPath+"\n"+NewsNewUtil.getWebAppsRealPath(""));
	}
}
