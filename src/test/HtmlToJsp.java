package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 把Html文件转成Jsp
 * <br/><br/>
 * 支持深层文件夹遍历
 */
public class HtmlToJsp {

	public static void main(String[] args) {

		// 这里写放html文件的文件夹地址
		String filepath = "E:\\CreateSoft Tool\\eclipse\\workspace-work\\sc\\WebContent\\ChengWorkFloder\\New";

		//是否删除原html文件
		boolean deleteHtml=false;
		
		
		
		mUtil util = new mUtil();
		util.htmlToJsp(new File(filepath),deleteHtml);
		System.out.println("完成");
	}
}



















class mUtil {
	String headString = "<%@ page language=\"java\" contentType=\"text/html; charset=UTF-8\" pageEncoding=\"UTF-8\"%>\r\n";
	String okString="<%@ page language=\"java\" contentType=\"text/html; charset=UTF-8\" pageEncoding=\"UTF-8\"%>\r\n";
	public void htmlToJsp(File files,boolean deleteHtml) {
		if (files.isDirectory()) {
			File floder = files;
			for (File file : floder.listFiles()) {
				if (file.isDirectory()) {
					htmlToJsp(file,deleteHtml);
				} else {
					String filename = file.getName();
					if (filename.endsWith(".html")) {
						try {
							FileInputStream fis = new FileInputStream(file);
							InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
							BufferedReader br = new BufferedReader(isr);
							String line = null;
							while ((line = br.readLine()) != null) {
								okString += line;
								okString += "\r\n"; // 补上换行符
							}
							isr.close();
							fis.close();
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(deleteHtml){
							System.out.println(file.delete());
						}
						File exitfile=new File(file.getAbsolutePath().replace(".html", ".jsp"));
						if(exitfile.exists()){
							exitfile.delete();
						}
						try {
							FileOutputStream fos = new FileOutputStream(exitfile);
							OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
							osw.write(okString);
							osw.flush();
							osw.close();
							fos.close();
							okString=headString.substring(0);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}