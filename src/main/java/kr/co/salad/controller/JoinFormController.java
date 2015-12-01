package kr.co.salad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JoinFormController {
	
	@RequestMapping("/joinForm.do")
	public ModelAndView main() {
		
		ModelAndView mav = new ModelAndView("main");
		mav.setViewName("join/join");
		
		return mav; 
		
	}
}
