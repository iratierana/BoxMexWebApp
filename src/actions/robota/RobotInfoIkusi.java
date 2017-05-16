package actions.robota;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import DAO.RobotDAO;
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
			robot = RobotDAO.infoRobotConsulta(robotId, tipo);
			break;
		case "P":
			DatabaseConnect.connectToTheDatabase("localhost", 5432, "BoxMexDatabase", "boxmexpeon", "1234");
			robot = RobotDAO.infoRobotConsulta(robotId, tipo);
			break;
		}
		
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
