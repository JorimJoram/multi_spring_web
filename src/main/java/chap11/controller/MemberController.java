package chap11.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import chap11.exception.WrongIdPasswordException;
import chap11.model.*;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService; 
	@Autowired
	private ChangePasswordService changePasswordService;

	
	@PostMapping("/member/loginProcess")
	public String login(LoginCommand login, HttpSession session) {
		String view = "";
		
		if(memberService.checkLoginAuth(login)) {
			Member member = memberService.searchMember(login.getEmail());
			member.setPassword("");
			session.setAttribute("auth", member);
			view = "redirect:/main"; 
		}else {
			session.setAttribute("loginFailMsg", "로그인에 실패했습니다.");
			view = "redirect:/member/login";
		}
		
		return view;
	}
	
	@PostMapping("/member/findMemberProcess")
	public String findMemberHandler(String email, Model model){
		Member member = memberService.searchMember(email);
		if(member != null) {
			model.addAttribute("member", member);
		}else {
			model.addAttribute("findFailMsg", "계정을 찾지 못했습니다");
		}
		
		return "member/findMember";
	}
	
	@PostMapping("/member/changeProcess")
	public String changePassword(LoginCommand command, Model model, HttpSession session) {
		String view = "/member/changePasswd";
		
		try {
			changePasswordService.changePassword(command);
			session.invalidate();
			view = "/member/login";
		}catch(WrongIdPasswordException e) {
			model.addAttribute("changeFailMsg", "비밀번호를 다시 확인해주세요");
			view = "/member/changePasswd";
		}catch(Exception e) {
			model.addAttribute("changeFailMsg", "ahf?fn");
		}
		return view;
	}
	
	@GetMapping("/member/logout")
	public String logout(HttpSession session) {
		String view = "";
		
		if(session.getAttribute("auth") != null) {
			session.invalidate();
			view = "redirect:/member/login";
		}else {
			view = "redirect:/main";
		}
		return view;
	}
	
	@GetMapping("/member/all")
	public String showAll(Model model) {
		String view = "/member/all";
		model.addAttribute("memberList", memberService.getAllMember());
		
		return view;
	}
}
