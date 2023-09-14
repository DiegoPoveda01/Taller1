public class Baloncesto extends Deporte {
	private String tipoDeCancha;
	private String tiemposJugados;

	public Baloncesto(String nombre, Equipo equipos, String tipoDeCancha, String tiemposJugados) {
		super(nombre, equipos);
		this.tipoDeCancha = tipoDeCancha;
		this.tiemposJugados = tiemposJugados;
	}

	public String getTipoDeCancha() {
		return this.tipoDeCancha;
	}

	public void setTipoDeCancha(String tipoDeCancha) {
		this.tipoDeCancha = tipoDeCancha;
	}

	public String getTiemposJugados() {
		return this.tiemposJugados;
	}

	public void setTiemposJugados(String tiemposJugados) {
		this.tiemposJugados = tiemposJugados;
	}

	public String getTipo() {
		return "Baloncesto";
	}
}