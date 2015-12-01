package kr.co.salad.vo;

public class Authority_DTO {
	private int	m_num;				//NUMBER
	private String role_name;		//VARCHAR2(20)
	private int p_num;				//NUMBER
	private int m_num2;			//NUMBER
	private String a_state;	 		//VARCHAR2(20)
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public int getP_num() {
		return p_num;
	}
	public void setP_num(int p_num) {
		this.p_num = p_num;
	}
	public int getM_num2() {
		return m_num2;
	}
	public void setM_num2(int m_num2) {
		this.m_num2 = m_num2;
	}
	public String getA_state() {
		return a_state;
	}
	public void setA_state(String a_state) {
		this.a_state = a_state;
	}
	@Override
	public String toString() {
		return "Authority_DTO [m_num=" + m_num + ", role_name=" + role_name + ", p_num=" + p_num + ", m_num2=" + m_num2
				+ ", a_state=" + a_state + "]";
	}

	
	

}
