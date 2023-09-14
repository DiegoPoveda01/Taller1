import java.util.ArrayList;

public class GestionClub {
    private ArrayList<Deportista> deportistas = new ArrayList<Deportista>();
    private Entrenador entrenador;
    private ArrayList<Equipo> equipos = new ArrayList<Equipo>();

    public GestionClub(ArrayList<Deportista> deportistas, Entrenador entrenador, ArrayList<Equipo> equipos) {
        this.deportistas = deportistas;
        this.entrenador = entrenador;
        this.equipos = equipos;
    }

    public Equipo buscarEquipo(String nombreEquipo) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equals(nombreEquipo)) {
                return equipo;
            }
        }
        return null;
    }

    public void crearEquipo(String nombreEquipo) {
        Equipo existenteEquipo = buscarEquipo(nombreEquipo);
        if (existenteEquipo == null) {
            Equipo nuevoEquipo = new Equipo(nombreEquipo, new ArrayList<Deporte>(), new ArrayList<Deportista>(), null, new ArrayList<PartidoJugado>());
            equipos.add(nuevoEquipo);
            System.out.println("Equipo creado con éxito.");
        } else {
            System.out.println("Ya existe un equipo con el mismo nombre.");
        }
    }

    public void asignarJugadores(String nombreEquipo, ArrayList<Deportista> jugadores) {
        Equipo equipo = buscarEquipo(nombreEquipo);
        if (equipo != null) {
            equipo.getDeportistas().addAll(jugadores);
            System.out.println("Jugadores asignados al equipo " + nombreEquipo + " con éxito.");
        } else {
            System.out.println("No se encontró un equipo con el nombre especificado.");
        }
    }

    public void asignarEntrenador(String nombreEquipo, Entrenador entrenador) {
        Equipo equipo = buscarEquipo(nombreEquipo);

        if (equipo != null) {
            equipo.setEntrenador(entrenador);
            System.out.println("Entrenador asignado al equipo " + nombreEquipo + " con éxito.");
        } else {
            System.out.println("No se encontró un equipo con el nombre especificado.");
        }
    }
}
