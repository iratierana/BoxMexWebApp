package databaseConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import DAO.RobotDAO;

/**
 * The Class DatabaseConnect.
 */
public class DatabaseConnect {

	/** The connection variable. */
	private static Connection conn = null;
	
	static final Logger logger = Logger.getLogger(DatabaseConnect.class);

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

			setConn(DriverManager.getConnection(dbURL3, parameters));
			return connectionResult;

		} catch (SQLException | ClassNotFoundException e) {
			logger.info(e);
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
			if (getConn() != null && !getConn().isClosed()) {
				getConn().close();
				closingOk = true;
			}
			return closingOk;
		} catch (SQLException e) {
			logger.info(e);
			return closingOk;
		}
	}

	public static Connection getConn() {
		return conn;
	}

	public static void setConn(Connection conn) {
		DatabaseConnect.conn = conn;
	}

}
