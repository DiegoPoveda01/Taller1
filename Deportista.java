public class Deportista {
	private String nombre;
	private String apellido;
	private String email;
	private String numeroContacto;
	private String deporte;
	private String rol;
	private Equipo equipo;
   public Deportista(String nombre, String apellido, String email, String numeroContacto, String deporte, String rol, Equipo equipo){
	   this.nombre = nombre;
	   this.apellido = apellido;
	   this.email = email;
	   this.numeroContacto = numeroContacto;
	   this.deporte = deporte;
	   this.rol = rol;
	   this.equipo = equipo;
   }
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeroContacto() {
		return this.numeroContacto;
	}

	public void setNumeroContacto(String numeroContacto) {
		this.numeroContacto = numeroContacto;
	}

	public String getDeporte() {
		return this.deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
}