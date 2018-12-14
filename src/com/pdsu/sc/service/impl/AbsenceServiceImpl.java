package com.pdsu.sc.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.pdsu.sc.mapper.AbsenceMapper;
import com.pdsu.sc.po.Absence;
import com.pdsu.sc.po.AbsenceExample;
import com.pdsu.sc.po.Page;
import com.pdsu.sc.po.Student;
import com.pdsu.sc.service.AbsenceService;
@Service
@Transactional
public class AbsenceServiceImpl implements AbsenceService{
	
	@Autowired
	private AbsenceMapper absenceMapper;
	
	public void insert(String abName,Integer abTeam,Integer abTime) throws  Exception {
		Absence record =new Absence();
		record.setAbName(abName);
		record.setAbTeam(abTeam);
		record.setAbTime(abTime);
		absenceMapper.insert(record);
	}

	public List<Absence> selectAll(){

		return absenceMapper.selectAll();
	}
	
	public Absence selectByPrimaryKey(Integer abId) throws  Exception {
		return absenceMapper.selectByPrimaryKey(abId);
	}

	public void deleteMany(Integer[] id_arr) throws  Exception{
        // TODO 自动生成的方法存根
        absenceMapper.deleteMany(id_arr);
    }
	
	public void deleteByPrimaryKey(Integer abId) throws  Exception {
		absenceMapper.deleteByPrimaryKey(abId);
	}
	public void updateByPrimaryKeySelective(Absence record) throws  Exception {
		absenceMapper.updateByPrimaryKeySelective(record);
	}
	      
	public void showAbsenceByPage(HttpServletRequest request,Model model) throws  Exception {
		
		 String pageNow = request.getParameter("pageNow"); 
        
	        Page page = null; 
	       
	        List<Absence> absence = new ArrayList<Absence>(); 
	      
	        //查询用户总数
	        int totalCount = (int) absenceMapper.getAbsenceCount();
	       
	        if (pageNow != null) { 
	            page = new Page(totalCount, Integer.parseInt(pageNow));  
	            absence=this.absenceMapper.selectAbsenceByPage(page.getStartPos(), page.getPageSize());
	        } else { 
	            page = new Page(totalCount, 1); 
	            absence=this.absenceMapper.selectAbsenceByPage(page.getStartPos(), page.getPageSize());
	        } 
	        model.addAttribute("absence", absence); 
	        model.addAttribute("page", page);  
	}

	@Override
	public long getAbsenceCount() {
		
		return absenceMapper.getAbsenceCount();
	}

	@Override
	public void deleteMany(int[] id_arr)  {
		// TODO Auto-generated method stub
		
	}
	
	public Absence selectByName(String name) throws  Exception {
		return absenceMapper.selectByName(name);
	}
	
	 public List<Absence> selectByExample(AbsenceExample example) throws  Exception{
		 return absenceMapper.selectByExample(example);
	 }
	 
	 public void updateByName(String name) throws  Exception {
		 absenceMapper.updateByName(name);
	 }

	@Override
	public List<Absence> queryAbsenceByTeam(Integer abTeam) throws Exception {
		return absenceMapper.queryAbsenceByTeam(abTeam);
	}

	
}
