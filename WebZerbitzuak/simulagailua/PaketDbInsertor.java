package simulagailua;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import DAO.PaketeDAO;
import databaseConn.DatabaseConnect;
import entitys.system.Pakete;
import entitys.system.Producto;

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
	 * @param paketInJson
	 *            the paket in XML
	 */
	@POST
	@Consumes("application/x-www-form-urlencoded")
	public void insertPaketInDatabase(@FormParam("paketInXML") final String paketInJson) {
		DatabaseConnect.connectToTheDatabase("localhost", PORT, "BoxMexDatabase", "boxmexadmin", "1234");
		PaketeDAO.insertPaketInDatabase(loadPakete(paketInJson));
		DatabaseConnect.disconnectFromTheDatabase();
	}

	/**
	 * Load pakete.
	 *
	 * @param paketeStr the pakete str
	 * @return the pakete
	 */
	private Pakete loadPakete(final String paketeStr) {
		Pakete pakete = null;
		ArrayList<Producto> listProd = new ArrayList<Producto>();

		try {

			StringReader reader = new StringReader(paketeStr);
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

			JSONArray arrayProductos = (JSONArray) jsonObject.get("listaProductos");

			for (int kont = 0; kont < arrayProductos.size(); kont++) {
				JSONObject producto = (JSONObject) arrayProductos.get(kont);
				Producto p = new Producto(1, (String) producto.get("nombre"), (String) producto.get("fechaCaducidad"),
						(Long) producto.get("estanteriaId"), (Long) producto.get("categoriaId"));
				listProd.add(p);
			}
			pakete = new Pakete(1, listProd, "entrada");

		} catch (IOException e) {
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return pakete;
	}

}
