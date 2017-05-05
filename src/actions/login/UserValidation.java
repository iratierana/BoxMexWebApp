package actions.login;

public class UserValidation {
	
	String username;
	String password;
	
	public String execute(){
		
		System.out.println("Username: "+username+"\nPassword: "+password);
		
		switch (1) {
		case 1:
			return "accept";

		case 0:
			return "deny";
			
		default:
			return "deny";
		}
				
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
