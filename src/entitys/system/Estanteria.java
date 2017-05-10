package entitys.system;

public class Estanteria {
	
	int estanteriaId;
	int capacidad;
	int almacenId;
	int categoriaId;
	
	public Estanteria(int estanteriaId, int capacidad, int almacenId, int categoriaId) {
		this.estanteriaId = estanteriaId;
		this.capacidad = capacidad;
		this.almacenId = almacenId;
		this.categoriaId = categoriaId;
	}

	public int getEstanteriaId() {
		return estanteriaId;
	}

	public void setEstanteriaId(int estanteriaId) {
		this.estanteriaId = estanteriaId;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getAlmacenId() {
		return almacenId;
	}

	public void setAlmacenId(int almacenId) {
		this.almacenId = almacenId;
	}

	public int getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}
	
}
