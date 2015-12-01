package kr.co.salad.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class JoinController {
private static final Logger logger = LoggerFactory.getLogger(JoinController.class);
	
@RequestMapping("/join.do")
public ModelAndView main() {
	
	ModelAndView mav = new ModelAndView("main");
	mav.setViewName("/join/joinForm");
	
	return mav; 
	}

}
