package entitys.cmdb;

public class Categoria {
	
	int categoriaId;
	String nombre;
	String descripcion;
	
	public Categoria(int categoriaId, String nombre, String descripcion) {
		this.categoriaId = categoriaId;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
