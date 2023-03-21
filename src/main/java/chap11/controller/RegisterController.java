package chap11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import chap11.exception.*;
import chap11.model.*;

@Controller
public class RegisterController {
	private MemberRegisterService memberRegisterService;
	private ChangePasswordService changePasswordService;
	
	public void setMemberRegisterService(
			MemberRegisterService memberRegisterService) {
		this.memberRegisterService = memberRegisterService;
	}
	
	public void setChangePasswordService(ChangePasswordService changePasswordService) {
		this.changePasswordService = changePasswordService;
	}
	/*
	@RequestMapping("/register/step1")
	public String handleStep1() {
		return "register/step1";
	}
	*/
	@PostMapping("/register/step2")
	public String handleStep2(@RequestParam(value="agree", defaultValue="false") boolean agree, Model model) {
		String view = "";
		      
		if(agree) {
			view = "register/step2";
			model.addAttribute("formData", new RegisterRequest());
		}
		else {
			view = "redirect:/register/step1";
		}
		      
		return view;
	}
	
	/*
	@PostMapping("/register/step2")
	public String handlerStep2(@RequestParam(value="agree", defaultValue="false") Boolean agree) {
		if(!agree) {
			return "register/step1";
		}
		return "register/step2";
	}
	*/
	
	@GetMapping("/register/step2")
	public String handleStep2Get() {
		return "redirect:/register/step1";
	}
	
	@PostMapping("/register/step3")
	public String handlerStep3(@ModelAttribute("formData") RegisterRequest regReq, Model model) {//command Object
		String view = "";
		try {
			memberRegisterService.regist(regReq);
			view="register/step3";
		}catch(DuplicateMemberException e) {
			model.addAttribute("msg", "아이디가 중복입니다.");
			view = "register/step2";
		}catch(Exception e) {
			view = "register/step2";
		}
		return view;
	}
	
	@GetMapping("/main")
	public String Main() {
		return "register/main";
	}
	
}
