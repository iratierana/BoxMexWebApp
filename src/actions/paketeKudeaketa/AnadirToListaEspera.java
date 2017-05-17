package actions.paketeKudeaketa;

import java.util.ArrayList;

import DAO.PaketeDAO;
import databaseConn.DatabaseConnect;
import entitys.system.Pakete;
import varGlobal.VariablesGlobales;

public class AnadirToListaEspera {
	
	ArrayList<Pakete> listPakeEntrada;	
	ArrayList<Integer> idListPakeEntrada;
	int paketeSelect;
	
	public String execute(){
		DatabaseConnect.connectToTheDatabase("localhost", 5432, "BoxMexDatabase", "boxmexadmin", "1234");
		Pakete pakete = PaketeDAO.cargarPakete(paketeSelect);
		VariablesGlobales.listaPakEnEsperaParaIA.add(pakete);
		PaketeDAO.cambiarEstadoToPakete(paketeSelect, "quieto");
		listPakeEntrada = PaketeDAO.actualizarListaPaquetesEstrada();
		
		DatabaseConnect.disconnectToFromTheDatabase();
		idListPakeEntradaBete();
		return "ok";
	}
	
	
	private void idListPakeEntradaBete(){
		idListPakeEntrada= new ArrayList<Integer>();
		for(Pakete p : listPakeEntrada){
			idListPakeEntrada.add(p.getId());
		}
	
	}
	
	public ArrayList<Integer> getIdListPakeEntrada() {
		return idListPakeEntrada;
	}


	public void setIdListPakeEntrada(ArrayList<Integer> idListPakeEntrada) {
		this.idListPakeEntrada = idListPakeEntrada;
	}


	public int getPaketeSelect() {
		return paketeSelect;
	}


	public void setPaketeSelect(int paketeSelect) {
		this.paketeSelect = paketeSelect;
	}
	
	

}
