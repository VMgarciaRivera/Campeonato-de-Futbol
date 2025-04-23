package campeonato.de.futbol.Base;

/**
 *
 * @author BCpollito
 */
public abstract class PersonaPremiable {
    protected String nombre;
    protected String nacionalidad;

    public PersonaPremiable(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public abstract String getTipo(); // "Jugador" o "Director Técnico"
}

