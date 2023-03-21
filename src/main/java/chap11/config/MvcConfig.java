package chap11.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer{

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/views/", ".jsp");
	}
	
	public void addViewControllers(ViewControllerRegistry registry) {
		
		registry.addViewController("/main").setViewName("main");
		
		registry.addViewController("/register/step1").setViewName("register/step1");
		
		registry.addViewController("/member/login").setViewName("member/login");
		
		registry.addViewController("/member/findMember").setViewName("member/findMember");
		
		registry.addViewController("/member/changePasswd").setViewName("member/changePasswd");
	}
}
