package sistema;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entitys.system.Pakete;
import varGlobal.VariablesGlobales;

/**
 * The Class PaketeaBidali.
 */
@Path("/listaEspera")
public class PaketeaBidali {

	/**
	 * Coger pakete de la lista de espera.
	 *
	 * @return the pakete
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Pakete cojerPaketeDeLaListaDeEspera() {

		Pakete pakete = null;
		try {

			pakete = VariablesGlobales.getListaPakEnEsperaParaIA().get(0);
			VariablesGlobales.getListaPakEnEsperaParaIA().remove(0);

		} catch (IndexOutOfBoundsException e) {
		} catch (Exception e) {
			e.printStackTrace();
		}

		return pakete;
	}

}
