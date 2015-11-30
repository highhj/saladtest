package kr.co.salad.vo;

public class Role_DTO {
	private int ROLE_AUTHORITY;			//NUMBER
	private String ROLE_NAME;				//VARCHAR2(20)
	public int getROLE_AUTHORITY() {
		return ROLE_AUTHORITY;
	}
	public void setROLE_AUTHORITY(int rOLE_AUTHORITY) {
		ROLE_AUTHORITY = rOLE_AUTHORITY;
	}
	public String getROLE_NAME() {
		return ROLE_NAME;
	}
	public void setROLE_NAME(String rOLE_NAME) {
		ROLE_NAME = rOLE_NAME;
	}
	
	
	@Override
	public String toString() {
		return "Role_DTO [ROLE_AUTHORITY=" + ROLE_AUTHORITY + ", ROLE_NAME=" + ROLE_NAME + "]";
	}



}
