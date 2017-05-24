package entitys.cmdb;

/**
 * The Class Categoria.
 */
public class Categoria {

	/** The categoria id. */
	int categoriaId;

	/** The nombre. */
	String nombre;

	/** The descripcion. */
	String descripcion;

	/**
	 * Instantiates a new categoria.
	 *
	 * @param categoriaId the categoria id
	 * @param nombre the nombre
	 * @param descripcion the descripcion
	 */
	public Categoria(final int categoriaId, final String nombre, final String descripcion) {
		this.categoriaId = categoriaId;
		this.nombre = nombre;
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
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(final String nombre) {
		this.nombre = nombre;
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
