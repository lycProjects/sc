package com.pdsu.sc.exception;

/**
* @ClassName: CustomException
* @Description: ϵͳ�Զ����쳣�����Ԥ�ڵ��쳣����Ҫ�ڳ������׳����쳣��
* @author ���³�
* @date 2018��8��26������9:18:40
*
*/
public class CustomException extends Exception {
	
	/**
	* @Fields serialVersionUID : TODO(��һ�仰�������������ʾʲô)
	*/
	private static final long serialVersionUID = -8803760981310842384L;
	//�쳣��Ϣ
	public String message;
	
	public CustomException(String message) {
		super(message);
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
		
}
