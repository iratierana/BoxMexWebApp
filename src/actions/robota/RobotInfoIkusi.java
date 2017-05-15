package actions.robota;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import entitys.system.Robot;

public class RobotInfoIkusi {
		
	Robot robotIrtera = null;
	Robot robotSarrera = null;
	
	public String execute(){
				
		robotIrtera = webZerbitzuaDeituEtaRobotaKargatu(1, "entrada");
		robotIrtera = webZerbitzuaDeituEtaRobotaKargatu(2, "salida");
		
		return "goToRobotInfo";
	}
	
	private Robot webZerbitzuaDeituEtaRobotaKargatu(int robotId, String tipo){
		
		Client client = null;
		Robot robot = null;		
		
		try {
			
			client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/BoxMexWebApp/robotInfo/"+robotId+"/"+tipo);
			ClientResponse response = webResource.accept(MediaType.TEXT_PLAIN).get(ClientResponse.class);
			
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}			
			
			String result = response.getEntity(String.class);
			System.out.println("Robot "+robotId+": \n"+result);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			client.destroy();
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
