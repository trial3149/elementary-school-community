package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.dto.MemberDTO;
import com.example.project.service.MemberService;


@RestController
public class MemberController {

	MemberService service;

	public MemberController(MemberService service) {
		this.service = service;
	}

	@RequestMapping(value="/getId", method= {RequestMethod.GET, RequestMethod.POST})
		public String getId(MemberDTO dto) {
		System.out.println("MemberController getID");
		
		boolean b = service.getId(dto);
		if(b) {
			return "NO"; //1이상이란 말, 이미 아이디가 존재한다는 말이라서 사용이 안된다
		}
		return "OK";
	}
	
	@RequestMapping(value="/addmember", method= {RequestMethod.GET, RequestMethod.POST})
	public String addmember(MemberDTO dto) {
		System.out.println("MemberController addmember");		
		boolean b = service.addmember(dto);
		
	if(b) {
		return "YES";
	}
	return "NO";
	}
	

	// 로그인  
	@RequestMapping(value="/login.html", method= {RequestMethod.GET, RequestMethod.POST})
	public MemberDTO login(MemberDTO dto) {
		System.out.println("MemberController login");	
		
		MemberDTO mem = service.login(dto);
		return mem;
	}
	
	
	/*
	@GetMapping("/login")
	public String loginForm() {
		
		return "Login";
	}*/
	
}










