package com.my.comtroller;



import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("show")
	public String name(Model model) {
		
		model.addAttribute("list", userService.sel());
		System.out.println("aaaa");
		return "/index.jsp";
		
	}

}
