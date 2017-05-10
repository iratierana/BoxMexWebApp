package entitys.system;

public class Categoria {
	
	int categoriaId;
	String nombreId;
	String descripcion;
	
	public Categoria(int categoriaId, String nombreId, String descripcion) {
		this.categoriaId = categoriaId;
		this.nombreId = nombreId;
		this.descripcion = descripcion;
	}

	public int getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}

	public String getNombreId() {
		return nombreId;
	}

	public void setNombreId(String nombreId) {
		this.nombreId = nombreId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
