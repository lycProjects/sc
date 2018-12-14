package com.pdsu.sc.controller.project.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
import com.pdsu.sc.po.Title;
import com.pdsu.sc.po.TitleExample;
import com.pdsu.sc.service.ApplicationService;
import com.pdsu.sc.service.IssusdProjectService;
import com.pdsu.sc.service.TitleService;

/**
 * ��˾�ѷ�����Ŀ������
 */
@Controller
public class ProjectPublishedDetailsController {
	@Autowired
	private IssusdProjectService issusdProjectServiceImpl;
	@Autowired
	private ApplicationService applicationServiceImpl;
	@Autowired
	private TitleService titleServiceImpl;
	/**
	 * ��ȡ�´����Ŀ����ҳ��
	 */
	@RequestMapping(value="/company/projectPublished/details/{ipId}",method=RequestMethod.GET)
	public String getProjectPublishedDetailsPage(@PathVariable("ipId") Integer ipId,HttpServletRequest request){
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
		request.setAttribute("canDoAction", request.getParameter("canDoAction"));
		
		return "behind/company/projectPublishedDetails";
	}
	
	/**
	 * ͬ��ĳ���ŶӶ���Ŀ������
	 */
	@ResponseBody
	@RequestMapping(value="/company/projectPublished/details/{ipId}/agree/{applicationId}",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String agreeTeamApplicationAction(@PathVariable("ipId") Integer ipId,@PathVariable("applicationId") Integer applicationId,HttpServletRequest request){
		if(ipId==null||ipId<0){
			return "��Ŀid����";
		}
		if(applicationId==null||applicationId<0){
			return "����id����";
		}
		//��ʼ��ѯ
		IssusdProjectKey issusdProjectKey=new IssusdProjectKey();
		issusdProjectKey.setIpId(ipId);
		IssusdProject issusdProject=issusdProjectServiceImpl.selectIssusdProjectByPrimaryKey(issusdProjectKey);
		if(issusdProject==null){
			return "�´���Ŀ������";
		}//���Ƿ��������
		//����Ŀ�ǲ����ڵȴ�����״̬
		if(issusdProject.getEnProjectstate()!=1){
			return "�´���Ŀ������ͬ����������";
		}//�����������ͻ�ȡ�� �Ŷӵ�����
		Application application=applicationServiceImpl.selectApplicationByPrimaryKey(applicationId);
		if(application==null){
			return "����Ŀ���벻����";
		}//���ھ��Ȱ� ���´���Ŀ�µ��������붼��Ϊ��ʧЧ
		Application applicationModifyBean=new Application();
		applicationModifyBean.setApState(6);
		applicationModifyBean.setApStatename("������ʧЧ");
		ApplicationExample applicationModifyBeanExample=new ApplicationExample();
		ApplicationExample.Criteria applicationModifyBeanExampleCriteria=applicationModifyBeanExample.createCriteria();
		applicationModifyBeanExampleCriteria.andApProjectidEqualTo(ipId);
		int modifyApsResult=applicationServiceImpl.modifyByExampleSelective(applicationModifyBean, applicationModifyBeanExample);
		if(modifyApsResult<1){
			return "�޸�����״̬ʧ��";
		}
		//�ٰѵ�ǰ����ĳ���ͨ��
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		String apHandletime=sdf.format(new Date());
		application.setApState(4);
		application.setApStatename("��ͨ��");
		application.setApHandletime(apHandletime);
		applicationServiceImpl.modifyApplication(application);
		//�Ѹ��´���Ŀ��״̬�ĳɽ�����
		issusdProject.setEnProjectstate(2);
		issusdProject.setEnStatename("������");
		issusdProjectServiceImpl.modifyIssusdProject(issusdProject);
		return "success";
	}
	
	/**
	 * �ܾ�ĳ���ŶӶ���Ŀ������
	 */
	@ResponseBody
	@RequestMapping(value="/company/projectPublished/details/{ipId}/disagree/{applicationId}",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String disagreeTeamApplicationAction(@PathVariable("ipId") Integer ipId,@PathVariable("applicationId") Integer applicationId,HttpServletRequest request){
		if(ipId==null||ipId<0){
			return "��Ŀid����";
		}
		if(applicationId==null||applicationId<0){
			return "����id����";
		}
		//��ʼ��ѯ
		IssusdProjectKey issusdProjectKey=new IssusdProjectKey();
		issusdProjectKey.setIpId(ipId);
		IssusdProject issusdProject=issusdProjectServiceImpl.selectIssusdProjectByPrimaryKey(issusdProjectKey);
		if(issusdProject==null){
			return "�´���Ŀ������";
		}//���Ƿ��������
		//����Ŀ�ǲ����ڵȴ�����״̬
		if(issusdProject.getEnProjectstate()!=1){
			return "�´���Ŀ�����;ܾ���������";
		}//�����������ͻ�ȡ�� �Ŷӵ�����
		Application application=applicationServiceImpl.selectApplicationByPrimaryKey(applicationId);
		if(application==null){
			return "����Ŀ���벻����";
		}//�ѵ�ǰ����ĳ��Ѿܾ�
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		String apHandletime=sdf.format(new Date());
		application.setApState(3);
		application.setApStatename("�Ѿܾ�");
		application.setApHandletime(apHandletime);
		applicationServiceImpl.modifyApplication(application);
		return "success";
	}
	
	/**
	 * ��ĳ����Ŀ����
	 */
	@ResponseBody
	@RequestMapping(value="/company/projectPublished/details/{ipId}/endProject",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String endIssusdProjectAction(@PathVariable("ipId") Integer ipId,HttpServletRequest request){
		if(ipId==null||ipId<0){
			return "��Ŀid����";
		}
		//��ʼ��ѯ
		IssusdProjectKey issusdProjectKey=new IssusdProjectKey();
		issusdProjectKey.setIpId(ipId);
		IssusdProject issusdProject=issusdProjectServiceImpl.selectIssusdProjectByPrimaryKey(issusdProjectKey);
		if(issusdProject==null){
			return "�´���Ŀ������";
		}//���Ƿ��������
		//����Ŀ�ǲ����ڽ���״̬
		if(issusdProject.getEnProjectstate()!=2){
			return "�´���Ŀ�����ͽ�������";
		}//�����������ͻ�ȡ�� ���ڽ��е���Ŀ���Ŷӵ�����
		ApplicationExample applicationExample=new ApplicationExample();
		ApplicationExample.Criteria applicationExampleCriteria=applicationExample.createCriteria();
		applicationExampleCriteria.andApProjectidEqualTo(ipId);
		applicationExampleCriteria.andApStateEqualTo(4);
		List<Application> applications=applicationServiceImpl.selectApplication(applicationExample);
		if(applications==null||applications.size()<1){
			return "����Ŀ���Ŷ����벻����";
		}//�ѵ�ǰ����ĳ�������
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		String nowTime=sdf.format(new Date());
		Application application=applications.get(0);
		application.setApState(4);
		application.setApStatename("������");
		application.setApHandletime(nowTime);
		applicationServiceImpl.modifyApplication(application);
		//���´���Ŀ��״̬
		issusdProject.setEnProjectstate(3);
		issusdProject.setEnStatename("������");
		issusdProject.setEnProjectover(nowTime);
		issusdProjectServiceImpl.modifyIssusdProject(issusdProject);
		return "success";
	}
}
