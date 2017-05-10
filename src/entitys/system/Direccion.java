package entitys.system;

public class Direccion {
	
	int direccionId;
	String calle;
	int numero;
	String ciudad;
	String codPost;
	String estado;
	
	public Direccion(int direccionId, String calle, int numero, String ciudad, String codPost, String estado) {
		this.direccionId = direccionId;
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
		this.codPost = codPost;
		this.estado = estado;
	}

	public int getDireccionId() {
		return direccionId;
	}

	public void setDireccionId(int direccionId) {
		this.direccionId = direccionId;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodPost() {
		return codPost;
	}

	public void setCodPost(String codPost) {
		this.codPost = codPost;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
