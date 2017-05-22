package simulagailua;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import DAO.PaketeDAO;
import databaseConn.DatabaseConnect;

@Path("/packetInsertor")
public class PaketDbInsertor {
	
	@POST
	@Consumes("application/x-www-form-urlencoded")
	public void insertPaketInDatabase(@FormParam("paketInXML")String paketInXML){
		DatabaseConnect.connectToTheDatabase("localhost", 5432, "BoxMexDatabase", "boxmexadmin", "1234");
		PaketeDAO.insertPaketInDatabase(paketInXML);
		DatabaseConnect.disconnectFromTheDatabase();
	}

}
