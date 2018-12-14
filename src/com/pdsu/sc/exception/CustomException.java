package com.pdsu.sc.exception;

/**
* @ClassName: CustomException
* @Description: 系统自定义异常，针对预期的异常，需要在程序中抛出此异常类
* @author 李勇超
* @date 2018年8月26日上午9:18:40
*
*/
public class CustomException extends Exception {
	
	/**
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = -8803760981310842384L;
	//异常信息
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
