package model;

public class LoginHandler {
	

		private static String user1 = "Ismail";
		private static String user2 = "Maria";

	
		
		public static String getLoginInfo(String ShowUser) {
			
			System.out.println("loginHandler -> getLoginInfo");
			System.out.println(ShowUser);
			

			if (ShowUser.equals("user1")) {
				System.out.println("LoginHandler -> success");
				return user1;

			} else if (ShowUser.equals("user2")) {
				System.out.println("LoginHandler -> wrong");
				return user2;
			}
			return "ERRROR";

		}


}
