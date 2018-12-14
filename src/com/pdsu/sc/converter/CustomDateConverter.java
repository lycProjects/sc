package com.pdsu.sc.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 日期转换器
 * @author lenovo
 *
 */
public class CustomDateConverter implements Converter<String,Date> {

	@Override
	public Date convert(String source) {
		//实现将日期串转换成日期类型（格式：yyyy-MM HH:mm:ss）
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		try {
			//如果参数绑定（类型转换）成功直接返回
			return simpleDateFormat.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//不成功返回null
		return null;
	}

}
