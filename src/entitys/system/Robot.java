package entitys.system;

/**
 * The Class Robot.
 */
public class Robot {

	/** The robot id. */
	int robotId;

	/** The tipo robot. */
	String tipoRobot;

	/** The paquetes depositados. */
	int paquetesDepositados;

	/** The almacen id. */
	int almacenId;

	/**
	 * Instantiates a new robot.
	 *
	 * @param robotId the robot id
	 * @param tipoRobot the tipo robot
	 * @param paquetesDepositados the paquetes depositados
	 * @param almacenId the almacen id
	 */
	public Robot(final int robotId, final String tipoRobot, final int paquetesDepositados, final int almacenId) {
		this.robotId = robotId;
		this.tipoRobot = tipoRobot;
		this.paquetesDepositados = paquetesDepositados;
		this.almacenId = almacenId;
	}

	/**
	 * Gets the robot id.
	 *
	 * @return the robot id
	 */
	public int getRobotId() {
		return robotId;
	}

	/**
	 * Sets the robot id.
	 *
	 * @param robotId the new robot id
	 */
	public void setRobotId(final int robotId) {
		this.robotId = robotId;
	}

	/**
	 * Gets the tipo robot.
	 *
	 * @return the tipo robot
	 */
	public String getTipoRobot() {
		return tipoRobot;
	}

	/**
	 * Sets the tipo robot.
	 *
	 * @param tipoRobot the new tipo robot
	 */
	public void setTipoRobot(final String tipoRobot) {
		this.tipoRobot = tipoRobot;
	}

	/**
	 * Gets the paquetes depositados.
	 *
	 * @return the paquetes depositados
	 */
	public int getPaquetesDepositados() {
		return paquetesDepositados;
	}

	/**
	 * Sets the paquetes depositados.
	 *
	 * @param paquetesDepositados the new paquetes depositados
	 */
	public void setPaquetesDepositados(final int paquetesDepositados) {
		this.paquetesDepositados = paquetesDepositados;
	}

	/**
	 * Gets the almacen id.
	 *
	 * @return the almacen id
	 */
	public int getAlmacenId() {
		return almacenId;
	}

	/**
	 * Sets the almacen id.
	 *
	 * @param almacenId the new almacen id
	 */
	public void setAlmacenId(final int almacenId) {
		this.almacenId = almacenId;
	}

}
