package actions.login;

import databaseConn.DatabaseConnect;

public class UserValidation {
	
	String username;
	String password;
	String returnValue = "deny";
	
	public String execute(){
		
		DatabaseConnect.connectToTheDatabase("localhost", 5432, "BoxMexDatabase", "boxmexshareduser", "1234"); 
		
		switch (1) {
		case 1:
			returnValue = "acceptAdmin";
			break;
			
		case 2:
			returnValue = "acceptPeon";
			break;
		
		}
		return returnValue;
				
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
