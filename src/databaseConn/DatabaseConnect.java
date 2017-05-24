package databaseConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * The Class DatabaseConnect.
 */
public class DatabaseConnect {

	/** The connection variable. */
	public static Connection conn = null;

	/**
	 * Connect to the database and open a connection.
	 *
	 * @param ip the ip
	 * @param port the port
	 * @param databaseName the database name
	 * @param username the username
	 * @param password the password
	 * @return true, if successful
	 */
	public static boolean connectToTheDatabase(final String ip, final int port, final String databaseName, final String username,
			final String password) {

		try {
			boolean connectionResult = false;
			Class.forName("org.postgresql.Driver");
			String dbURL3 = "jdbc:postgresql://" + ip + ":" + port + "/" + databaseName + "";
			Properties parameters = new Properties();
			parameters.put("user", username);
			parameters.put("password", password);

			conn = DriverManager.getConnection(dbURL3, parameters);
			if (conn != null) {
				connectionResult = true;
			}
			return connectionResult;

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}

	}

	/**
	 * Close the connection from the database.
	 *
	 * @return true, if successful
	 */
	public static boolean disconnectFromTheDatabase() {
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
