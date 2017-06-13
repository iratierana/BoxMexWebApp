package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import databaseConn.DatabaseConnect;
import entitys.system.Robot;

/**
 * The Class RobotDAO.
 */
public class RobotDAO {

	/** The Constant Parametro_1. */
	private static final int PARAMETRO_1 = 1;

	/** The Constant Parametro_2. */
	private static final int PARAMETRO_2 = 2;

	/** The Constant Parametro_3. */
	private static final int PARAMETRO_3 = 3;

	/** The Constant Parametro_4. */
	private static final int PARAMETRO_4 = 4;
	
	static final Logger logger = Logger.getLogger(RobotDAO.class);

	/**
	 * Gets the information of the robot from the databases.
	 *
	 * @param robotId the robot id
	 * @param tipo the tipo
	 * @return the robot
	 */
	public static Robot infoRobotConsulta(final int robotId, final String tipo) {

		Robot robot = null;
		try {
			PreparedStatement statement = DatabaseConnect.getConn()
					.prepareStatement("SELECT * FROM boxmexsystem.robot WHERE robotid = ? AND tiporobot = ?");
			statement.setInt(1, robotId);
			statement.setString(2, tipo);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				robot = new Robot(rs.getInt(PARAMETRO_1), rs.getString(PARAMETRO_2), rs.getInt(PARAMETRO_3), rs.getInt(PARAMETRO_4));
			}
		} catch (SQLException e) {
			DatabaseConnect.disconnectFromTheDatabase();
			logger.info(e);
		}

		DatabaseConnect.disconnectFromTheDatabase();
		return robot;

	}

}
