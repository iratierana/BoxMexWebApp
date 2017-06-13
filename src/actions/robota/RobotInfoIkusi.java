package actions.robota;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import DAO.RobotDAO;
import databaseConn.DatabaseConnect;
import entitys.system.Robot;
import entitys.system.Usuario;

/**
 * The Class RobotInfoIkusi.
 */
public class RobotInfoIkusi {

	/** The Constant PORT. */
	private static final int PORT = 5432;

	/** The session. */
	Map<String, Object> session;

	/** The robot irtera. */
	Robot robotIrtera = null;

	/** The robot sarrera. */
	Robot robotSarrera = null;

	/**
	 * Load the information of the 2 robots and redirect to the page.
	 *
	 * @return the robot info page name
	 */
	public String execute() {

		robotSarrera = robotarenInformazioaIkusi(2, "entrada");
		robotIrtera = robotarenInformazioaIkusi(1, "salida");

		return "goToRobotInfo";
	}

	/**
	 * Robotaren informazioa ikusi.
	 *
	 * @param robotId the robot id
	 * @param tipo the tipo
	 * @return the robot
	 */
	private Robot robotarenInformazioaIkusi(final int robotId, final String tipo) {

		Robot robot = null;
		Usuario loggedUser;

		session = ActionContext.getContext().getSession();
		loggedUser = (Usuario) session.get("loggedUser");

		switch (loggedUser.getTipoUsuario()) {
		case "A":
			DatabaseConnect.connectToTheDatabase("localhost", PORT, "BoxMexDatabase", "boxmexadmin", "1234");
			robot = RobotDAO.infoRobotConsulta(robotId, tipo);
			break;
		case "P":
			DatabaseConnect.connectToTheDatabase("localhost", PORT, "BoxMexDatabase", "boxmexpeon", "1234");
			robot = RobotDAO.infoRobotConsulta(robotId, tipo);
			break;
		default:
			break;
		}

		return robot;
	}

	/**
	 * Gets the robot irtera.
	 *
	 * @return the robot irtera
	 */
	public Robot getRobotIrtera() {
		return robotIrtera;
	}

	/**
	 * Sets the robot irtera.
	 *
	 * @param robotIrtera the new robot irtera
	 */
	public void setRobotIrtera(final Robot robotIrtera) {
		this.robotIrtera = robotIrtera;
	}

	/**
	 * Gets the robot sarrera.
	 *
	 * @return the robot sarrera
	 */
	public Robot getRobotSarrera() {
		return robotSarrera;
	}

	/**
	 * Sets the robot sarrera.
	 *
	 * @param robotSarrera the new robot sarrera
	 */
	public void setRobotSarrera(final Robot robotSarrera) {
		this.robotSarrera = robotSarrera;
	}

}
