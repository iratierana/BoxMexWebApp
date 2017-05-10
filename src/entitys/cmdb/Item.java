package entitys.cmdb;

public class Item {
	
	int itemId;
	String nombre;
	int categoriaId;
	
	public Item(int itemId, String nombre, int categoriaId) {
		this.itemId = itemId;
		this.nombre = nombre;
		this.categoriaId = categoriaId;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCategoriaId() {
		return categoriaId;
	}
	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}

}
