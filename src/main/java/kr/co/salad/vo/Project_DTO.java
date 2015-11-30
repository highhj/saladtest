package kr.co.salad.vo;

import java.sql.Date;

public class Project_DTO {

	private int p_num;						//NUMBER
	private String p_name;					//VARCHAR2(200)
	private Date p_date;					//DATE
	private Date p_endDate;				//DATE
	private String p_state;					//VARCHAR2(20)
	private String p_goal;					//VARCHAR2(500)
	public int getP_num() {
		return p_num;
	}
	public void setP_num(int p_num) {
		this.p_num = p_num;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public Date getP_date() {
		return p_date;
	}
	public void setP_date(Date p_date) {
		this.p_date = p_date;
	}
	public Date getP_endDate() {
		return p_endDate;
	}
	public void setP_endDate(Date p_endDate) {
		this.p_endDate = p_endDate;
	}
	public String getP_state() {
		return p_state;
	}
	public void setP_state(String p_state) {
		this.p_state = p_state;
	}
	public String getP_goal() {
		return p_goal;
	}
	public void setP_goal(String p_goal) {
		this.p_goal = p_goal;
	}
	@Override
	public String toString() {
		return "Project_DTO [p_num=" + p_num + ", p_name=" + p_name + ", p_date=" + p_date + ", p_endDate=" + p_endDate
				+ ", p_state=" + p_state + ", p_goal=" + p_goal + "]";
	}

	


}
