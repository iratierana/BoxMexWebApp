package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import databaseConn.DatabaseConnect;
import entitys.system.Usuario;

public class UserDAO {
	
	public static Usuario comprobarUsuarioEnDB(String username, String pass){
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

}
