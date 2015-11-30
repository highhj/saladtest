package kr.co.salad.vo;

public class Image_DTO {
	private int i_num;				//NUMBER
	private String i_fileName;		//VARCHAR(200)
	private String i_fileType;		//VARCHAR(20)
	public int getI_num() {
		return i_num;
	}
	public void setI_num(int i_num) {
		this.i_num = i_num;
	}
	public String getI_fileName() {
		return i_fileName;
	}
	public void setI_fileName(String i_fileName) {
		this.i_fileName = i_fileName;
	}
	public String getI_fileType() {
		return i_fileType;
	}
	public void setI_fileType(String i_fileType) {
		this.i_fileType = i_fileType;
	}
	@Override
	public String toString() {
		return "Image_DTO [i_num=" + i_num + ", i_fileName=" + i_fileName + ", i_fileType=" + i_fileType + "]";
	}

	

}
