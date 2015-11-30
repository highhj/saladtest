package kr.co.salad.vo;

import java.sql.Date;

public class ProjectMember_DTO {
	private int b_num;
	private String b_name;
	private Date b_date;
	private int p_num;
	
	public int getB_num() {
		return b_num;
	}
	public void setB_num(int b_num) {
		this.b_num = b_num;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public Date getB_date() {
		return b_date;
	}
	public void setB_date(Date b_date) {
		this.b_date = b_date;
	}
	public int getP_num() {
		return p_num;
	}
	public void setP_num(int p_num) {
		this.p_num = p_num;
	}
	
	
	
	@Override
	public String toString() {
		return "ProjectMember_DTO [b_num=" + b_num + ", b_name=" + b_name + ", b_date=" + b_date + ", p_num=" + p_num
				+ "]";
	}
}
