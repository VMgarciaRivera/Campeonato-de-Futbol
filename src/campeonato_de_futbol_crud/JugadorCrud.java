package campeonato_de_futbol_crud;

import java.util.HashMap;
import java.util.Map;
import campeonato.de.futbol.Base.Jugador;

/**
 *
 * @author BCpollito
 */
public class JugadorCrud {

    private Map<Integer, Jugador> jugadores = new HashMap<>();

    // Agregar jugador El id puede ser la cedula 
    public void agregar(int id, String nombre, String nacionalidad, int numero, String posicion) throws Exception{
        if (jugadores.containsKey(id)) {
            throw new Exception("El jugador con el id: "+ id +". Ya Existe");
        }
        if (nombre.isBlank() || nacionalidad.isBlank() || posicion.isBlank()) {
            throw new Exception("Los campos no pueden estar Vacios!!");
        }
        Jugador jugador = new Jugador(id, nombre, nacionalidad, numero, posicion);
        jugadores.put(id, jugador);
        System.out.println("Jugador agregado: " + nombre + " | ID: " + id);
    }

    // Buscar jugador por ID
    public Jugador buscar(int id) throws Exception {
        if (!jugadores.containsKey(id)) {
            throw new Exception("Jugador con ID " + id + " no encontrado.");
        }
        return jugadores.get(id);
    }

    // Editar nombre por ID
    public void editarNombre(int id, String nuevoNombre) throws Exception{
        if (!jugadores.containsKey(id) ) {
            throw new Exception("No se puede editar. Jugador no existe.");
        }
        Jugador jugador = jugadores.get(id);
            jugador.setNombre(nuevoNombre);
            System.out.println(" Nombre actualizado para ID " + id);
    }

    // Eliminar por ID
    public void eliminar(int id) throws Exception {
        if (!jugadores.containsKey(id)) {
            throw new Exception("No se puede eliminar. Jugador no existe.");
        }
        jugadores.remove(id);
        System.out.println("Jugador eliminado con ID: " + id);
    }

    // Mostrar todos los jugadores
    public void mostrarTodos() throws Exception {
            if (jugadores.isEmpty()) {
                throw new Exception("No hay jugadores registrados.");
            }
            for (Jugador j : jugadores.values()) {
                System.out.println("ID: " + j.getId() + " | Nombre: " + j.getNombre());
            }        
    }

}
