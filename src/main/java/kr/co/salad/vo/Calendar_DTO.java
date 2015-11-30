package kr.co.salad.vo;

import java.sql.Date;

public class Calendar_DTO {
	private int ca_num; 					//	NUMBER
	private String ca_title; 					//	VARCHAR2(200)
	private Date ca_date; 					//	DATE
	private Date ca_startDate;  			//DATE
	private Date ca_endDate;	 			//DATE
	private String ca_importance; 		//VARCHAR2(20)
	private int p_num;						//NUMBER
	
	
	
	public int getCa_num() {
		return ca_num;
	}
	public void setCa_num(int ca_num) {
		this.ca_num = ca_num;
	}
	public String getCa_title() {
		return ca_title;
	}
	public void setCa_title(String ca_title) {
		this.ca_title = ca_title;
	}
	public Date getCa_date() {
		return ca_date;
	}
	public void setCa_date(Date ca_date) {
		this.ca_date = ca_date;
	}
	public Date getCa_startDate() {
		return ca_startDate;
	}
	public void setCa_startDate(Date ca_startDate) {
		this.ca_startDate = ca_startDate;
	}
	public Date getCa_endDate() {
		return ca_endDate;
	}
	public void setCa_endDate(Date ca_endDate) {
		this.ca_endDate = ca_endDate;
	}
	public String getCa_importance() {
		return ca_importance;
	}
	public void setCa_importance(String ca_importance) {
		this.ca_importance = ca_importance;
	}
	public int getP_num() {
		return p_num;
	}
	public void setP_num(int p_num) {
		this.p_num = p_num;
	}
	@Override
	public String toString() {
		return "Calendar_DTO [ca_num=" + ca_num + ", ca_title=" + ca_title + ", ca_date=" + ca_date + ", ca_startDate="
				+ ca_startDate + ", ca_endDate=" + ca_endDate + ", ca_importance=" + ca_importance + ", p_num=" + p_num
				+ "]";
	}
	
}
