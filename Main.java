import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        inicializarGestion();
    }

    public static void inicializarGestion() {
                Deportista deportista1 = new Deportista("Alexis", "Sanchez", "AlexisSanchez00@gmail.com", "9998882", null, "Delantero", null);
                Deportista deportista2 = new Deportista("Juan", "Rodriguez", "JuanRodriguez00@gmail.com", "12312312", null, "Defensa", null);

                Entrenador entrenador1 = new Entrenador("8 Años", "Futbol", null);
                ArrayList<Equipo> equipos = new ArrayList<>();
                Equipo equipo1 = new Equipo("Equipo 1", new ArrayList<>(), new ArrayList<>(), null, new ArrayList<>());
                Equipo equipo2 = new Equipo("Equipo 2", new ArrayList<>(), new ArrayList<>(), null, new ArrayList<>());

                equipos.add(equipo1);
                equipos.add(equipo2);

                Futbol futbol = new Futbol("Fútbol", equipo1, "Campo de césped", "Estadio");

                GestionClub club = new GestionClub(new ArrayList<>(), entrenador1, equipos);

                ArrayList<Deportista> jugadores = new ArrayList<>();
                jugadores.add(deportista1);
                jugadores.add(deportista2);

                club.asignarJugadores("Equipo 1", jugadores);

                club.asignarEntrenador("Equipo 1", entrenador1);

                Equipo equipoMostrar = club.buscarEquipo("Equipo 1");
                equipoMostrar.mostrarEstadisticas();

                equipoMostrar.historialEquipo();
            }
        }
