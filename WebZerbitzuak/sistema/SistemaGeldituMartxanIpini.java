package sistema;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import varGlobal.VariablesGlobales;

@Path("/sysOnOff")
public class SistemaGeldituMartxanIpini {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getEstadoDeSistema(){				
		return String.valueOf(VariablesGlobales.sistemaOsoaGeldiEdoMartxan);
	}		
}
