package simulagailua;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import DAO.PaketeDAO;
import entitys.system.Pakete;

/**
 * The Class GetPacketFromDB.
 */
@Path("/listaSalida")
public class GetPacketFromDB {

	/**
	 * Generar pakete.
	 *
	 * @return the pakete
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Pakete generarPakete() {
		Pakete pakete = null;
		int paketeId = PaketeDAO.cargarprimerPaketeQuietoId();
		if (paketeId != -1) {
			pakete = PaketeDAO.cargarPakete(paketeId, "salida");
		}
		return pakete;
	}

}
