package databaseConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnect {

	public static Connection conn = null;
	
	public static boolean connectToTheDatabase(String ip, int port,String databaseName, String username, String password){
		
		try{
			boolean connectionResult = false;
			String dbURL3 = "jdbc:postgresql://"+ip+":"+port+"/"+databaseName+"";
	        Properties parameters = new Properties();
	        parameters.put("user", username);
	        parameters.put("password", password);

	        conn = DriverManager.getConnection(dbURL3, parameters);
	        if (conn != null) {
	            connectionResult =  true;
	        }
	        return connectionResult;
	        
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
		
	}

	public static boolean disconnectToFromTheDatabase(){
		boolean closingOk = false;
		try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                closingOk = true;
            }
            return closingOk;
        } catch (SQLException e) {
            e.printStackTrace();
            return closingOk;
        }
	}

}
