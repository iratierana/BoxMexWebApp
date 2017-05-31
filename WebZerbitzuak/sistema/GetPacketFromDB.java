package sistema;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import DAO.PaketeDAO;
import databaseConn.DatabaseConnect;
import entitys.system.Pakete;

/**
 * The Class GetPacketFromDB.
 */
@Path("/listaSalida")
public class GetPacketFromDB {

	/** The Constant PORT. */
	private static final int PORT = 5432;

	/**
	 * Generar pakete.
	 *
	 * @return the pakete
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Pakete generarPakete() {
		Pakete pakete = null;
		DatabaseConnect.connectToTheDatabase("localhost", PORT, "BoxMexDatabase", "boxmexadmin", "1234");
		int paketeId = PaketeDAO.cargarprimerPaketeQuietoId();
		if (paketeId != -1) {
			pakete = PaketeDAO.cargarPakete(paketeId, "salida");
			PaketeDAO.cambiarEstadoToPakete(paketeId, "salida");
		}
		DatabaseConnect.disconnectFromTheDatabase();
		return pakete;
	}

}
