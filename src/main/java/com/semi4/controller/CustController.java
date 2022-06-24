package com.semi4.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.semi4.biz.CustBiz;
import com.semi4.vo.CustVO;

@Controller
@RequestMapping("/cust")
public class CustController {

	@Autowired
	CustBiz cbiz;
	
	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("center", "cust/add" );
		return mv;
	}

	@RequestMapping("/add")
	public String add(Model m) {
		m.addAttribute("center", "cust/add");
		return "main";
	}
	
	@RequestMapping("/addimpl")
	public String addimpl(Model m, CustVO cust) {
		try {
			cbiz.register(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			CustVO c = null;
			c = (CustVO) cbiz.get(cust.getUid());
			m.addAttribute("cust", c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "cust/detail");
		return "main";
	}
	
	
	@RequestMapping("/detail")
	public String detail(Model m, HttpSession session) {
		CustVO cust = (CustVO) session.getAttribute("logincust");
		
		try {
			cust  = cbiz.get(cust.getUid());
			m.addAttribute("cust", cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "cust/detail");
		return "main";
	}
	
	@RequestMapping("/update")
	public String update(Model m, CustVO cust) {
		System.out.println("나와"+cust.getUid());
		try {
			cbiz.modify(cust);	
			cust  = cbiz.get(cust.getUid());
			m.addAttribute("cust", cust);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "cust/detail");
		return "main";
	}

}