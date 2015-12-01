package kr.co.salad.ajax;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.salad.mybatis.MemberDAOImpl;
import kr.co.salad.vo.Member_DTO;

@Controller
public class joinResponseAjaxData {
	
	private static final Logger logger = LoggerFactory.getLogger(joinResponseAjaxData.class);
	
	@Resource(name="memberDAOImpl")
	private MemberDAOImpl memberDAOImpl;
	
	@RequestMapping("joinAjax.do")
	public ModelAndView main(HttpServletRequest request) {
		
		String result = "0";
		
		logger.info("User Join AjaxData");
		
		ModelAndView mav = new ModelAndView("main");
		mav.setViewName("ajax/joinAjaxData");
		
		String m_email = request.getParameter("m_email");
		String m_pwd = request.getParameter("m_pwd");
		String m_name = request.getParameter("m_name");
		
		Member_DTO memberDTO = new Member_DTO();
		memberDTO.setM_email(m_email);
		memberDTO.setM_pwd(m_pwd);
		memberDTO.setM_name(m_name);
		
		System.out.println(memberDTO.getM_email());
		
		int resultValue = 0; 
		
		try { resultValue = memberDAOImpl.insert(memberDTO) ; } catch(Exception e) {}
		
		if (resultValue == 1) {
			result ="1";
		}
		mav.addObject("result", result);
		return mav; 
		
	}
}

