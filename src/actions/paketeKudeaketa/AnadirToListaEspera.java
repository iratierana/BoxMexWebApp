package actions.paketeKudeaketa;

import java.util.ArrayList;

import DAO.PaketeDAO;
import databaseConn.DatabaseConnect;
import entitys.system.Pakete;
import varGlobal.VariablesGlobales;

/**
 * The Class AnadirToListaEspera.
 */
public class AnadirToListaEspera {

	/** The Constant PORT. */
	private static final int PORT = 5432;

	/** The list paketes de entrada. */
	ArrayList<Pakete> listPakeEntrada;

	/** The id list pakete entrada. */
	ArrayList<Integer> idListPakeEntrada;

	/** The pakete select. */
	int paketeSelect;

	/**
	 * Adds the selected paket to sleep list in order to get with a web servie.
	 *
	 * @return the string
	 */
	public String execute() {
		DatabaseConnect.connectToTheDatabase("localhost", PORT, "BoxMexDatabase", "boxmexadmin", "1234");
		Pakete pakete = PaketeDAO.cargarPakete(paketeSelect, "quieto");
		VariablesGlobales.listaPakEnEsperaParaIA.add(pakete);
		PaketeDAO.cambiarEstadoToPakete(paketeSelect, "quieto");
		listPakeEntrada = PaketeDAO.actualizarListaPaquetesEstrada();

		DatabaseConnect.disconnectFromTheDatabase();
		idListPakeEntradaBete();
		return "ok";
	}

	/**
	 * Id list pake entrada bete.
	 */
	private void idListPakeEntradaBete() {
		idListPakeEntrada = new ArrayList<Integer>();
		for (Pakete p : listPakeEntrada) {
			idListPakeEntrada.add(p.getId());
		}

	}

	/**
	 * Gets the id list pake entrada.
	 *
	 * @return the id list pake entrada
	 */
	public ArrayList<Integer> getIdListPakeEntrada() {
		return idListPakeEntrada;
	}

	/**
	 * Sets the id list pake entrada.
	 *
	 * @param idListPakeEntrada the new id list pake entrada
	 */
	public void setIdListPakeEntrada(final ArrayList<Integer> idListPakeEntrada) {
		this.idListPakeEntrada = idListPakeEntrada;
	}

	/**
	 * Gets the pakete select.
	 *
	 * @return the pakete select
	 */
	public int getPaketeSelect() {
		return paketeSelect;
	}

	/**
	 * Sets the pakete select.
	 *
	 * @param paketeSelect the new pakete select
	 */
	public void setPaketeSelect(final int paketeSelect) {
		this.paketeSelect = paketeSelect;
	}

}
