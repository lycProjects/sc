package com.pdsu.sc.service;

/**
 * �����ļ�����ӿ�
 */
public interface ArticleFileService {
	
	/**
	 * �������
	 * @param articleFileParentUri		/���¸�Ŀ¼Uri/
	 * @param articleContent 			��������
	 * @return �ɹ���/����uri <br/>ʧ�ܣ�failure message
	 * @ע��
	 * ��������һ������articleFileParentUriӦ������'/'��ͷ�ͽ�β�ģ���Ϊnull��ΪĬ��"/DataFile/articles/"
	 * <br/>�����ֻ���жϿ�ͷ�ǲ���'/'���Ϳ���֪���ɹ����
	 */
	public String addArticleFile(String articleFileParentUri,String articleContent);
	
	/**
	 * ��ȡ����ԭ����
	 * @param articleHtmlUri /���µ�ַuri.html
	 * @return �ɹ�����������
	 * <br/>ʧ�ܣ�null �������ݲ�����
	 */
	public String readArticleFile(String articleHtmlUri);
	
	/**
	 * ������������
	 * @param articleHtmlUri	/����Uri.html
	 * @param articleContent	��������
	 * @return �ɹ���success <br/>ʧ�ܣ�failure message
	 */
	public String updateArticleFile(String articleHtmlUri,String articleContent);
	
	/**
	 * ɾ�������ļ�
	 * @param articleHtmlUri /����Uri.html
	 * @return �ɹ���success <br/>ʧ�ܣ�failure message
	 */
	public String deleteArticleFile(String articleHtmlUri);
}
