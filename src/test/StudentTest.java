package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pdsu.sc.mapper.JlruleMapper;
import com.pdsu.sc.mapper.StudentMapper;
import com.pdsu.sc.po.Jlrule;
import com.pdsu.sc.po.Student;
import com.pdsu.sc.service.JlruleService;

public class StudentTest {
	 private ApplicationContext applicationContext;
		
		private StudentMapper studentMapper;

		//��setUp��������õ�spring����
		@Before
		public void setUp() throws Exception {
			applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext*.xml");
			studentMapper = (StudentMapper) applicationContext.getBean("studentMapper");
		}


		@Test
		public void test() {
			List<Student> list=studentMapper.queryStudentAll();
			for(Student student:list)
			{
			  System.out.println(student);
			}
		}
		@Test
		public void test1() {
			List<Student> list1=studentMapper.queryTeamStudentAll("T-Group������");
			for(Student student:list1)
			{
			  System.out.println(student);
			}
		}
}
