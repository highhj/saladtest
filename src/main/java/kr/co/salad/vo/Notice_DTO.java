package kr.co.salad.vo;

import java.sql.Date;

public class Notice_DTO {
	private int n_num;					//NUMBER
	private String n_title;				//VARCHAR2(200)
	private String n_content;			//VARCHAR2(2000)
	private Date n_date;				//DATE
	public int getN_num() {
		return n_num;
	}
	public void setN_num(int n_num) {
		this.n_num = n_num;
	}
	public String getN_title() {
		return n_title;
	}
	public void setN_title(String n_title) {
		this.n_title = n_title;
	}
	public String getN_content() {
		return n_content;
	}
	public void setN_content(String n_content) {
		this.n_content = n_content;
	}
	public Date getN_date() {
		return n_date;
	}
	public void setN_date(Date n_date) {
		this.n_date = n_date;
	}
	@Override
	public String toString() {
		return "Notice_DTO [n_num=" + n_num + ", n_title=" + n_title + ", n_content=" + n_content + ", n_date=" + n_date
				+ "]";
	}

	

}
