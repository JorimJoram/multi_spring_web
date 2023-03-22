package chap11.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chap11.controller.*;
import chap11.model.*;
import chap11.survey.*;

@Configuration
public class ControllerConfig {
	
	@Autowired
	private MemberRegisterService memberRegisterService;
	
	@Bean
	public RegisterController registerController() {
		RegisterController rc = new RegisterController();
		rc.setMemberRegisterService(memberRegisterService);
		return rc;
	}
	
	@Bean
	public MemberController memberController() {
		MemberController mc = new MemberController();
		return mc;
	}
	
	@Bean
	public SurveyController surveyController() {
		return new SurveyController();
	}
}
