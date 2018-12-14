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
* @Description: TODO(������һ�仰��������������)
* @author ���³�
* @date 2018��8��27������8:53:34
*
*/
@Controller
public class EquipController {
	
	@Autowired
	private EquipService equipService;
	
	@RequestMapping("/selectById")
	public ModelAndView selectById(@RequestParam("id")Integer equipid) throws Exception{
		// ����service���� ���ݿ⣬��ѯ�豸
	    Equip equip =equipService.selectByPrimaryKey(equipid);
		if(equip==null) {
			throw new CustomException("�����豸��Ϣ������");
		}
	    
		// ����ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// �൱ ��request��setAttribut����jspҳ����ͨ��equipListȡ����
		modelAndView.addObject("equip", equip);
	   // ָ����ͼ
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
