package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pdsu.sc.mapper.JlruleMapper;
import com.pdsu.sc.po.Jlrule;
import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.service.JlruleService;

public class JlruleTest {
    private ApplicationContext applicationContext;
	
	private JlruleMapper jlruleMapper;
	
	private JlruleService jlruleService;

	//在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext*.xml");
		jlruleMapper = (JlruleMapper) applicationContext.getBean("jlruleMapper");
	}


	@Test
	public void test() {
		List<Jlrule> list=jlruleMapper.queryJlruleAll();
		for(Jlrule jlrule:list)
		{
		  System.out.println(jlrule);
		}
	}
	@Test
	public void test1() throws Exception {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		date=dateFormat.parse("2018-3-21");
		Jlrule jlrule=new Jlrule();
	    jlrule.setJlId(1);
	    jlrule.setJlRecode("穿拖鞋");
	    jlrule.setJlTime(date);
	    jlruleMapper.updateByPrimaryKeySelective(jlrule);
			
	}

}
