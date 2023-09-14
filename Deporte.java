public abstract class Deporte {
	private String nombre;
	private Equipo equipos;
	public Deporte(String nombre, Equipo equipos){
		this.nombre = nombre;
		this.equipos = equipos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract String getTipo();
}