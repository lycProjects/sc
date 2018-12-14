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
 * ��˾������Ϣ
 */
@Controller
public class CompanyController {
	@Autowired
	private EnterpriseService enterpriseServiceImpl;

	/**
	 * ��ȡ��˾������Ϣ
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
	 * ��ȡ��˾������Ϣ����ҳ��
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
	 * ɾ����˾
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
	 * ��ȡ��˾������Ϣ���ҳ��
	 */
	@RequestMapping(value="/companyManager/add",method=RequestMethod.GET)
	public String getCompanyAddPage(){
		return "behind/company/companyAdd";
	}
	
	/**
	 * ��ȡ��˾������Ϣ���ҳ��
	 */
	@RequestMapping(value="/companyManager/add/addUp",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String postCompanyAddAction(Enterprise enterprise,HttpServletRequest request){
		if(enterprise==null){
			request.setAttribute("msg", "��˾��Ϣ����Ϊ��");
			request.setAttribute("nextUrl", "/companyManager/add");
			return "jsp/passMessage";
		}
		if(enterprise.getEnName()==null||"".equals(enterprise.getEnName())){
			request.setAttribute("msg", "��˾���Ʋ���Ϊ��");
			request.setAttribute("nextUrl", "/companyManager/add");
			return "jsp/passMessage";
		}
		//�ύ
		enterprise.setEnPicture("#");
		int addResult=enterpriseServiceImpl.addEnterprise(enterprise);
		if(addResult<1){
			request.setAttribute("msg", "���ʧ��");
		}else{
			request.setAttribute("msg", "��ӳɹ�");
		}
		request.setAttribute("nextUrl", "/companyManager/add");
		return "jsp/passMessage";
	}
	
	/**
	 * ��ȡ��˾������Ϣ�༭ҳ��
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
	 * ��ȡ��˾������Ϣ�༭�ύҳ��
	 */
	@RequestMapping(value="/companyManager/{enId}/editUp",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String postCompanyEditAction(Enterprise enterprise,HttpServletRequest request){
		if(enterprise==null){
			request.setAttribute("msg", "��˾��Ϣ����Ϊ��");
		}
		//�ύ����
		int updateResult=enterpriseServiceImpl.modifyEnterprise(enterprise);
		if(updateResult<1){
			request.setAttribute("msg", "����ʧ��");
		}else{
			request.setAttribute("msg", "���³ɹ�");
		}
		request.setAttribute("nextUrl", "/companyManager/"+enterprise.getEnId()+"/edit");
		return "jsp/passMessage";
	}
	
}
