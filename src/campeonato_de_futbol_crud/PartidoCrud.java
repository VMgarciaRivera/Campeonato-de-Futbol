/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campeonato_de_futbol_crud;

import campeonato.de.futbol.Base.Arbitro;
import campeonato.de.futbol.Base.Equipo;
import campeonato.de.futbol.Base.Partido;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author BCpollito
 */
public class PartidoCrud {

    private Map<Integer, Partido> partidos = new HashMap<>();
    private int nextId = 1;

    // Agregar partido
    public void agregar(String fecha, String hora, String estadio, int ronda,
            Equipo equipoLocal, Equipo equipoVisitante, Arbitro arbitro) throws Exception {
        for (Partido p : partidos.values()) {
            if (p.getFecha().equalsIgnoreCase(fecha)
                    && p.getHora().equalsIgnoreCase(hora) && p.getEstadio().equalsIgnoreCase(estadio)) {
                throw new Exception("Ya existe un partido registrado El dia "
                        + "" + fecha + " a las " + hora + " en el estadio " + estadio);
            }
        }
        Partido partido = new Partido(nextId, fecha, hora, estadio, ronda, equipoLocal, equipoVisitante, arbitro);
        partidos.put(nextId, partido);
        System.out.println("Partido programado: " + equipoLocal.getNombre() + " vs " + equipoVisitante.getNombre() + " | ID: " + nextId);
        nextId++;
    }

    // Buscar por ID
    public Partido buscar(int id) throws Exception {
        if (!partidos.containsKey(id)) {
            throw new Exception("No existe Partido con el id: " + id);
        }
        return partidos.get(id);
    }

    // Registrar gol
    public void registrarGol(int idPartido, String nombreEquipo) throws Exception {
        if (!partidos.containsKey(idPartido)) {
            throw new Exception("No se encontro el partido");
        }
        Partido partido = partidos.get(idPartido);
        partido.registrarGol(nombreEquipo);
        System.out.println("Gol registrado para: " + nombreEquipo);
    }

    // Mostrar resultado
    public void mostrarResultado(int idPartido) throws Exception {
        if (!partidos.containsKey(idPartido)) {
            throw new Exception("No se encontro el partido");
        }
        Partido partido = partidos.get(idPartido);
        partido.mostrarResultado();
    }

    // Eliminar partido
    public void eliminar(int id) throws Exception {
        if (!partidos.containsKey(id)) {
            throw new Exception("No se encontro el partido");
        }
        partidos.remove(id);
        System.out.println("Partido eliminado con ID: " + id);

    }

    // Mostrar todos los partidos
    public void mostrarTodos() throws Exception{
        if (partidos.isEmpty()) {
            throw new Exception("No hay partidos registrados.");
        }

        System.out.println("Lista de partidos:");
        for (Partido p : partidos.values()) {
            System.out.println("ID: " + p.getId() + " | "
                    + p.getEquipoLocal().getNombre() + " vs " + p.getEquipoVisitante().getNombre()
                    + " | Fecha: " + p.getFecha() + " " + p.getHora()
                    + " | Estadio: " + p.getEstadio());
        }
    }
}
