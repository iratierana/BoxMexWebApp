package simulagailua;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import DAO.PaketeDAO;
import databaseConn.DatabaseConnect;

/**
 * The Class PaketDbInsertor.
 */
@Path("/packetInsertor")
public class PaketDbInsertor {

	/** The Constant PORT. */
	private static final int PORT = 5432;

	/**
	 * Insert paket in database.
	 *
	 * @param paketInXML
	 *            the paket in XML
	 */
	@POST
	@Consumes("application/x-www-form-urlencoded")
	public void insertPaketInDatabase(@FormParam("paketInXML") final String paketInXML) {
		DatabaseConnect.connectToTheDatabase("localhost", PORT, "BoxMexDatabase", "boxmexadmin", "1234");
		PaketeDAO.insertPaketInDatabase(paketInXML);
		DatabaseConnect.disconnectFromTheDatabase();
	}

}
