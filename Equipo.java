import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private ArrayList<Deporte> deportes = new ArrayList<Deporte>();
	private ArrayList<Deportista> deportistas = new ArrayList<Deportista>();
	private Entrenador entrenador;
	private ArrayList<PartidoJugado> historial = new ArrayList<PartidoJugado>();
	public Equipo(String nombre, ArrayList<Deporte> deportes, ArrayList<Deportista> deportistas, Entrenador entrenador, ArrayList<PartidoJugado> historial){
		this.nombre = nombre;
		this.deportes = deportes;
		this.deportistas = deportistas;
		this.entrenador = entrenador;
		this.historial = historial;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Deportista buscarDeportista(String email) {
		for (Deportista deportista : deportistas) {
			if (deportista.getEmail().equals(email)) {
				return deportista;
			}
		}
		return null;
	}


	public void registrarDeportista(Deportista nuevoDeportista) {
		Deportista existenteDeportista = buscarDeportista(nuevoDeportista.getEmail());
		if (existenteDeportista == null) {
			deportistas.add(nuevoDeportista);
			System.out.println("Deportista registrado con éxito.");
		} else {
			System.out.println("Error: Ya existe un deportista con el mismo email.");
		}
	}


	public void buscarEntrenador() {
		throw new UnsupportedOperationException();
	}

	public void registrarEntrenador() {
		throw new UnsupportedOperationException();
	}

	public void historialEquipo() {
		throw new UnsupportedOperationException();
	}

	public void mostrarEstadisticas() {
		throw new UnsupportedOperationException();
	}
}