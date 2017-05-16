package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
}
