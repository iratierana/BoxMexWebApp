package entitys.cmdb;

/**
 * The Class Item.
 */
public class Item {

	/** The item id. */
	int itemId;

	/** The nombre. */
	String nombre;

	/** The categoria id. */
	int categoriaId;

	/**
	 * Instantiates a new item.
	 *
	 * @param itemId the item id
	 * @param nombre the nombre
	 * @param categoriaId the categoria id
	 */
	public Item(final int itemId, final String nombre, final int categoriaId) {
		this.itemId = itemId;
		this.nombre = nombre;
		this.categoriaId = categoriaId;
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
	 * @param itemId the new item id
	 */
	public void setItemId(final int itemId) {
		this.itemId = itemId;
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
