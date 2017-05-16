package actions.login;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import DAO.UserDAO;
import databaseConn.DatabaseConnect;
import entitys.system.Usuario;

public class UserValidation {
	
	String username;
	String password;
	String returnValue = "deny";
	
	public String execute(){
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		DatabaseConnect.connectToTheDatabase("localhost", 5432, "BoxMexDatabase", "boxmexshareduser", "1234"); 
		Usuario user = UserDAO.comprobarUsuarioEnDB(username, password);
		DatabaseConnect.disconnectToFromTheDatabase();
		
		if(user != null){
			session.put("loggedUser", user);
			switch (user.getTipoUsuario()) {
			case "A":
				DatabaseConnect.connectToTheDatabase("localhost", 5432, "BoxMexDatabase", "boxmexadmin", "1234");
				returnValue = "acceptAdmin";
				break;
				
			case "P":
				DatabaseConnect.connectToTheDatabase("localhost", 5432, "BoxMexDatabase", "boxmexpeon", "1234");
				returnValue = "acceptPeon";
				break;
			
			}
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
