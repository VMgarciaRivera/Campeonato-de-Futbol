package campeonato_de_futbol_crud;

import campeonato.de.futbol.Base.DirectorTecnico;
import campeonato.de.futbol.Base.Equipo;
import campeonato.de.futbol.Base.Jugador;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author BCpollito
 */
public class EquipoCrud {

    private Map<Integer, Equipo> equipos = new HashMap<>();
    private int nextId = 1;

    // Agregar equipo
    public void agregar(String nombre, String pais) throws Exception {
        for (Equipo e : equipos.values()) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                throw new Exception("Equipo con nombre '" + nombre + "Ya existe!!s");
            }
        }
        Equipo equipo = new Equipo(nextId, nombre, pais);
        equipos.put(nextId, equipo);
        System.out.println("Equipo agregado: " + nombre + " | ID: " + nextId);
        nextId++;
    }

    // Buscar equipo por ID
    public Equipo buscar(int id) throws Exception{
        if (!equipos.containsKey(id)) {
            throw new Exception("No se puede Buscar. Equipo no existe.");
        }
        return equipos.get(id);
    }

    // Editar nombre y país
    public void editar(int id, String nuevoNombre, String nuevoPais) throws Exception{
        if (!equipos.containsKey(id)) {
            throw new Exception("No se puede Editar. Equipo no existe.");
        }
        Equipo equipo = equipos.get(id);
            equipo.setNombre(nuevoNombre);
            equipo.setPais(nuevoPais);
            System.out.println("Equipo actualizado con ID: " + id);
    }

    // Eliminar equipo
    public void eliminar(int id) throws Exception{
        if (!equipos.containsKey(id)) {
            throw new Exception("No se puede eliminar. Equipo no existe.");
        }
            equipos.remove(id);
            System.out.println("Equipo eliminado con ID: " + id);
        }

    // Mostrar todos los equipos
    public void mostrarTodos() throws Exception{
        if (equipos.isEmpty()) {
            throw new Exception("No hay equipos registrados.");
        }

        System.out.println("Lista de equipos:");
        for (Equipo e : equipos.values()) {
            System.out.println("ID: " + e.getId() + " | Nombre: " + e.getNombre() + " | Pais: " + e.getPais());
        }
    }

    //Asignar director técnico a un equipo
    public void asignarDT(int idEquipo, DirectorTecnico dt) throws Exception{
        if (!equipos.containsKey(idEquipo)) {
            throw new Exception("Equipo no encontrado.");
        }
        Equipo equipo = equipos.get(idEquipo);
            equipo.setDirectorTecnico(dt);
            System.out.println("DT asignado al equipo: " + equipo.getNombre());
    }

    //Agregar jugador a un equipo
    public void agregarJugador(int idEquipo, Jugador jugador) throws Exception{
        if (!equipos.containsKey(idEquipo)) {
            throw new Exception("Equipo no encontrado");
        }
        Equipo equipo = equipos.get(idEquipo);
            equipo.agregarJugador(jugador);
            System.out.println("Jugador agregado a equipo " + equipo.getNombre() + ": " + jugador.getNombre());
    }

    //Mostrar resumen estadístico
    public void mostrarResumen(int idEquipo) throws Exception{
        if (!equipos.containsKey(idEquipo)) {
            throw new Exception("No se encontro equipo con ID: " + idEquipo);
        }
        Equipo equipo = equipos.get(idEquipo);
            equipo.mostrarResumen();
    }
}
