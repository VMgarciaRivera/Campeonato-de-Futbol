package campeonato.de.futbol.Base;

/**
 *
 * @author BCpollito
 */
public class Premio {
    private int id;
    private String titulo;
    private String descripcion;
    private String tipo; // Ej: Mejor Arquero, Máximo Goleador, etc.
    private PersonaPremiable ganador;

    public Premio(int id, String titulo, String descripcion, String tipo) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public PersonaPremiable getGanador() {
        return ganador;
    }

    public void setGanador(PersonaPremiable ganador) {
        this.ganador = ganador;
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
