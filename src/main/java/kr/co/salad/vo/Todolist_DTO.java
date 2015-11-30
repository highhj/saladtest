package kr.co.salad.vo;

import java.sql.Date;

public class Todolist_DTO {
	private int t_num;					//NUMBER
	private String t_tilte;				//VARCHAR2(200)
	private String t_content;			//VARCHAR2(500)
	private Date t_date;					//DATE
	private String t_state;				//VARCHAR2(20)
	private String t_target;				//VARCHAR2(20)
	public int getT_num() {
		return t_num;
	}
	public void setT_num(int t_num) {
		this.t_num = t_num;
	}
	public String getT_tilte() {
		return t_tilte;
	}
	public void setT_tilte(String t_tilte) {
		this.t_tilte = t_tilte;
	}
	public String getT_content() {
		return t_content;
	}
	public void setT_content(String t_content) {
		this.t_content = t_content;
	}
	public Date getT_date() {
		return t_date;
	}
	public void setT_date(Date t_date) {
		this.t_date = t_date;
	}
	public String getT_state() {
		return t_state;
	}
	public void setT_state(String t_state) {
		this.t_state = t_state;
	}
	public String getT_target() {
		return t_target;
	}
	public void setT_target(String t_target) {
		this.t_target = t_target;
	}
	
	
	@Override
	public String toString() {
		return "Todolist_DTO [t_num=" + t_num + ", t_tilte=" + t_tilte + ", t_content=" + t_content + ", t_date="
				+ t_date + ", t_state=" + t_state + ", t_target=" + t_target + "]";
	}

	

}
