package kr.co.salad.vo;

import java.sql.Date;

public class Reply_DTO {
	private int r_num;					//NUMBER
	private String r_content;			//VARCHAR(500)
	private Date r_date;					//DATE
	public int getR_num() {
		return r_num;
	}
	public void setR_num(int r_num) {
		this.r_num = r_num;
	}
	public String getR_content() {
		return r_content;
	}
	public void setR_content(String r_content) {
		this.r_content = r_content;
	}
	public Date getR_date() {
		return r_date;
	}
	public void setR_date(Date r_date) {
		this.r_date = r_date;
	}
	@Override
	public String toString() {
		return "Reply_DTO [r_num=" + r_num + ", r_content=" + r_content + ", r_date=" + r_date + "]";
	}

	

}
