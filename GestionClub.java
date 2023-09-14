import java.util.ArrayList;

public class GestionClub {
	private ArrayList<Deportista> deportistas = new ArrayList<Deportista>();
	private Entrenador entrenador;
	private ArrayList<Equipo> equipos = new ArrayList<Equipo>();
	public GestionClub(ArrayList<Deportista> deportistas, Entrenador entrenador, ArrayList<Equipo> equipos){
		this.deportistas = deportistas;
		this.entrenador = entrenador;
		this.equipos = equipos;
	}

	public void buscarEquipo() {

	}

	public void crearEquipo() {
		throw new UnsupportedOperationException();
	}

	public void asignarJugadores() {
		throw new UnsupportedOperationException();
	}

	public void asignarEntrenadores() {
		throw new UnsupportedOperationException();
	}
}