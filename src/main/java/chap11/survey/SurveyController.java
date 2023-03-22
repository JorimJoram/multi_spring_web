package chap11.survey;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/survey")
public class SurveyController {
	
	@GetMapping
	public String form() {
		
		return "survey/surveyForm";
	}
	
	@PostMapping
	public String submit(@ModelAttribute("ansData") AnsweredData data) {	
		
		return "survey/submitted";
	}
	
	@GetMapping("/test")
	public String dynamic(Model model) {
		List<Question> questions = this.createQuestions();
		model.addAttribute("questions", questions);
		
		return "survey/testSurveyForm";
	}
	private List<Question> createQuestions(){
		Question q1 = new Question("당신의 역할은 무엇입니까?",
				Arrays.asList("서버개발자","프론트개발자", "풀스택개발자"));
		Question q2 = new Question("당신의 역할은 무엇입니까?",
				Arrays.asList("Eclipse", "IntelliJIDEA", "Sublime"));
		Question q3 = new Question("당신의 역할은 무엇입니까?");
		return Arrays.asList(q1,q2,q3);
		
	}
}
