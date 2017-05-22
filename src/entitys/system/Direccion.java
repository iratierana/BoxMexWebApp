package entitys.system;

/**
 * The Class Direccion.
 */
public class Direccion {

	/** The direccion id. */
	int direccionId;

	/** The calle. */
	String calle;

	/** The numero. */
	int numero;

	/** The ciudad. */
	String ciudad;

	/** The cod post. */
	String codPost;

	/** The estado. */
	String estado;

	/**
	 * Instantiates a new direccion.
	 *
	 * @param direccionId the direccion id
	 * @param calle the calle
	 * @param numero the numero
	 * @param ciudad the ciudad
	 * @param codPost the cod post
	 * @param estado  the estado
	 */
	public Direccion(final int direccionId, final String calle, final int numero, final String ciudad, final String codPost, final String estado) {
		this.direccionId = direccionId;
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
		this.codPost = codPost;
		this.estado = estado;
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
	 * Gets the calle.
	 *
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * Sets the calle.
	 *
	 * @param calle the new calle
	 */
	public void setCalle(final String calle) {
		this.calle = calle;
	}

	/**
	 * Gets the numero.
	 *
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Sets the numero.
	 *
	 * @param numero the new numero
	 */
	public void setNumero(final int numero) {
		this.numero = numero;
	}

	/**
	 * Gets the ciudad.
	 *
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Sets the ciudad.
	 *
	 * @param ciudad the new ciudad
	 */
	public void setCiudad(final String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Gets the cod post.
	 *
	 * @return the cod post
	 */
	public String getCodPost() {
		return codPost;
	}

	/**
	 * Sets the cod post.
	 *
	 * @param codPost
	 *            the new cod post
	 */
	public void setCodPost(final String codPost) {
		this.codPost = codPost;
	}

	/**
	 * Gets the estado.
	 *
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Sets the estado.
	 *
	 * @param estado the new estado
	 */
	public void setEstado(final String estado) {
		this.estado = estado;
	}

}
