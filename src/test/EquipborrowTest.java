package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pdsu.sc.mapper.EquipMapper;
import com.pdsu.sc.mapper.EquipborrowMapper;
import com.pdsu.sc.po.Equip;
import com.pdsu.sc.po.Equipborrow;
import com.pdsu.sc.po.Teammapping;

public class EquipborrowTest {
private ApplicationContext applicationContext;
	
	private EquipborrowMapper equipborrowMapper;

	//在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext*.xml");
		equipborrowMapper = (EquipborrowMapper) applicationContext.getBean("equipborrowMapper");
	}


	@Test
	public void test() {
		List<Equipborrow> list=equipborrowMapper.queryAll();
		for(Equipborrow equipborrow:list)
		{
		  System.out.println(equipborrow);
		}
	}
	
	@Test
	public void test1() {
		Equipborrow equipborrow=new Equipborrow();
		equipborrow.setEqbTeam(1);
		equipborrow.setEqbZfour(1);
		int a=equipborrowMapper.insert(equipborrow);
		  System.out.println(a);
	}
}
