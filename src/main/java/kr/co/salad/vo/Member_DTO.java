package kr.co.salad.vo;

public class Member_DTO {
	private int m_num;						//NUMBER
	private String m_email; 				//VARCHAR2(20)
	private String m_pwd;					//VARCHAR2(20)
	private String m_name;				//VARCHAR2(20)
	private String m_dept;					//VARCHAR2(20)
	private String m_job;					//VARCHAR2(20)
	private String m_phone;				//VARCHAR2(20)
	private String m_enabled;				//VARCHAR2(2)
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public String getM_pwd() {
		return m_pwd;
	}
	public void setM_pwd(String m_pwd) {
		this.m_pwd = m_pwd;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_dept() {
		return m_dept;
	}
	public void setM_dept(String m_dept) {
		this.m_dept = m_dept;
	}
	public String getM_job() {
		return m_job;
	}
	public void setM_job(String m_job) {
		this.m_job = m_job;
	}
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	public String getM_enabled() {
		return m_enabled;
	}
	public void setM_enabled(String m_enabled) {
		this.m_enabled = m_enabled;
	}
	@Override
	public String toString() {
		return "Member_DTO [m_num=" + m_num + ", m_email=" + m_email + ", m_pwd=" + m_pwd + ", m_name=" + m_name
				+ ", m_dept=" + m_dept + ", m_job=" + m_job + ", m_phone=" + m_phone + ", m_enabled=" + m_enabled + "]";
	}
	
	
	
	
	
}
