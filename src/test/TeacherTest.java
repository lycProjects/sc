package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pdsu.sc.mapper.JlruleMapper;
import com.pdsu.sc.mapper.StudentMapper;
import com.pdsu.sc.mapper.TeacherMapper;
import com.pdsu.sc.po.Jlrule;
import com.pdsu.sc.po.Student;
import com.pdsu.sc.po.Teacher;
import com.pdsu.sc.service.JlruleService;

public class TeacherTest {
	 private ApplicationContext applicationContext;
		
		private TeacherMapper teacherMapper;

		//在setUp这个方法得到spring容器
		@Before
		public void setUp() throws Exception {
			applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext*.xml");
			teacherMapper = (TeacherMapper) applicationContext.getBean("teacherMapper");
		}


		@Test
		public void test() {
			Teacher list=teacherMapper.selectByPrimaryKey(14);
			System.out.println(list);
		}
}
