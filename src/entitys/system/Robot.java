package entitys.system;

public class Robot {
	
	int robotId;
	String tipoRobot;
	int paquetesDepositados;
	int almacenId;
	
	public Robot(int robotId, String tipoRobot, int paquetesDepositados, int almacenId) {
		this.robotId = robotId;
		this.tipoRobot = tipoRobot;
		this.paquetesDepositados = paquetesDepositados;
		this.almacenId = almacenId;
	}

	public int getRobotId() {
		return robotId;
	}

	public void setRobotId(int robotId) {
		this.robotId = robotId;
	}

	public String getTipoRobot() {
		return tipoRobot;
	}

	public void setTipoRobot(String tipoRobot) {
		this.tipoRobot = tipoRobot;
	}

	public int getPaquetesDepositados() {
		return paquetesDepositados;
	}

	public void setPaquetesDepositados(int paquetesDepositados) {
		this.paquetesDepositados = paquetesDepositados;
	}

	public int getAlmacenId() {
		return almacenId;
	}

	public void setAlmacenId(int almacenId) {
		this.almacenId = almacenId;
	}

}
