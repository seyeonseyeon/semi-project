package com.semi4.controller;

import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi4.biz.CustBiz;
import com.semi4.biz.MainBiz;
import com.semi4.biz.SerchBiz;
import com.semi4.vo.CustVO;
import com.semi4.vo.ProductVO;

@Controller
public class MainController {
	
	@Autowired
	CustBiz custbiz;
	
	@Autowired
	MainBiz mainbiz;
	@Autowired
	SerchBiz serchbiz;
	
	public void mainProduct(Model m) {
		List<ProductVO> plist = null;
		String pimgpath = Paths.get(System.getProperty("user.dir"), "src", "main","resources","static","img", "product_img").toString();
		System.out.println("imgpath : " +  pimgpath);
		try {	
			plist = mainbiz.get();
			m.addAttribute("plist", plist);
			m.addAttribute("imgpath", pimgpath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping("/")
	public String main(Model m) {
		mainProduct(m);
		return "main";
	}
	
	@RequestMapping("mainSerch")
	   public String mainSerch(Model m, HttpSession session, String txt ) {

	      try {
			List<ProductVO> list = serchbiz.getTitle(txt);
			m.addAttribute("plist", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      m.addAttribute("center", "serch/center");
	      return "main";
	   }

	
	
	
	
	
	@RequestMapping("/addcart")
	public String addcart(Model m) {
		m.addAttribute("center", "center");
		return "main";
	}
	
	@RequestMapping("/login")
	public String login(Model m) {
		m.addAttribute("center", "login");
		return "main";
	}
	
	@RequestMapping("/logout") 
	public String logout(Model m, HttpSession session) {
		if(session !=null) {
			session.invalidate();

		}
		mainProduct(m);
		return "main";
	}
	
	@RequestMapping("/loginimpl") 
	public String loginimpl(Model m, String id, String pwd, HttpSession session) {
		CustVO cust = null;
		try {
			cust = custbiz.get(id);
			
			if(cust == null) {
				throw new Exception();
			}
			if(cust.getPwd().equals(pwd)) {
				session.setAttribute("logincust", cust);
			}else {
				throw new Exception();
			}
				
		} catch (Exception e) {
			
		} finally {
			mainProduct(m);
		}
		
        return "main";
	}
}
