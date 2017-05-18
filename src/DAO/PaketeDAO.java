package DAO;

import java.io.StringReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import databaseConn.DatabaseConnect;
import entitys.system.Pakete;
import entitys.system.Producto;

public class PaketeDAO {
	
	
	public static ArrayList<Pakete> actualizarListaPaquetesEstrada(){
		int kont = 0;
		ArrayList<Pakete> listPakeEntrada = null;
		ArrayList<Producto> productos = new ArrayList<Producto>();;
		Pakete pakete;	
		int paketeId = -1;
		try {			
			listPakeEntrada = new ArrayList<Pakete>();			
			PreparedStatement statement = DatabaseConnect.conn.prepareStatement(
					"SELECT pa.paketeId, po.prodid, po.nombre, po.fechacaducidad, po.estanteriaid, po.categoriaid "+
					"FROM boxmexsystem.pakete pa join boxmexsystem.producto po on pa.paketeId=po.paketeId "+
					"WHERE pa.estado = ?"
					);
			statement.setString(1, "entrada"); /* entrada: por poner quieto: paquete viejo salida: por sacar*/
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()){				
				if(kont==0){
					paketeId =rs.getInt(1);					
					productos.add(new Producto(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6)));
				}else{
					if(paketeId == rs.getInt(1)){
						productos.add(new Producto(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6)));
						paketeId = rs.getInt(1);
					}else{
						pakete = new Pakete(paketeId, productos, "entrada");
						listPakeEntrada.add(pakete);
						productos = new ArrayList<Producto>();
						paketeId = rs.getInt(1);
					}
				}
				kont++;
			}
			pakete = new Pakete(paketeId, productos, "entrada");
			listPakeEntrada.add(pakete);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return listPakeEntrada;
	}

	
	public static void cambiarEstadoToPakete(int paketeId, String nuevoEstado){
		
		try {					
			PreparedStatement statement = DatabaseConnect.conn.prepareStatement(
					"UPDATE boxmexsystem.pakete SET estado = ? WHERE paketeid = ?"
					);
			statement.setString(1, nuevoEstado); 
			statement.setInt(2, paketeId); 
			statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}

	public static Pakete cargarPakete(int paketeId){
		
		Pakete pakete = null;
		
		Producto producto = null;
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		
		try {					
			PreparedStatement statement = DatabaseConnect.conn.prepareStatement(
					"SELECT pa.paketeId, po.prodid, po.nombre, po.fechacaducidad, po.estanteriaid, po.categoriaid "+
					"FROM boxmexsystem.pakete pa join boxmexsystem.producto po on pa.paketeId=po.paketeId "+
					"WHERE pa.paketeId = ?"
					);
			statement.setInt(1, paketeId); /* entrada: por poner quieto: paquete viejo salida: por sacar*/
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()){	
				producto = new Producto(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));
				listaProductos.add(producto);
			}
			pakete = new Pakete(paketeId, listaProductos , "quieto");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return pakete;
		
	}

	public static void insertPaketInDatabase(String paketInXML){
		
		PreparedStatement statement;
		
		try {					
			
			JAXBContext jaxbContext = JAXBContext.newInstance(Pakete.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            
            StringReader reader = new StringReader(paketInXML);            

            Pakete pakete = (Pakete) jaxbUnmarshaller.unmarshal(reader);
			
			statement = DatabaseConnect.conn.prepareStatement("INSERT INTO boxmexsystem.pakete (estado) VALUES (?) RETURNING paketeid");
			statement.setString(1, "entrada"); 
			statement.execute();
			
			ResultSet rs = statement.getResultSet();
			rs.next();
			int azkenPaketeId = rs.getInt(1);
			
			for(Producto p : pakete.getListaProductos()){
				statement = DatabaseConnect.conn.prepareStatement(
						"INSERT INTO boxmexsystem.producto (nombre,fechacaducidad,estanteriaid,categoriaid,paketeid) VALUES (?,?,?,?,?);");
				statement.setString(1, p.getNombre()); 
				statement.setString(2, p.getFechaCaducidad()); 
				statement.setInt(3, p.getEstanteriaId());
				statement.setInt(4, p.getCategoriaId());
				statement.setInt(5, azkenPaketeId);
				statement.executeUpdate();
			}
			
			
			
		} catch (SQLException | JAXBException e) {
			e.printStackTrace();
		}
		
	}
}
