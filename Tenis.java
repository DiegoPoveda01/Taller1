public class Tenis extends Deporte {
	private String superficieDeCancha;
	private String tipoDePartido;

	public Tenis(String nombre, Equipo equipos, String superficieDeCancha, String tipoDePartido) {
		super(nombre, equipos);
		this.superficieDeCancha = superficieDeCancha;
		this.tipoDePartido = tipoDePartido;
	}

	public String getSuperficieDeCancha() {
		return this.superficieDeCancha;
	}

	public void setSuperficieDeCancha(String superficieDeCancha) {
		this.superficieDeCancha = superficieDeCancha;
	}

	public String getTipoDePartido() {
		return this.tipoDePartido;
	}

	public void setTipoDePartido(String tipoDePartido) {
		this.tipoDePartido = tipoDePartido;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}