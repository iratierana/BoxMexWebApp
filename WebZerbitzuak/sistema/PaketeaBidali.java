package sistema;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entitys.system.Pakete;
import varGlobal.VariablesGlobales;

@Path("/listaEspera")
public class PaketeaBidali {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Pakete cojerPaketeDeLaListaDeEspera(){
		
		Pakete pakete = null;
		try {
			
			pakete = VariablesGlobales.listaPakEnEsperaParaIA.get(0);
			VariablesGlobales.listaPakEnEsperaParaIA.remove(0);
			
		} catch(IndexOutOfBoundsException e){
			System.out.println("La lista de espera esta vacio");
		}catch (Exception e) {
			e.printStackTrace();
		}		
		
		return pakete;
	}

	
}
