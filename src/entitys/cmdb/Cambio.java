package entitys.cmdb;

/**
 * The Class Cambio.
 */
public class Cambio {

	/** The cambio id. */
	int cambioId;

	/** The fecha. */
	String fecha;

	/** The descripcion. */
	String descripcion;

	/** The item id. */
	int itemId;

	/**
	 * Instantiates a new cambio.
	 *
	 * @param cambioId the cambio id
	 * @param fecha the fecha
	 * @param descripcion the descripcion
	 * @param itemId the item id
	 */
	public Cambio(final int cambioId, final String fecha, final String descripcion, final int itemId) {
		super();
		this.cambioId = cambioId;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.itemId = itemId;
	}

	/**
	 * Gets the cambio id.
	 *
	 * @return the cambio id
	 */
	public int getCambioId() {
		return cambioId;
	}

	/**
	 * Sets the cambio id.
	 *
	 * @param cambioId the new cambio id
	 */
	public void setCambioId(final int cambioId) {
		this.cambioId = cambioId;
	}

	/**
	 * Gets the fecha.
	 *
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * Sets the fecha.
	 *
	 * @param fecha the new fecha
	 */
	public void setFecha(final String fecha) {
		this.fecha = fecha;
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
	 * @param descripcion  the new descripcion
	 */
	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Gets the item id.
	 *
	 * @return the item id
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * Sets the item id.
	 *
	 * @param itemId  the new item id
	 */
	public void setItemId(final int itemId) {
		this.itemId = itemId;
	}

}
