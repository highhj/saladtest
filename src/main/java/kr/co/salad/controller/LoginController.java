package kr.co.salad.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.salad.mybatis.MemberDAOImpl;
import kr.co.salad.util.Util;
import kr.co.salad.vo.Member_DTO;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	Member_DTO memberDTO;

	@Resource(name="memberDAOImpl")
	private MemberDAOImpl memberDAOImpl;
	
	@RequestMapping("login.do")
	public ModelAndView main(HttpServletRequest request ) {
		
		HttpSession session = request.getSession();
		ModelAndView mav = new ModelAndView();
		
		
		Map<String, String> map = new HashMap<String, String>();
		
		String m_email= Util.nullCheck(request.getParameter("m_email"), "");
		String m_pwd = Util.nullCheck(request.getParameter("m_pwd"), "");
		System.out.println(m_email + "/ " + m_pwd);
		map.put("m_email",m_email);
		map.put("m_pwd", m_pwd);
		
		int loginValue = 0;
		
		try {  loginValue = memberDAOImpl.getLoginResult(map);  } catch (Exception e) { }
		
		
		if (loginValue == 1)
		{
			logger.info("로그인성공");
			mav.setViewName("blog/blogMain");
			memberDTO = memberDAOImpl.getUserInfo(m_email);
			
			session.setAttribute("m_email", memberDTO.getM_email());
			session.setAttribute("m_pwd", memberDTO.getM_pwd());
			session.setAttribute("m_name", memberDTO.getM_name());
		}
		else
		{
			logger.info("로그인실패");
			mav.setViewName("login/loginForm");
		}
		
		return mav; 
		
	}
}
