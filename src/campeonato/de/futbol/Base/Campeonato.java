package campeonato.de.futbol.Base;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author BCpollito
 */
import java.util.ArrayList;
import java.util.List;

public class Campeonato {

    private String nombre;
    private String ubicacion;
    private List<Equipo> equipos;
    private List<Partido> partidos;
    private List<Premio> premios;

    public Campeonato(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.equipos = new ArrayList<>();
        this.partidos = new ArrayList<>();
        this.premios = new ArrayList<>();
    }

    
    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }

    public void agregarPremio(Premio premio) {
        premios.add(premio);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public List<Premio> getPremios() {
        return premios;
    }

    // Setters (opcional)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
