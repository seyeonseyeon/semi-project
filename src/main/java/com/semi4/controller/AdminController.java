package com.semi4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	

	@RequestMapping("")
	public String main(Model m) {
		m.addAttribute("center", "admin/center");
		return "/admin/main";
	}

}
