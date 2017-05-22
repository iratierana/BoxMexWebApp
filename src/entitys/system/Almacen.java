package entitys.system;

/**
 * The Class Almacen.
 */
public class Almacen {

	/** The almacen id. */
	int almacenId;

	/** The nombre. */
	String nombre;

	/** The descripcion. */
	String descripcion;

	/** The direccion id. */
	int direccionId;

	/**
	 * Instantiates a new almacen.
	 *
	 * @param almacenId the almacen id
	 * @param nombre the nombre
	 * @param descripcion the descripcion
	 * @param direccionId the direccion id
	 */
	public Almacen(final int almacenId, final String nombre, final String descripcion, final int direccionId) {
		this.almacenId = almacenId;
		this.nombre = nombre;
		this.descripcion = descripcion;
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

}
