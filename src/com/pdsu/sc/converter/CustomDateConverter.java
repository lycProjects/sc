package com.pdsu.sc.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * ����ת����
 * @author lenovo
 *
 */
public class CustomDateConverter implements Converter<String,Date> {

	@Override
	public Date convert(String source) {
		//ʵ�ֽ����ڴ�ת�����������ͣ���ʽ��yyyy-MM HH:mm:ss��
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		try {
			//��������󶨣�����ת�����ɹ�ֱ�ӷ���
			return simpleDateFormat.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//���ɹ�����null
		return null;
	}

}
