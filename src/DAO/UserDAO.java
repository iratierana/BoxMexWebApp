package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import databaseConn.DatabaseConnect;
import entitys.system.Usuario;

/**
 * The Class UserDAO.
 */
public class UserDAO {

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
	 * Comprobar usuario en DB.
	 *
	 * @param username the username
	 * @param pass the pass
	 * @return the usuario
	 */
	public static Usuario comprobarUsuarioEnDB(final String username, final String pass) {
		Usuario usuario = null;
		try {
			PreparedStatement statement = DatabaseConnect.conn
					.prepareStatement("SELECT * FROM boxmexsystem.usuarios WHERE username = ? AND pass = ?");
			statement.setString(1, username);
			statement.setString(2, pass);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				usuario = new Usuario(rs.getInt(PARAMETRO_1), rs.getString(PARAMETRO_2), rs.getString(PARAMETRO_3), rs.getString(PARAMETRO_4), rs.getInt(PARAMETRO_5),
						rs.getInt(PARAMETRO_6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usuario;
	}

}
