package entitys.system;

public class Usuario {
	
	int userId;
	String username;
	String password;
	String tipoUsuario;
	int direccionId;
	int almacenId;
	
	public Usuario(int userId, String username, String password, String tipoUsuario, int direccionId, int almacenId) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.tipoUsuario = tipoUsuario;
		this.direccionId = direccionId;
		this.almacenId = almacenId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public int getDireccionId() {
		return direccionId;
	}

	public void setDireccionId(int direccionId) {
		this.direccionId = direccionId;
	}

	public int getAlmacenId() {
		return almacenId;
	}

	public void setAlmacenId(int almacenId) {
		this.almacenId = almacenId;
	}

}
