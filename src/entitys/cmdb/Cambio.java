package entitys.cmdb;

public class Cambio {
	
	int cambioId;
	String fecha;
	String descripcion;
	int itemId;
	
	public Cambio(int cambioId, String fecha, String descripcion, int itemId) {
		super();
		this.cambioId = cambioId;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.itemId = itemId;
	}

	public int getCambioId() {
		return cambioId;
	}

	public void setCambioId(int cambioId) {
		this.cambioId = cambioId;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

}
