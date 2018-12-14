package com.pdsu.sc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdsu.sc.mapper.LoginMapper;
import com.pdsu.sc.mapper.TeammappingMapper;
import com.pdsu.sc.po.Login;
import com.pdsu.sc.po.Roles;
import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.service.LoginService;
import com.pdsu.sc.service.RolesService;
import com.pdsu.sc.service.TeammappingService;

@Controller
public class RoleController {

	@Autowired
	private TeammappingMapper teammappingMapper;
	
	@Autowired
	private LoginMapper loginMapper;
	
	@Autowired
	private RolesService rolesService;
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/admin-role")
	public String adminrole(Model model) throws Exception{
		
		List<Roles> rolesList=rolesService.queryall();
		model.addAttribute("rolesList", rolesList);
		
		return "behind/admin-role";
	}
	
	@RequestMapping("/admin-role-add")
	public String adminroleadd() throws Exception{
		
		return "behind/admin-role-add";
	}
	
	
	@RequestMapping("/admin-list")
	public String adminlist(Model model) throws Exception{
		List<Login> loginList=loginService.queryLoginAll();
		model.addAttribute("loginList", loginList);
		return "behind/admin-list";
	}
	
	@RequestMapping("/admin-add")
	public String adminadd(Model model,HttpServletRequest request) throws Exception{
		List<Roles> rolesList=rolesService.queryall();
		List<Teammapping> teammappings=teammappingMapper.selectByExample(null);
		model.addAttribute("rolesList", rolesList);
		model.addAttribute("teammappings", teammappings);
		//如果是更新的话就会只有字段
		String loIdString=request.getParameter("loId");
		if(loIdString!=null&&!"".equals(loIdString)){
			Login login=loginMapper.selectByPrimaryKey(Integer.parseInt(loIdString));
			model.addAttribute("login", login);
		}
		return "behind/admin-add";
	}

	//添加管理员
	@ResponseBody
	@RequestMapping(value="/admin-add/add",method=RequestMethod.POST)
	public String adminAddOne(Model model,HttpServletRequest request) throws Exception{
		Integer loIdString=Integer.parseInt(request.getParameter("loId"));
		String adminName=request.getParameter("adminName");
		String password=request.getParameter("password");
		String loRole=request.getParameter("loRole");
		String loTeam=request.getParameter("loTeam");
		Login login=new Login();
		login.setLoUsername(adminName);
		login.setLoPassword(password);
		login.setLoRole(Integer.parseInt(loRole));
		login.setLoTeam(Integer.parseInt(loTeam));
		if(loIdString>0){//说明是提交更新
			login.setLoId(loIdString);
			loginMapper.updateByPrimaryKeySelective(login);
			return "adminUpdateOk";
		}
		loginMapper.insert(login);
		return "adminAddOk";
	}
	
	//添加管理员
	@ResponseBody
	@RequestMapping(value="/admin-list/delete",method=RequestMethod.POST)
	public String adminDelOne(Model model,HttpServletRequest request) throws Exception{
		String loIds = request.getParameter("loIds").trim();
		if (loIds.contains(":")) {// 说明是批量删除
			Integer loId = null;
			for (String loIdString : loIds.split(":")) {
				try {
					loId = Integer.parseInt(loIdString);
				} catch (NumberFormatException e) {
					return "删除失败，Id有误";
				}
				loginMapper.deleteByPrimaryKey(loId);
			}
			return "adminDelOk";
		} else {
			Integer loId = null;
			try {
				loId = Integer.parseInt(loIds);
			} catch (NumberFormatException e) {
				return "删除失败，Id有误";
			}
			loginMapper.deleteByPrimaryKey(loId);
			return "adminDelOk";
		}
	}
}
