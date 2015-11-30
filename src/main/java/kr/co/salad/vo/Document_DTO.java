package kr.co.salad.vo;

public class Document_DTO {
	private int d_num;					//NUMBER
	private String d_name;     		//VARCHAR(200)
	private String d_type;				//VARCHAR(20)
	public int getD_num() {
		return d_num;
	}
	public void setD_num(int d_num) {
		this.d_num = d_num;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public String getD_type() {
		return d_type;
	}
	public void setD_type(String d_type) {
		this.d_type = d_type;
	}
	@Override
	public String toString() {
		return "Document_DTO [d_num=" + d_num + ", d_name=" + d_name + ", d_type=" + d_type + "]";
	}
	
	
}
