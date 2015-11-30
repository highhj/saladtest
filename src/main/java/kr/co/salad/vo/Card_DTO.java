package kr.co.salad.vo;

import java.sql.Date;

public class Card_DTO {
	private int c_num;					//NUMBER
	private String c_title;				//VARCHAR2(200)
	private String c_content;			//VARCHAR2(1000)
	private String c_label;				//VARCHAR2(20)
	private Date c_date;					//DATE
	public int getC_num() {
		return c_num;
	}
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	public String getC_title() {
		return c_title;
	}
	public void setC_title(String c_title) {
		this.c_title = c_title;
	}
	public String getC_content() {
		return c_content;
	}
	public void setC_content(String c_content) {
		this.c_content = c_content;
	}
	public String getC_label() {
		return c_label;
	}
	public void setC_label(String c_label) {
		this.c_label = c_label;
	}
	public Date getC_date() {
		return c_date;
	}
	public void setC_date(Date c_date) {
		this.c_date = c_date;
	}
	
	
	@Override
	public String toString() {
		return "Card_DTO [c_num=" + c_num + ", c_title=" + c_title + ", c_content=" + c_content + ", c_label=" + c_label
				+ ", c_date=" + c_date + "]";
	}
	
	
	
	
}
