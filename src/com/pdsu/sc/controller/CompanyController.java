package com.pdsu.sc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pdsu.sc.po.Enterprise;
import com.pdsu.sc.po.EnterpriseKey;
import com.pdsu.sc.service.EnterpriseService;

/**
 * 公司资料信息
 */
@Controller
public class CompanyController {
	@Autowired
	private EnterpriseService enterpriseServiceImpl;

	/**
	 * 获取公司资料信息
	 */
	@RequestMapping(value="/company/{enId}",method=RequestMethod.GET)
	public String getCompanyDetailsPage(@PathVariable("enId") Integer enId,HttpServletRequest request){
		if(enId==null){
			return "behind/404";
		}
		EnterpriseKey key=new EnterpriseKey();
		key.setEnId(enId);
		Enterprise enterprise=enterpriseServiceImpl.selectEnterpriseByPrimaryKey(key);
		if(enterprise==null){
			return "behind/404";
		}
		request.setAttribute("enterprise", enterprise);
		return "";
	}
	
	/**
	 * 获取公司资料信息管理页面
	 */
	@RequestMapping(value="/companyManager",method=RequestMethod.GET)
	public String getCompanyListPage(HttpServletRequest request){
		List<Enterprise> enterprises=enterpriseServiceImpl.selectEnterprise(null);
		if(enterprises==null){
			return "behind/404";
		}
		request.setAttribute("enterprises", enterprises);
		return "behind/company/companyList";
	}
	
	/**
	 * 删除公司
	 */
	@RequestMapping(value="/companyManager/delete",method=RequestMethod.GET)
	public String postCompanyListDeleteAction(HttpServletRequest request,Integer[] enIds){
		if(enIds!=null){
			for(Integer enId:enIds){
				EnterpriseKey key=new EnterpriseKey();
				key.setEnId(enId);
				enterpriseServiceImpl.removeEnterprise(key);
			}
		}
		List<Enterprise> enterprises=enterpriseServiceImpl.selectEnterprise(null);
		if(enterprises==null){
			return "behind/404";
		}
		request.setAttribute("enterprises", enterprises);
		return "behind/company/companyList";
	}
	
	/**
	 * 获取公司资料信息添加页面
	 */
	@RequestMapping(value="/companyManager/add",method=RequestMethod.GET)
	public String getCompanyAddPage(){
		return "behind/company/companyAdd";
	}
	
	/**
	 * 获取公司资料信息添加页面
	 */
	@RequestMapping(value="/companyManager/add/addUp",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String postCompanyAddAction(Enterprise enterprise,HttpServletRequest request){
		if(enterprise==null){
			request.setAttribute("msg", "公司信息不能为空");
			request.setAttribute("nextUrl", "/companyManager/add");
			return "jsp/passMessage";
		}
		if(enterprise.getEnName()==null||"".equals(enterprise.getEnName())){
			request.setAttribute("msg", "公司名称不能为空");
			request.setAttribute("nextUrl", "/companyManager/add");
			return "jsp/passMessage";
		}
		//提交
		enterprise.setEnPicture("#");
		int addResult=enterpriseServiceImpl.addEnterprise(enterprise);
		if(addResult<1){
			request.setAttribute("msg", "添加失败");
		}else{
			request.setAttribute("msg", "添加成功");
		}
		request.setAttribute("nextUrl", "/companyManager/add");
		return "jsp/passMessage";
	}
	
	/**
	 * 获取公司资料信息编辑页面
	 */
	@RequestMapping(value="/companyManager/{enId}/edit",method=RequestMethod.GET)
	public String getCompanyEditPage(@PathVariable("enId") Integer enId,HttpServletRequest request){
		if(enId==null){
			return "behind/404";
		}
		EnterpriseKey key=new EnterpriseKey();
		key.setEnId(enId);
		Enterprise enterprise=enterpriseServiceImpl.selectEnterpriseByPrimaryKey(key);
		if(enterprise==null){
			return "behind/404";
		}
		request.setAttribute("enterprise", enterprise);
		return "behind/company/companyEdit";
	}
	
	/**
	 * 获取公司资料信息编辑提交页面
	 */
	@RequestMapping(value="/companyManager/{enId}/editUp",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String postCompanyEditAction(Enterprise enterprise,HttpServletRequest request){
		if(enterprise==null){
			request.setAttribute("msg", "公司信息不能为空");
		}
		//提交更新
		int updateResult=enterpriseServiceImpl.modifyEnterprise(enterprise);
		if(updateResult<1){
			request.setAttribute("msg", "更新失败");
		}else{
			request.setAttribute("msg", "更新成功");
		}
		request.setAttribute("nextUrl", "/companyManager/"+enterprise.getEnId()+"/edit");
		return "jsp/passMessage";
	}
	
}
