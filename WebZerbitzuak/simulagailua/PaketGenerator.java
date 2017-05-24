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

/**
 * The Class PaketGenerator.
 */
@Path("/packetGenerator")
public class PaketGenerator {

	/** The Constant MAX_Paketes. */
	private static final int MAX_PAKETES = 10;

	/** The Constant MAX_CATEGORIAS. */
	private static final int MAX_CATEGORIAS = 4;

	/** The Constant MAX_ESTANTERIAS. */
	private static final int MAX_ESTANTERIAS = 9;

	/** The Constant ANIO_INICIO. */
	private static final int ANIO_INICIO = 2017;

	/** The Constant ANIO_FIN. */
	private static final int ANIO_FIN = 2030;

	/** The Constant MES_INICIO. */
	private static final int MES_INICIO = 1;

	/** The Constant MES_FIN. */
	private static final int MES_FIN = 12;

	/** The Constant DIA_INICIO. */
	private static final int DIA_INICIO = 1;

	/** The Constant DIA_FIN. */
	private static final int DIA_FIN = 31;

	/**
	 * Generar pakete de manera que los parametros de los productos sean
	 * aleatorios asi como la cantidad.
	 *
	 * @return the pakete
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Pakete generarPakete() {
		Pakete pakete = null;
		ArrayList<Producto> listaProductos = null;

		listaProductos = generarListaProductos();
		pakete = new Pakete(1, listaProductos, "entrada");

		return pakete;
	}

	/**
	 * Generar lista productos.
	 *
	 * @return the array list
	 */
	private ArrayList<Producto> generarListaProductos() {

		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		Producto producto = null;

		for (int kont = 0; kont < generateRandNumber(1, MAX_PAKETES); kont++) {
			producto = new Producto(1, generateRandomName(), generateRandData(), retRandEstanteria(),
					retRandCategoria());
			listaProductos.add(producto);
		}

		return listaProductos;
	}

	/**
	 * Ret rand categoria.
	 *
	 * @return the int
	 */
	private int retRandCategoria() {
		return generateRandNumber(1, MAX_CATEGORIAS);
	}

	/**
	 * Ret rand estanteria.
	 *
	 * @return the int
	 */
	private int retRandEstanteria() {
		return generateRandNumber(1, MAX_ESTANTERIAS);
	}

	/**
	 * Generate rand data.
	 *
	 * @return the string
	 */
	@SuppressWarnings("deprecation")
	private String generateRandData() {
		Faker faker = new Faker();
		Date date = faker.date().between(new Date(ANIO_INICIO, MES_INICIO, DIA_INICIO), new Date(ANIO_FIN, MES_FIN, DIA_FIN));
		return date.toString();
	}

	/**
	 * Generate random name.
	 *
	 * @return the string
	 */
	private String generateRandomName() {
		Faker faker = new Faker();
		return faker.food().ingredient();
	}

	/**
	 * Generate rand number.
	 *
	 * @param low
	 *            the low
	 * @param high
	 *            the high
	 * @return the int
	 */
	private int generateRandNumber(final int low, final int high) {
		Random r = new Random();
		return r.nextInt(high - low) + low;
	}

}
