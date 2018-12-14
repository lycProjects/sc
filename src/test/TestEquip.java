package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pdsu.sc.mapper.EquipMapper;
import com.pdsu.sc.po.Equip;





public class TestEquip {

private ApplicationContext applicationContext;
	
	private EquipMapper equipMapper;

	//在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext*.xml");
		equipMapper = (EquipMapper) applicationContext.getBean("equipMapper");
	}


	@Test
	public void test() {
		Equip equip=equipMapper.selectByPrimaryKey(1);
		System.out.println(equip.getEqNote());
	}
	
	@Test
	public void test1() {
		List<Equip> list=equipMapper.queryEquipAll();
		for(Equip quip:list)
			System.out.println(quip);
	}

}
