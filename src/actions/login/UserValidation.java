package actions.login;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import databaseConn.DatabaseConnect;
import entitys.system.Usuario;

public class UserValidation {
	
	String username;
	String password;
	String returnValue = "deny";
	
	public String execute(){
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		DatabaseConnect.connectToTheDatabase("localhost", 5432, "BoxMexDatabase", "boxmexshareduser", "1234"); 
		Usuario user = comprobarUsuarioEnDB(username, password);
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
	
	private Usuario comprobarUsuarioEnDB(String username, String pass){
		Usuario usuario = null;
		try {
			PreparedStatement statement = DatabaseConnect.conn.prepareStatement("SELECT * FROM boxmexsystem.usuarios WHERE username = ? AND pass = ?");
			statement.setString(1, username);
			statement.setString(2, pass);
			ResultSet rs = statement.executeQuery();
			while(rs.next()){
				usuario = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuario;
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
