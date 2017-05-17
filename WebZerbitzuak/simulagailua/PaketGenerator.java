package simulagailua;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.javafaker.Faker;

import entitys.system.Pakete;
import entitys.system.Producto;

@Path("/packetGenerator")
public class PaketGenerator {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Pakete generarPakete(){
		Pakete pakete = null;
		ArrayList<Producto> listaProductos = null;
		
		listaProductos = generarListaProductos();
		pakete = new Pakete(1, listaProductos, "entrada");
		
		return pakete;
	}
	
	private ArrayList<Producto> generarListaProductos(){
		
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		Producto producto = null;
		
		for(int kont=0; kont<generateRandNumber(1, 10); kont++){
			producto = new Producto(1, generateRandomName(), generateRandData(), retRandEstanteria(), retRandCategoria());
			listaProductos.add(producto);
		}
		
		return listaProductos;
	}
	
	private int retRandCategoria(){
		return generateRandNumber(1, 4);
	}
	
	private int retRandEstanteria(){
		return generateRandNumber(1, 9);
	}
	
	@SuppressWarnings("deprecation")
	private String generateRandData(){
		Faker faker = new Faker();
		Date date = faker.date().between(new Date(2017, 05, 01), new Date(2030, 05, 01));
		return date.toString();
	}
	

	private String generateRandomName(){
		Faker faker = new Faker();		
		return faker.food().ingredient();
	}
	
	private int generateRandNumber(int low, int high){
		Random r = new Random();
		return r.nextInt(high-low) + low;
	}

}
