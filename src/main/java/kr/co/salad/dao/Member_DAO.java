package kr.co.salad.dao;

import java.sql.SQLException;
import java.util.Map;

import kr.co.salad.vo.Member_DTO;


public interface Member_DAO {
			
		public int insert(Member_DTO member) throws ClassNotFoundException, SQLException;
		public int getLoginResult(Map<String, String> map);
		public Member_DTO getUserInfo(String m_email);
		public int getUserIdCheck(String m_email);
		
}
