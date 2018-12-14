package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pdsu.sc.mapper.LoginMapper;
import com.pdsu.sc.po.Login;


public class loginTest {
	 private ApplicationContext applicationContext;
		
		private LoginMapper loginMapper;

		//在setUp这个方法得到spring容器
		@Before
		public void setUp() throws Exception {
			applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext*.xml");
			loginMapper = (LoginMapper) applicationContext.getBean("loginMapper");
		}


		@Test
		public void test() {
//			Login login=new Login(1,"liyongchao","123456");
//			Login result=loginMapper.loginbackground(login);
//			if(result==null) {
//				System.out.println("请认真核对账号、密码！");
//			}
//			else {
//				System.out.println("登录成功！");
//			}
		}
}
