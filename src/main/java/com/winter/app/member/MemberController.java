package com.winter.app.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("logout")
	public String getLogout(HttpSession session)throws Exception{
//		session.setAttribute("member", null);
//		session.removeAttribute("member");
//		session.removeValue("member");
		session.invalidate();
		return "redirect:../";
		 
	}
	
	@GetMapping("login")
	public void getLogin()throws Exception{
		
	}
	
	@PostMapping("login")
	public String getLogin(MemberDTO memberDTO, HttpSession session, Model model)throws Exception{
		memberDTO = memberService.getLogin(memberDTO);
		
		if(memberDTO == null) {
			model.addAttribute("msg", "ID 또는 PW 확인");
			return "member/login";
		}
		
		session.setAttribute("member", memberDTO);
		
//		System.out.println("Login : "+memberDTO);
		return "redirect:../";
	}
	
	@GetMapping("join")
	public void setJoin()throws Exception{
		
	}
	@PostMapping("join")
	public String setJoin(MemberDTO memberDTO, MultipartFile avatar, Model model)throws Exception{
		int result = memberService.setJoin(memberDTO, avatar);
		
		String msg ="회원 가입 실패";
		String path ="./join";
		if(result>0) {
			msg="회원 가입 성공";
			path="../";
		}
		model.addAttribute("msg", msg);
		model.addAttribute("path", path);
		
		return "commons/result";
	}

}