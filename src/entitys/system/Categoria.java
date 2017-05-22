package entitys.system;

/**
 * The Class Categoria.
 */
public class Categoria {

	/** The categoria id. */
	int categoriaId;

	/** The nombre id. */
	String nombreId;

	/** The descripcion. */
	String descripcion;

	/**
	 * Instantiates a new categoria.
	 *
	 * @param categoriaId the categoria id
	 * @param nombreId the nombre id
	 * @param descripcion the descripcion
	 */
	public Categoria(final int categoriaId, final String nombreId, final String descripcion) {
		this.categoriaId = categoriaId;
		this.nombreId = nombreId;
		this.descripcion = descripcion;
	}

	/**
	 * Gets the categoria id.
	 *
	 * @return the categoria id
	 */
	public int getCategoriaId() {
		return categoriaId;
	}

	/**
	 * Sets the categoria id.
	 *
	 * @param categoriaId the new categoria id
	 */
	public void setCategoriaId(final int categoriaId) {
		this.categoriaId = categoriaId;
	}

	/**
	 * Gets the nombre id.
	 *
	 * @return the nombre id
	 */
	public String getNombreId() {
		return nombreId;
	}

	/**
	 * Sets the nombre id.
	 *
	 * @param nombreId the new nombre id
	 */
	public void setNombreId(final String nombreId) {
		this.nombreId = nombreId;
	}

	/**
	 * Gets the descripcion.
	 *
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Sets the descripcion.
	 *
	 * @param descripcion the new descripcion
	 */
	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}

}
