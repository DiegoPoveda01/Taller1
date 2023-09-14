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
	public ArrayList<Deporte> getDeportes(){return this.deportes;}
	public void setDeportes(ArrayList<Deporte> deportes){this.deportes = deportes;}
	public ArrayList<Deportista> getDeportistas(){return this.deportistas;}
	public void setDeportistas(ArrayList<Deportista> deportistas){this.deportistas = deportistas;}
	public Entrenador getEntrenador(){return this.entrenador;}
	public void setEntrenador(Entrenador entrenador){this.entrenador = entrenador;}
	public ArrayList<PartidoJugado> getHistorial(){return this.historial;}
	public void setHistorial(ArrayList<PartidoJugado> historial){this.historial = historial;}

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
		if (entrenador != null) {
			System.out.println("Entrenador encontrado: " + entrenador.getEspecialidad());
		} else {
			System.out.println("No hay entrenador registrado en este equipo.");
		}
	}

	public void registrarEntrenador(Entrenador nuevoEntrenador) {
		if (entrenador == null) {
			entrenador = nuevoEntrenador;
			System.out.println("Entrenador registrado con éxito.");
		} else {
			System.out.println("Ya hay un entrenador registrado en este equipo.");
		}
	}


	public void historialEquipo() {
		System.out.println("Historial de Partidos del Equipo " + nombre + ":");

		if (historial.isEmpty()) {
			System.out.println("No hay partidos registrados.");
		} else {
			for (PartidoJugado partido : historial) {
				System.out.println("Fecha: " + partido.getFecha());
				System.out.println("Lugar: " + partido.getLugar());
				System.out.println("Equipo Oponente: " + partido.getEquipoOponente());
				System.out.println("Resultado: " + partido.getResultado());
				System.out.println();
			}
		}
	}


	public void mostrarEstadisticas() {
		System.out.println("Estadísticas del Equipo " + nombre + ":");
		System.out.println("Número de Deportistas: " + deportistas.size());
		System.out.println("Número de Deportes: " + deportes.size());

		if (entrenador != null) {
			System.out.println("Entrenador: " + entrenador.getEspecialidad());
		} else {
			System.out.println("Entrenador: No hay entrenador asignado");
		}

		System.out.println("Partidos Jugados: " + historial.size());
	}

}