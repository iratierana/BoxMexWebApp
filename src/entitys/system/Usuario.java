package entitys.system;

/**
 * The Class Usuario.
 */
public class Usuario {

	/** The user id. */
	int userId;

	/** The username. */
	String username;

	/** The password. */
	String password;

	/** The tipo usuario. */
	String tipoUsuario;

	/** The direccion id. */
	int direccionId;

	/** The almacen id. */
	int almacenId;

	/**
	 * Instantiates a new usuario.
	 *
	 * @param userId the user id
	 * @param username the username
	 * @param password the password
	 * @param tipoUsuario the tipo usuario
	 * @param direccionId the direccion id
	 * @param almacenId the almacen id
	 */
	public Usuario(final int userId, final String username, final String password, final String tipoUsuario, final int direccionId, final int almacenId) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.tipoUsuario = tipoUsuario;
		this.direccionId = direccionId;
		this.almacenId = almacenId;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(final int userId) {
		this.userId = userId;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(final String username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

	/**
	 * Gets the tipo usuario.
	 *
	 * @return the tipo usuario
	 */
	public String getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * Sets the tipo usuario.
	 *
	 * @param tipoUsuario the new tipo usuario
	 */
	public void setTipoUsuario(final String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	/**
	 * Gets the direccion id.
	 *
	 * @return the direccion id
	 */
	public int getDireccionId() {
		return direccionId;
	}

	/**
	 * Sets the direccion id.
	 *
	 * @param direccionId the new direccion id
	 */
	public void setDireccionId(final int direccionId) {
		this.direccionId = direccionId;
	}

	/**
	 * Gets the almacen id.
	 *
	 * @return the almacen id
	 */
	public int getAlmacenId() {
		return almacenId;
	}

	/**
	 * Sets the almacen id.
	 *
	 * @param almacenId the new almacen id
	 */
	public void setAlmacenId(final int almacenId) {
		this.almacenId = almacenId;
	}

}
