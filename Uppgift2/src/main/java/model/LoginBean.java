package model;

public class LoginBean {

	
	private String showLogin;
	
	
	
	public String getShowUser() {
		System.out.println("LoginBean -> getshowUser");	
		return showLogin;
	}
	
	
	public void setShowUser (String showUser) {
		System.out.println("LoginBean -> setshowAdmin" + showUser);
		this.showLogin = showUser;
	}
	
	
	
	/*
	public String getShowModerator() {
		System.out.println("LoginBean -> getShowModerator");	
		return showLogin;
	}
	
	
	public void setShowModerator (String showModerator) {
		System.out.println("LoginBean -> setshowModerator"+showModerator);
		this.showLogin = showModerator;
	}
	
	
*/

}