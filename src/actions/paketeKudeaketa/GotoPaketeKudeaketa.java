package actions.paketeKudeaketa;

import java.util.ArrayList;

import DAO.PaketeDAO;
import databaseConn.DatabaseConnect;
import entitys.system.Pakete;

/**
 * The Class GotoPaketeKudeaketa.
 */
public class GotoPaketeKudeaketa {

	/** The Constant PORT. */
	private static final int PORT = 5432;

	/** The list pake entrada. */
	ArrayList<Pakete> listPakeEntrada;

	/** The id list pake entrada. */
	ArrayList<Integer> idListPakeEntrada;

	/**
	 * Actualizar la lista de paketes y redireccionar a la pagina determinada.
	 *
	 * @return the string
	 */
	public String execute() {
		DatabaseConnect.connectToTheDatabase("localhost", PORT, "BoxMexDatabase", "boxmexadmin", "1234");
		listPakeEntrada = PaketeDAO.actualizarListaPaquetesEstrada();
		DatabaseConnect.disconnectFromTheDatabase();
		idListPakeEntradaBete();
		return "goToPaketeKudeaketa";
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
	 * Gets the list pake entrada.
	 *
	 * @return the list pake entrada
	 */
	public ArrayList<Pakete> getListPakeEntrada() {
		return listPakeEntrada;
	}

	/**
	 * Sets the list pake entrada.
	 *
	 * @param listPakeEntrada the new list pake entrada
	 */
	public void setListPakeEntrada(final ArrayList<Pakete> listPakeEntrada) {
		this.listPakeEntrada = listPakeEntrada;
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

}
