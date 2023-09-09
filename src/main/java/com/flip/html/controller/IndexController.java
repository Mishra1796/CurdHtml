package com.flip.html.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.flip.html.model.InputDTO;
import com.flip.html.service.InputService;

@Controller
public class IndexController {
	@Autowired
	InputService service;
	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
//	@PostMapping("/register")
//	public String userRegistration(@ModelAttribute InputDTO user, Model model) {
//		System.out.println(user.toString());
//		// validate 
//		System.out.println(user.getFname());
//		System.out.println(user.getLname());
//		System.out.println(user.getDob());
//		System.out.println(user.getEmail());
//		model.addAttribute("firstname", user.getFname());
//		model.addAttribute("lastname", user.getLname());
//		return "welcome";
//	}
	
	@PostMapping("/record")
	public String saveOrder(@ModelAttribute InputDTO request, Model model) {
		String response= service.saveOrder(request);
		request.setStatus(response);
		model.addAttribute("orderProduct", request.getOrderProduct());//		return "welcome";
		return "welcome";
	}
}
