package com.pdsu.sc.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.List;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

import com.pdsu.sc.exception.CustomException;
import com.pdsu.sc.po.Equip;
import com.pdsu.sc.po.EquipExample;
import com.pdsu.sc.po.Equipborrow;
import com.pdsu.sc.service.EquipService;
import com.pdsu.sc.service.EquipborrowService;

/**
* @ClassName: EquipController
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 李勇超
* @date 2018年8月27日上午8:53:34
*
*/
@Controller
public class EquipController {
	
	@Autowired
	private EquipService equipService;
	
	@RequestMapping("/selectById")
	public ModelAndView selectById(@RequestParam("id")Integer equipid) throws Exception{
		// 调用service查找 数据库，查询设备
	    Equip equip =equipService.selectByPrimaryKey(equipid);
		if(equip==null) {
			throw new CustomException("查找设备信息不存在");
		}
	    
		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中通过equipList取数据
		modelAndView.addObject("equip", equip);
	   // 指定视图
	   modelAndView.setViewName("jsp/equipList");
	   return modelAndView;
	}
	
	@RequestMapping("/deleteById")
	public String deleteById(Integer id) throws Exception {
		equipService.deleteByPrimaryKey(id);
		return "jsp/success";
	}
	
	@RequestMapping("/updateByPrimaryKeySelective")
	public String updateByPrimaryKeySelective(Integer id,Integer eqAmout,String eqNote) throws Exception {
		
		equipService.updateByPrimaryKeySelective(id,eqAmout,eqNote);
		return "jsp/update";
	}
	
	@RequestMapping(value="/insertsubmit",method=RequestMethod.POST)
	public String insert(Equip equip,Model model) throws Exception {
		String eqName=equip.getEqName();
		String eqUnit=equip.getEqUnit();
		int eqAmout=equip.getEqAmout();
		String eqNote=equip.getEqNote();
		equipService.insert(eqName,eqUnit,eqAmout,eqNote);
		List<Equip> equipLists=equipService.queryEquipAll();		
		model.addAttribute("equipLists", equipLists);
		model.addAttribute("equipLists", equipLists);
		return "behind/shebeizhonglan";
	}
	
	@RequestMapping("/nofind")
	public String nofind() throws Exception{
		return "behind/nofind";
	}
	
	@RequestMapping("/shebeizhonglan")
	public String shebeizhonglan(Model model) throws Exception{
        List<Equip> equipLists=equipService.queryEquipAll();		
		model.addAttribute("equipLists", equipLists);
		return "behind/shebeizhonglan";
	}
	
	@RequestMapping("/queryEquip")
	public String queryEquip(Model model) throws Exception{
		
	    List<Equip> equipLists=equipService.queryEquipAll();
		
		model.addAttribute("equipLists", equipLists);

	    return "behind/index";
	}
	
	@RequestMapping("/add-shebei")
	public String addshebei() throws Exception{
		return "behind/add-shebei";
	}
	
	@RequestMapping("/deleteMany")
	public String deleteMany(int[] ids,Model model) throws Exception{
		equipService.delUserById(ids);
		List<Equip> equipLists=equipService.queryEquipAll();		
		model.addAttribute("equipLists", equipLists);
		return "behind/shebeizhonglan";
	}
}
