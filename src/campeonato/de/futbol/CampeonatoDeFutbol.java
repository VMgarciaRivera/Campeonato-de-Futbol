package campeonato.de.futbol;

import campeonato.de.futbol.Base.Arbitro;
import campeonato.de.futbol.Base.DirectorTecnico;
import campeonato.de.futbol.Base.Equipo;
import campeonato.de.futbol.Base.Jugador;
import campeonato_de_futbol_crud.ArbitroCrud;
import campeonato_de_futbol_crud.EquipoCrud;
import campeonato_de_futbol_crud.JugadorCrud;
import campeonato_de_futbol_crud.PartidoCrud;
import campeonato_de_futbol_crud.PremioCrud;

/**
 *
 * @author BCpollito
 */
public class CampeonatoDeFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //CRUDS JUGADOR
        {
            try {
                JugadorCrud crud = new JugadorCrud();

                crud.agregar(1, "Luis Perez", "Colombia", 9, "Delantero");
                crud.agregar(2, "Carlos Ruiz", "Colombia", 10, "Volante");
                crud.agregar(3, "Luis Perez", "Argentina", 7, "Defensa"); // mismo nombre, diferente ID

                crud.mostrarTodos();

                crud.editarNombre(2, "Carlos Alberto Ruiz");

                crud.eliminar(1);

                crud.mostrarTodos();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println("\n\n");

        //CRUDS EQUIPO
        {
            try {
                EquipoCrud equipoCrud = new EquipoCrud();
                equipoCrud.agregar("Tigres FC", "Colombia");

                DirectorTecnico dt = new DirectorTecnico(1, "Juan Herrera", "Colombia", 15);
                equipoCrud.asignarDT(1, dt);

                Jugador jugador = new Jugador(1, "Luis Perez", "Colombia", 9, "Delantero");
                equipoCrud.agregarJugador(1, jugador);

                equipoCrud.mostrarResumen(1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println("\n\n");
        //CRUDS ABITRO
        {
            try {
                ArbitroCrud arbitroCrud = new ArbitroCrud();

                arbitroCrud.agregar(1, "Sandra Rios", "Argentina", "Principal");
                arbitroCrud.agregar(2, "Carlos Gutierrez", "Mexico", "Asistente");

                arbitroCrud.mostrarTodos();

                arbitroCrud.editar(2, "Carlos G. Gutierrez", "Mexico", "Principal");
                arbitroCrud.eliminar(1);

                arbitroCrud.mostrarTodos();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println("\n\n");
        //CRUDS PARTIDO
        {
            try {
                PartidoCrud partidoCrud = new PartidoCrud();
                Equipo equipo1 = new Equipo(1, "Tigres FC", "Colombia");
                Equipo equipo2 = new Equipo(2, "Condores FC", "Chile");
                Arbitro arbitro = new Arbitro(1, "Sandra Rios", "Argentina", "Principal");

                partidoCrud.agregar("2025-05-25", "18:00", "Estadio Nacional", 1, equipo1, equipo2, arbitro);
                partidoCrud.registrarGol(1, "Tigres FC");
                partidoCrud.registrarGol(1, "Condores FC");
                partidoCrud.registrarGol(1, "Tigres FC");

                partidoCrud.mostrarResultado(1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println("\n\n");
        //CRUDS PREMIO
        {
            try {
                PremioCrud premioCrud = new PremioCrud();
                Jugador jugador = new Jugador(1, "Luis Perez", "Colombia", 9, "Delantero");

                premioCrud.agregar("Goleador del torneo", "Maximo anotador", "Individual");
                premioCrud.asignarGanador(1, jugador);
                premioCrud.mostrarTodos();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
