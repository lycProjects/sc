package com.pdsu.sc.exception;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomExceptionResolver //implements HandlerExceptionResolver 
{

	//@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		CustomException customException=null;
		if(ex instanceof CustomException) {
			customException=(CustomException)ex;
		}else {
			customException=new CustomException("δ֪����,���ڹ���Ա��ϵ������");
		}
		//������Ϣ
		String message=customException.getMessage();
		
		ModelAndView modelAndView=new ModelAndView();
		
		//��������Ϣ����ҳ��
		modelAndView.addObject("message",message);
		
		//ָ�����ҳ��
		modelAndView.setViewName("common/error");
		
		return modelAndView;
	}

}
