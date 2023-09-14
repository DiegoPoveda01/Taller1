public class Entrenador {
	private String experiencia;
	private String especialidad;
	private Equipo equipo;
 public Entrenador(String experiencia, String especialidad, Equipo equipo){
	 this.experiencia = experiencia;
	 this.especialidad = especialidad;
	 this.equipo = equipo;
 }
	public String getExperiencia() {
		return this.experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
}