public class Futbol extends Deporte {
	private String tipoDeCampo;
	private String tipoDeLocalidad;

	public Futbol(String nombre, Equipo equipos, String tipoDeCampo, String tipoDeLocalidad) {
		super(nombre, equipos);
		this.tipoDeCampo = tipoDeCampo;
		this.tipoDeLocalidad = tipoDeLocalidad;
	}

	public String getTipoDeCampo() {
		return this.tipoDeCampo;
	}

	public void setTipoDeCampo(String tipoDeCampo) {
		this.tipoDeCampo = tipoDeCampo;
	}

	public String getTipoDeLocalidad() {
		return this.tipoDeLocalidad;
	}

	public void setTipoDeLocalidad(String tipoDeLocalidad) {
		this.tipoDeLocalidad = tipoDeLocalidad;
	}

	public String getTipo() {
		return "Fútbol";
	}
}