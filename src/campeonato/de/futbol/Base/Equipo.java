package campeonato.de.futbol.Base;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author BCpollito
 */
public class Equipo {

    private String nombre, pais;
    private int puntos;
    private int golesAFavor;
    private int golesEnContra;
    private DirectorTecnico directorTecnico;
    private List<Jugador> jugadores;
    private List<PersonalLogistico> personalLogistico;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.jugadores = new ArrayList<>();
        this.personalLogistico = new ArrayList<>();     
        this.puntos = 0;
        this.golesAFavor = 0;
        this.golesEnContra = 0;
    }
    
     public void setDirectorTecnico(DirectorTecnico dt) {
        this.directorTecnico = dt;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void agregarPersonal(PersonalLogistico persona) {
        personalLogistico.add(persona);
    }


    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }
    
    public DirectorTecnico getDirectorTecnico() {
        return directorTecnico;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public List<PersonalLogistico> getPersonalLogistico() {
        return personalLogistico;
    }

    public void actualizarEstadisticas(int golesMarcados, int golesRecibidos) {
        this.golesAFavor += golesMarcados;
        this.golesEnContra += golesRecibidos;

        if (golesMarcados > golesRecibidos) {
            puntos += 3;
        } else if (golesMarcados == golesRecibidos) {
            puntos += 1;
        }
    }

    public void mostrarResumen() {
        System.out.println("Equipo: " + nombre + " (" + pais + ")");
        System.out.println("Puntos: " + puntos + " | Goles a Favor: " + golesAFavor + " | Goles en Contra: " + golesEnContra);
    }

}
