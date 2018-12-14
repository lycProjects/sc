package com.pdsu.sc.service;

/**
 * 文章文件服务接口
 */
public interface ArticleFileService {
	
	/**
	 * 添加文章
	 * @param articleFileParentUri		/文章父目录Uri/
	 * @param articleContent 			文章内容
	 * @return 成功：/文章uri <br/>失败：failure message
	 * @注意
	 * 参数：第一个参数articleFileParentUri应该是以'/'开头和结尾的，若为null则为默认"/DataFile/articles/"
	 * <br/>结果：只需判断开头是不是'/'，就可以知道成功与否
	 */
	public String addArticleFile(String articleFileParentUri,String articleContent);
	
	/**
	 * 读取文章原内容
	 * @param articleHtmlUri /文章地址uri.html
	 * @return 成功：文章内容
	 * <br/>失败：null 文章内容不存在
	 */
	public String readArticleFile(String articleHtmlUri);
	
	/**
	 * 更新文章内容
	 * @param articleHtmlUri	/文章Uri.html
	 * @param articleContent	文章内容
	 * @return 成功：success <br/>失败：failure message
	 */
	public String updateArticleFile(String articleHtmlUri,String articleContent);
	
	/**
	 * 删除文章文件
	 * @param articleHtmlUri /文章Uri.html
	 * @return 成功：success <br/>失败：failure message
	 */
	public String deleteArticleFile(String articleHtmlUri);
}
