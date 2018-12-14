package com.pdsu.sc.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.pdsu.sc.mapper.TeammappingMapper;
import com.pdsu.sc.po.Absence;
import com.pdsu.sc.po.Page;
import com.pdsu.sc.po.Teammapping;
import com.pdsu.sc.po.TeammappingExample;
import com.pdsu.sc.service.TeammappingService;
@Service
public class TeammappingServiceImpl implements TeammappingService{
	@Autowired
	private TeammappingMapper teammappingMapper;

		 public void showTeammappingByPage(HttpServletRequest request,Model model) {
				
			 String pageNow = request.getParameter("pageNow"); 
	        
		        Page page = null; 
		       
		        List<Teammapping> teammapping = new ArrayList<Teammapping>(); 
		      
		        //查询用户总数
		        int totalCount = (int) teammappingMapper.getTeammappingCount();
		       
		        if (pageNow != null) { 
		            page = new Page(totalCount, Integer.parseInt(pageNow));  
		            //absence=this.absenceMapper.selectAbsenceByPage(page.getStartPos(), page.getPageSize());
		            teammapping=this.teammappingMapper.selectTeammappingByPage(page.getStartPos(), page.getPageSize());
		        } else { 
		            page = new Page(totalCount, 1); 
		            teammapping=this.teammappingMapper.selectTeammappingByPage(page.getStartPos(), page.getPageSize());
		        } 
		        model.addAttribute("teammapping", teammapping); 
		        model.addAttribute("page", page);  
		}
		 
		 
		//团队
		 public long getTeammappingCount() {
			 return teammappingMapper.getTeammappingCount();
		 }


		@Override
		public int insert(Teammapping record) {
			// TODO Auto-generated method stub
			return teammappingMapper.insert(record);
		}


		@Override
		public List<Teammapping> selectByExample(TeammappingExample example) {
			// TODO Auto-generated method stub
			return teammappingMapper.selectByExample(example);
		}


		@Override
		public Teammapping selectByPrimaryKey(Integer tmmId) {
			// TODO Auto-generated method stub
			return teammappingMapper.selectByPrimaryKey(tmmId);
		}
}
