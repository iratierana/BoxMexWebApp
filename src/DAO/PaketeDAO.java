package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import databaseConn.DatabaseConnect;
import entitys.system.Pakete;
import entitys.system.Producto;

/**
 * The Class PaketeDAO.
 */
public class PaketeDAO {

	/** The Constant Parametro_1. */
	private static final int PARAMETRO_1 = 1;

	/** The Constant Parametro_2. */
	private static final int PARAMETRO_2 = 2;

	/** The Constant Parametro_3. */
	private static final int PARAMETRO_3 = 3;

	/** The Constant Parametro_4. */
	private static final int PARAMETRO_4 = 4;

	/** The Constant Parametro_5. */
	private static final int PARAMETRO_5 = 5;

	/** The Constant Parametro_6. */
	private static final int PARAMETRO_6 = 6;

	/**
	 * Actualizar lista paquetes de entrada.
	 *
	 * @return the array list
	 */
	public static ArrayList<Pakete> actualizarListaPaquetesEstrada() {
		int kont = 0;
		ArrayList<Pakete> listPakeEntrada = null;
		ArrayList<Producto> productos = new ArrayList<Producto>();
		Pakete pakete;
		int paketeId = -1;
		try {
			listPakeEntrada = new ArrayList<Pakete>();
			PreparedStatement statement = DatabaseConnect.conn.prepareStatement(
					"SELECT pa.paketeId, po.prodid, po.nombre, po.fechacaducidad, po.estanteriaid, po.categoriaid "
							+ "FROM boxmexsystem.pakete pa join boxmexsystem.producto po on pa.paketeId=po.paketeId "
							+ "WHERE pa.estado = ?");
			statement.setString(1,
					"entrada"); /*
								 * entrada: por poner quieto: paquete viejo
								 * salida: por sacar
								 */
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				if (kont == 0) {
					paketeId = rs.getInt(PARAMETRO_1);
					productos.add(new Producto(rs.getInt(PARAMETRO_2), rs.getString(PARAMETRO_3),
							rs.getString(PARAMETRO_4), rs.getInt(PARAMETRO_5), rs.getInt(PARAMETRO_6)));
				} else {
					if (paketeId == rs.getInt(1)) {
						productos.add(new Producto(rs.getInt(PARAMETRO_2), rs.getString(PARAMETRO_3),
								rs.getString(PARAMETRO_4), rs.getInt(PARAMETRO_5), rs.getInt(PARAMETRO_6)));
						paketeId = rs.getInt(1);
					} else {
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

	/**
	 * Cambiar estado to pakete.
	 *
	 * @param paketeId
	 *            the pakete id
	 * @param nuevoEstado
	 *            the nuevo estado
	 */
	public static void cambiarEstadoToPakete(final int paketeId, final String nuevoEstado) {

		try {
			PreparedStatement statement = DatabaseConnect.conn
					.prepareStatement("UPDATE boxmexsystem.pakete SET estado = ? WHERE paketeid = ?");
			statement.setString(1, nuevoEstado);
			statement.setInt(2, paketeId);
			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Cargar pakete.
	 *
	 * @param paketeId
	 *            the pakete id
	 * @param nuevoEstado
	 *            el nuevo estado que se quiere poner
	 * @return the pakete
	 */
	public static Pakete cargarPakete(final int paketeId, final String nuevoEstado) {

		Pakete pakete = null;

		Producto producto = null;
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();

		try {
			PreparedStatement statement = DatabaseConnect.conn.prepareStatement(
					"SELECT pa.paketeId, po.prodid, po.nombre, po.fechacaducidad, po.estanteriaid, po.categoriaid "
							+ "FROM boxmexsystem.pakete pa join boxmexsystem.producto po on pa.paketeId=po.paketeId "
							+ "WHERE pa.paketeId = ?");
			statement.setInt(1, paketeId); /*
											 * entrada: por poner quieto:
											 * paquete viejo salida: por sacar
											 */
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				producto = new Producto(rs.getInt(2), rs.getString(PARAMETRO_3), rs.getString(PARAMETRO_4),
						rs.getInt(PARAMETRO_5), rs.getInt(PARAMETRO_6));
				listaProductos.add(producto);
			}
			pakete = new Pakete(paketeId, listaProductos, nuevoEstado);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pakete;

	}

	/**
	 * Cargarprimer pakete quieto id.
	 *
	 * @return the int
	 */
	public static int cargarprimerPaketeQuietoId() {

		int idPakete = -1;

		try {
			PreparedStatement statement = DatabaseConnect.conn.prepareStatement("select paketeid from boxmexsystem.pakete where estado = 'quieto'");
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				idPakete = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return idPakete;

	}

	/**
	 * Insert paket in database.
	 *
	 * @param pakete
	 *            the paket in XML
	 */
	public static void insertPaketInDatabase(final Pakete pakete) {

		PreparedStatement statement;

		try {

			statement = DatabaseConnect.conn
					.prepareStatement("INSERT INTO boxmexsystem.pakete (estado) VALUES (?) RETURNING paketeid");
			statement.setString(1, "entrada");
			statement.execute();

			ResultSet rs = statement.getResultSet();
			rs.next();
			int azkenPaketeId = rs.getInt(1);

			for (Producto p : pakete.getListaProductos()) {
				statement = DatabaseConnect.conn.prepareStatement(
						"INSERT INTO boxmexsystem.producto (nombre,fechacaducidad,estanteriaid,categoriaid,paketeid) VALUES (?,?,?,?,?);");
				statement.setString(PARAMETRO_1, p.getNombre());
				statement.setString(PARAMETRO_2, p.getFechaCaducidad());
				statement.setLong(PARAMETRO_3, p.getEstanteriaId());
				statement.setLong(PARAMETRO_4, p.getCategoriaId());
				statement.setInt(PARAMETRO_5, azkenPaketeId);
				statement.executeUpdate();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
