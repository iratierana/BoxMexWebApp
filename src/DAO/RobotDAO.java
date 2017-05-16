package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import databaseConn.DatabaseConnect;
import entitys.system.Robot;

public class RobotDAO {

	public static Robot infoRobotConsulta(int robotId, String tipo){

		Robot robot = null;
		try {
			PreparedStatement statement = DatabaseConnect.conn.prepareStatement("SELECT * FROM boxmexsystem.robot WHERE robotid = ? AND tiporobot = ?");
			statement.setInt(1, robotId);
			statement.setString(2, tipo);
			ResultSet rs = statement.executeQuery();
			while(rs.next()){
				robot = new Robot(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
			}
		} catch (SQLException e) {
			DatabaseConnect.disconnectToFromTheDatabase();
			e.printStackTrace();
		}

		DatabaseConnect.disconnectToFromTheDatabase();
		return robot;

	}

}
