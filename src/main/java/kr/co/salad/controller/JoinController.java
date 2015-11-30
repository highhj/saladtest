package kr.co.salad.controller;


	import java.sql.SQLException;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

	import kr.co.salad.dao.Member_DAO;
import kr.co.salad.vo.Member_DTO;

	@Controller
	@RequestMapping("/join/") //   /joinus/join.htm
	public class JoinController {
	  
		@Autowired
		private Member_DAO member_DAO;
		
		@RequestMapping(value="join.htm" , method=RequestMethod.GET)
		public String join(){
			System.out.println("회원가입 페이지 요청");
			
			//return "join.jsp";
			
			//Tiles 적용
			return "joinus.join";
		}
		
		@RequestMapping(value="join.htm" , method=RequestMethod.POST)
		public String join(Member_DTO member) throws ClassNotFoundException, SQLException{
			//가입처리 (DAO 단)
			System.out.println(member.toString());
			member_DAO.insert(member);
			return "redirect:../index.htm"; //수정 요망(주의 사항)
		}
		
		
		@RequestMapping(value="login.htm" , method=RequestMethod.GET)
		public String login(){
			return "joinus.login";
		}
		
	

}
