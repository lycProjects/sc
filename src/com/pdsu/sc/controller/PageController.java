package com.pdsu.sc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value="/createNew")
	public String createNew() throws IOException{
		return "behind/newspage";              
	}
	
/*	  @RequestMapping(value="/createNew")
	    public  ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
	        ModelAndView mav = new ModelAndView();
	        mav.setViewName("behind/news");
	        return mav;
	    }*/
	@RequestMapping(value="/teamIntrodce")   
	public String teamIntrodce() throws IOException{
		return "behind/teamintrodce";
	}
	@RequestMapping(value="/exhibition")
	public String exhibition() throws IOException{
 
		return "behind/exhibitionpage";
	}     
	/*@RequestMapping("/createNew")
	public String ctreateNew() throws IOException{
		return "behind/News";
	}*/

}
