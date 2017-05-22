package entitys.system;

/**
 * The Class Estanteria.
 */
public class Estanteria {

	/** The estanteria id. */
	int estanteriaId;

	/** The capacidad. */
	int capacidad;

	/** The almacen id. */
	int almacenId;

	/** The categoria id. */
	int categoriaId;

	/**
	 * Instantiates a new estanteria.
	 *
	 * @param estanteriaId the estanteria id
	 * @param capacidad the capacidad
	 * @param almacenId the almacen id
	 * @param categoriaId the categoria id
	 */
	public Estanteria(final int estanteriaId, final int capacidad, final int almacenId, final int categoriaId) {
		this.estanteriaId = estanteriaId;
		this.capacidad = capacidad;
		this.almacenId = almacenId;
		this.categoriaId = categoriaId;
	}

	/**
	 * Gets the estanteria id.
	 *
	 * @return the estanteria id
	 */
	public int getEstanteriaId() {
		return estanteriaId;
	}

	/**
	 * Sets the estanteria id.
	 *
	 * @param estanteriaId the new estanteria id
	 */
	public void setEstanteriaId(final int estanteriaId) {
		this.estanteriaId = estanteriaId;
	}

	/**
	 * Gets the capacidad.
	 *
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * Sets the capacidad.
	 *
	 * @param capacidad the new capacidad
	 */
	public void setCapacidad(final int capacidad) {
		this.capacidad = capacidad;
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

}
