package campeonato.de.futbol.Base;

/**
 *
 * @author BCpollito
 */
public class Premio {
    private String titulo;
    private String descripcion;
    private String tipo; // Ej: Mejor Arquero, Máximo Goleador, etc.
    private PersonaPremiable ganador;

    public Premio(String titulo, String descripcion, String tipo) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public void asignarGanador(PersonaPremiable ganador) {
        this.ganador = ganador;
    }

    public void mostrarPremio() {
        System.out.println("Premio: " + titulo);
        System.out.println("Tipo: " + tipo + " | Descripcion: " + descripcion);
        if (ganador != null) {
            System.out.println("Ganador: " + ganador.getNombre() + " (" + ganador.getTipo() + ")");
        } else {
            System.out.println("Ganador: No asignado");
        }
    }
}
