package entitys.system;

public class Almacen {
	
	int almacenId;
	String nombre;
	String descripcion;
	int direccionId;
	
	public Almacen(int almacenId, String nombre, String descripcion, int direccionId) {
		this.almacenId = almacenId;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.direccionId = direccionId;
	}

	public int getAlmacenId() {
		return almacenId;
	}

	public void setAlmacenId(int almacenId) {
		this.almacenId = almacenId;
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

	public int getDireccionId() {
		return direccionId;
	}

	public void setDireccionId(int direccionId) {
		this.direccionId = direccionId;
	}

}
