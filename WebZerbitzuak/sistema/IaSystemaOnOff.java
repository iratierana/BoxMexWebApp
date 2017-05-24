package sistema;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import varGlobal.VariablesGlobales;

/**
 * The Class IaSystemaOnOff.
 */
@Path("/iaSysOnOff")
public class IaSystemaOnOff {

	/**
	 * Coge the estado de sistema.
	 *
	 * @return estado del sistema
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getEstadoDeSistema() {
		return String.valueOf(VariablesGlobales.iaSistemaOnOff);
	}

}
