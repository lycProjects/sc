package com.pdsu.sc.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pdsu.sc.mapper.TeammappingMapper;
import com.pdsu.sc.po.Equipborrow;
import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.service.EquipborrowService;
import com.pdsu.sc.service.TeammappingService1;

@Controller
public class EquipborrowController {
	
	@Autowired
	private EquipborrowService equipborrowService; 
	
	@Autowired
	private TeammappingService1 teammappingService1; 
	
	@RequestMapping("/shebeiwaijie")
	public String shebeiwaijie(Model model) throws Exception{
        List<Equipborrow> equipborrowLists=equipborrowService.queryAll();		
		model.addAttribute("equipborrowLists", equipborrowLists);
		return "behind/shebeiwaijie";
	}
	
	@RequestMapping("/picturewaijie")
	public String picturewaijie(Model model) throws Exception{
		List<Teammapping> teammappingMappersList=teammappingService1.queryallTeam();
		model.addAttribute("teammappingMappersList", teammappingMappersList);
		return "behind/pictureaddwaijie"; 
	}
	

	@RequestMapping(value="/pictueraddwaijie",method=RequestMethod.POST)
	public String pictueraddwaijie(Equipborrow equipborrow,Model model) throws Exception {
		Integer eqbTeam=equipborrow.getEqbTeam();
		Integer eqbZfour=equipborrow.getEqbZfour();
		Integer eqbOneg=equipborrow.getEqbOneg();
		Integer eqbTwog=equipborrow.getEqbTwog();
		Integer eqbFourg=equipborrow.getEqbFourg();
		equipborrowService.insert(eqbTeam, eqbZfour, eqbOneg, eqbTwog, eqbFourg);
		List<Equipborrow> equipborrowLists=equipborrowService.queryAll();		
		model.addAttribute("equipborrowLists", equipborrowLists);
		return "behind/shebeiwaijie";
	}
	
	@RequestMapping("/deletes")
	public String deletes(int[] ids,Model model) throws Exception{
		equipborrowService.delEquipById(ids);
		List<Equipborrow> equipborrowLists=equipborrowService.queryAll();		
		model.addAttribute("equipborrowLists", equipborrowLists);
		return "behind/shebeiwaijie";
	}
	
	@RequestMapping("/shebeiwaijieedit/{eqbId}") 
	public String shebeiwaijieedit(@PathVariable("eqbId") Integer eqbId,Model model) throws Exception{
		Equipborrow equipborrow=equipborrowService.selectByPrimaryKey(eqbId);
		model.addAttribute("equipborrow",equipborrow);
		return "behind/shebeiwaijieedit";
	}
	
	@RequestMapping("/edit")
	public String edit(Integer eqbId,Integer eqbTeam,Integer eqbZfour,Integer eqbOneg,Integer eqbTwog,Integer eqbFourg,Model model) throws Exception{
		equipborrowService.updateByPrimaryKey(eqbId,eqbTeam, eqbZfour, eqbOneg, eqbTwog, eqbFourg);
		List<Equipborrow> equipborrowLists=equipborrowService.queryAll();		
		model.addAttribute("equipborrowLists", equipborrowLists);
		return "behind/shebeiwaijie";
	}
}
