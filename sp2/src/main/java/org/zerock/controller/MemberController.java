package org.zerock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.dto.MemberDTO;
import org.zerock.service.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
@Log4j2
public class MemberController {

	
	private final MemberService service;
	
	//localhost:8080/member/list
	// -> /WEB-INF/views/member/list.jsp
	@GetMapping("/list")
	public void list(Model model) {
		List<MemberDTO> memberList = service.getList();
		
		model.addAttribute("memberList", memberList);
	}
	
	@GetMapping("/register")
	public void registerGet() {
		log.info("register get");
	}
	
	@PostMapping("/register")
	public String registerPost() {
		return null;
	}
	
}


















