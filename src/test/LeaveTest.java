package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pdsu.sc.mapper.JlruleMapper;
import com.pdsu.sc.mapper.LeaveMapper;
import com.pdsu.sc.po.Leave;
import com.pdsu.sc.po.Teammapping;

public class LeaveTest {
private ApplicationContext applicationContext;
	
	private LeaveMapper leaveMapper;
	
	//在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext*.xml");
		leaveMapper = (LeaveMapper) applicationContext.getBean("leaveMapper");
	}


	@Test
	public void test() {
		Leave leave=new Leave();
		leave.setLeName("李四");
		leave.setLeTeam(1);
		leave.setLeTime(5);
		leaveMapper.insert(leave);
	}
	@Test
	public void test1() {
		List<Leave> list=leaveMapper.queryLeaveAll();
		for(Leave leave:list) {
			System.out.println(leave);
		}
	}

}
