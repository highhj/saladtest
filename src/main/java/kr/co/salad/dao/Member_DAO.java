package kr.co.salad.dao;

import java.sql.SQLException;

import kr.co.salad.vo.Member_DTO;


public interface Member_DAO {
	//회원정보 얻기
		public Member_DTO getMember(String userid) throws ClassNotFoundException, SQLException;
			
		//회원가입
		public int insert(Member_DTO member) throws ClassNotFoundException, SQLException;
		
}
