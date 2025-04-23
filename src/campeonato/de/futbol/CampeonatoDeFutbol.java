package campeonato.de.futbol;

import campeonato.de.futbol.Base.Arbitro;
import campeonato.de.futbol.Base.Campeonato;
import campeonato.de.futbol.Base.DirectorTecnico;
import campeonato.de.futbol.Base.Equipo;
import campeonato.de.futbol.Base.Jugador;
import campeonato.de.futbol.Base.Partido;
import campeonato.de.futbol.Base.PersonalLogistico;
import campeonato.de.futbol.Base.Premio;

/**
 *
 * @author BCpollito
 */
public class CampeonatoDeFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear el campeonato
        Campeonato campeonato = new Campeonato("Liga Internacional", "Sudamerica");

        // Crear dos equipos
        Equipo equipo1 = new Equipo("Tigres FC", "Colombia");
        Equipo equipo2 = new Equipo("Condores FC", "Chile");

        // Asignar directores técnicos
        DirectorTecnico dt1 = new DirectorTecnico("Juan Herrera", "Colombia", 10);
        DirectorTecnico dt2 = new DirectorTecnico("Carlos Soto", "Chile", 12);
        equipo1.setDirectorTecnico(dt1);
        equipo2.setDirectorTecnico(dt2);

        // Agregar jugadores
        equipo1.agregarJugador(new Jugador("Luis Perez", "Colombia", 9, "Delantero"));
        equipo1.agregarJugador(new Jugador("David Gomez", "Colombia", 10, "Volante"));

        equipo2.agregarJugador(new Jugador("Andres Vidal", "Chile", 7, "Delantero"));
        equipo2.agregarJugador(new Jugador("Sebastian Diaz", "Chile", 5, "Defensa"));

        //  Agregar personal logístico
        equipo1.agregarPersonal(new PersonalLogistico("Camilo Ruiz", "Medico", "Fisioterapia"));
        equipo2.agregarPersonal(new PersonalLogistico("Laura Salas", "Utilera", "Equipamiento"));

        // Registrar equipos en el campeonato
        campeonato.agregarEquipo(equipo1);
        campeonato.agregarEquipo(equipo2);

        //Crear y asignar árbitro
        Arbitro arbitro = new Arbitro("Sandra Rios", "Argentina", "Principal");

        //  Programar un partido
        Partido partido = new Partido("2025-04-15", "18:00", "Estadio Nacional", 1,
                equipo1, equipo2, arbitro);
        partido.registrarGol(equipo1.getNombre());
        partido.registrarGol(equipo2.getNombre());
        partido.registrarGol(equipo1.getNombre()); // Resultado: 2-1

        campeonato.agregarPartido(partido);

        // Crear y asignar un premio
        Premio premio = new Premio("Goleador del torneo", "Premio al maximo goleador", "Individual");
        premio.asignarGanador(equipo1.getJugadores().get(0)); // Luis Pérez
        campeonato.agregarPremio(premio);

        // === MOSTRAR RESULTADOS ===
        System.out.println("Campeonato: " + campeonato.getNombre() + " (" + campeonato.getUbicacion() + ")");

        System.out.println("\nEquipos participantes:");
        for (Equipo eq : campeonato.getEquipos()) {
            System.out.println("- " + eq.getNombre() + " | DT: " + eq.getDirectorTecnico().getNombre());
            System.out.println("  Jugadores:");
            for (Jugador j : eq.getJugadores()) {
                System.out.println("    * " + j.getNombre() + " (#" + j.getNumeroCamiseta() + ")");
            }
        }

        System.out.println("\nPartidos:");
        for (Partido p : campeonato.getPartidos()) {
            System.out.println("- " + p.getEquipoLocal().getNombre() + " vs " + p.getEquipoVisitante().getNombre());
            System.out.println("  Resultado: " + p.getGolesLocal() + " - " + p.getGolesVisitante());
            System.out.println("  Arbitro: " + p.getArbitro().getNombre());
        }

        System.out.println("\nPremios:");
        for (Premio pr : campeonato.getPremios()) {
            pr.mostrarPremio();
        }
    }
}
