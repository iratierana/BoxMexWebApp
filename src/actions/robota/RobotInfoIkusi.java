package actions.robota;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import databaseConn.DatabaseConnect;
import entitys.system.Robot;
import entitys.system.Usuario;

public class RobotInfoIkusi {
	
	Map<String, Object> session;
	Robot robotIrtera = null;
	Robot robotSarrera = null;
	
	public String execute(){
				
		robotSarrera = robotarenInformazioaIkusi(2, "entrada");
		robotIrtera = robotarenInformazioaIkusi(1, "salida");
		
		return "goToRobotInfo";
	}
	
	private Robot robotarenInformazioaIkusi(int robotId, String tipo){
		
		Robot robot = null;
		Usuario loggedUser = null;
		
		session = ActionContext.getContext().getSession();
		loggedUser = (Usuario) session.get("loggedUser");
		
		switch (loggedUser.getTipoUsuario()) {
		case "A":
			DatabaseConnect.connectToTheDatabase("localhost", 5432, "BoxMexDatabase", "boxmexadmin", "1234");
			robot = infoRobotConsulta(robotId, tipo);
			break;
		case "P":
			DatabaseConnect.connectToTheDatabase("localhost", 5432, "BoxMexDatabase", "boxmexpeon", "1234");
			robot = infoRobotConsulta(robotId, tipo);
			break;
		}
		
		return robot;
	}
	
	private Robot infoRobotConsulta(int robotId, String tipo){
		
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

 	public Robot getRobotIrtera() {
		return robotIrtera;
	}

	public void setRobotIrtera(Robot robotIrtera) {
		this.robotIrtera = robotIrtera;
	}

	public Robot getRobotSarrera() {
		return robotSarrera;
	}

	public void setRobotSarrera(Robot robotSarrera) {
		this.robotSarrera = robotSarrera;
	}



}
