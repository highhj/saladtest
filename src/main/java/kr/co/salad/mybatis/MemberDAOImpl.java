package kr.co.salad.mybatis;

import java.sql.SQLException;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import kr.co.salad.dao.Member_DAO;
import kr.co.salad.vo.Member_DTO;

public class MemberDAOImpl extends SqlSessionDaoSupport implements Member_DAO{

	@Override
	public int insert(Member_DTO member) throws ClassNotFoundException, SQLException {
		System.out.println("insert");
		return getSqlSession().update("Member_DAO.insertUser",member);
	}

	@Override
	public int getLoginResult(Map<String, String> map) {
		return (Integer) getSqlSession().selectOne("Member_DAO.getLoginResult",map);
	}

	@Override
	public Member_DTO getUserInfo(String m_email) {
		return (Member_DTO) getSqlSession().selectOne("Member_DAO.getUserInfo",m_email);
	}

	@Override
	public int getUserIdCheck(String m_email) {
		return (Integer) getSqlSession().selectOne("Member_DAO.getUserIdCheck",m_email);
	}

}
