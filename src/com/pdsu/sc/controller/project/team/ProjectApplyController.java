package com.pdsu.sc.controller.project.team;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdsu.sc.po.Application;
import com.pdsu.sc.po.ApplicationExample;
import com.pdsu.sc.po.IssusdProject;
import com.pdsu.sc.po.IssusdProjectKey;
import com.pdsu.sc.po.Login;
import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.po.Title;
import com.pdsu.sc.service.ApplicationService;
import com.pdsu.sc.service.IssusdProjectService;
import com.pdsu.sc.service.TeammappingService;
import com.pdsu.sc.service.TitleService;

/**
 * ������Ŀ
 */
@Controller
public class ProjectApplyController {
	@Autowired
	private IssusdProjectService issusdProjectServiceImpl;
	@Autowired
	private ApplicationService applicationServiceImpl;
	@Autowired
	private TeammappingService teammappingServiceImpl;
	@Autowired
	private TitleService titleServiceImpl;
	/**
	 * ��ȡ������Ŀҳ��
	 */
	@RequestMapping(value="/team/IssusdProject/{ipId}/details",method=RequestMethod.GET)
	public String getProjectApplyPage(@PathVariable("ipId") Integer ipId,HttpServletRequest request){
		if(ipId==null){
			return "behind/404";
		}
		//��ʼ��ѯ
		IssusdProjectKey issusdProjectKey=new IssusdProjectKey();
		issusdProjectKey.setIpId(ipId);
		IssusdProject issusdProject=issusdProjectServiceImpl.selectIssusdProjectByPrimaryKey(issusdProjectKey);
		if(issusdProject==null){
			return "behind/404";
		}//��ȡ������Ϣ
		Title title=titleServiceImpl.selectTitleByPrimaryKey(issusdProject.getTiId());
		//��ȡ���е��Ŷ���Ŀ����
		ApplicationExample applicationExample=new ApplicationExample();
		ApplicationExample.Criteria applicationExampleCriteria=applicationExample.createCriteria();
		applicationExampleCriteria.andApProjectidEqualTo(ipId);
		List<Application> applications=applicationServiceImpl.selectApplication(applicationExample);
		request.setAttribute("issusdProject", issusdProject);
		request.setAttribute("applications", applications);
		request.setAttribute("title", title);
		return "behind/company/team-projectDescription";
	}
	
	/**
	 * ����ĳ����Ŀ
	 */
	@ResponseBody
	@RequestMapping(value="/team/IssusdProject/{ipId}/apply",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String applyIssusdPrjectAction(@PathVariable("ipId") Integer ipId,HttpServletRequest request,HttpSession httpSession){
		if(ipId==null){
			return "��������";
		}
		String apReason=request.getParameter("apReason").trim();
		if(apReason==null||"".equals(apReason)){
			return "�������ɲ���Ϊ��";
		}
		//�Ȼ�ȡ��¼��Ϣ
		Login login=(Login) httpSession.getAttribute("userData");
		if(login==null){//˵��û�е�¼��Ϣ
			return "���ȵ�¼";
		}
		//��ȡ�Ŷ�id��Ϣ
		Integer tmmId=login.getLoTeam();
		if(tmmId==null||tmmId<0){
			try{
				tmmId=Integer.parseInt(request.getParameter("tmmId"));
			}catch(Exception e){}
		}
		if(tmmId==null){
			return "���������޻�ȡ���Ŷ�id";
		}
		Teammapping teammapping=teammappingServiceImpl.selectByPrimaryKey(tmmId);
		if(teammapping==null){
			return "�ŶӲ�����";
		}
		//��ʼ��ѯ
		IssusdProjectKey issusdProjectKey=new IssusdProjectKey();
		issusdProjectKey.setIpId(ipId);
		IssusdProject issusdProject=issusdProjectServiceImpl.selectIssusdProjectByPrimaryKey(issusdProjectKey);
		if(issusdProject==null){
			return "�´���Ŀ������";
		}//���ǲ����Ѿ�����������Ŀ
		ApplicationExample applicationExample=new ApplicationExample();
		ApplicationExample.Criteria applicationExampleCriteria=applicationExample.createCriteria();
		applicationExampleCriteria.andApProjectidEqualTo(ipId);
		applicationExampleCriteria.andApTeamidEqualTo(tmmId);
		long countIssusdProjectApplications=applicationServiceImpl.countByExample(applicationExample);
		if(countIssusdProjectApplications>0){
			return "�����ظ����������Ŀ";
		}//��ʼ���������Ŀ
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		String nowTime=sdf.format(new Date());
		Application application=new Application();
		application.setApState(1);
		application.setApStatename("�ȴ�ȷ��");
		application.setApProjectid(ipId);
		application.setApProjectname(issusdProject.getIpProjectname());
		application.setApTeamid(tmmId);
		application.setApTeamname(teammapping.getTmmName());
		application.setApTime(nowTime);
		application.setApReason(apReason);
		application.setApHandletime(nowTime);
		int addApplicationResult=applicationServiceImpl.addApplication(application);
		if(addApplicationResult<1){
			return "��������ʧ��";
		}
		return "success";
	}
	
}
