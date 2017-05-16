package actions.paketeKudeaketa;

import java.util.ArrayList;

import DAO.PaketeDAO;
import databaseConn.DatabaseConnect;
import entitys.system.Pakete;

public class GotoPaketeKudeaketa {
	
	ArrayList<Pakete> listPakeEntrada;	
	ArrayList<Integer> idListPakeEntrada;
	
	public String execute(){
		DatabaseConnect.connectToTheDatabase("localhost", 5432, "BoxMexDatabase", "boxmexadmin", "1234");
		listPakeEntrada = PaketeDAO.actualizarListaPaquetesEstrada();
		DatabaseConnect.disconnectToFromTheDatabase();
		idListPakeEntradaBete();
		return "goToPaketeKudeaketa";
	}
	
	
	private void idListPakeEntradaBete(){
		idListPakeEntrada= new ArrayList<Integer>();
		for(Pakete p : listPakeEntrada){
			idListPakeEntrada.add(p.getId());
		}
	}


	public ArrayList<Pakete> getListPakeEntrada() {
		return listPakeEntrada;
	}


	public void setListPakeEntrada(ArrayList<Pakete> listPakeEntrada) {
		this.listPakeEntrada = listPakeEntrada;
	}


	public ArrayList<Integer> getIdListPakeEntrada() {
		return idListPakeEntrada;
	}


	public void setIdListPakeEntrada(ArrayList<Integer> idListPakeEntrada) {
		this.idListPakeEntrada = idListPakeEntrada;
	}



	
}
