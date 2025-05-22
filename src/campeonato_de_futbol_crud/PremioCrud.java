/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campeonato_de_futbol_crud;

import campeonato.de.futbol.Base.PersonaPremiable;
import campeonato.de.futbol.Base.Premio;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author BCpollito
 */
public class PremioCrud {

    private Map<Integer, Premio> premios = new HashMap<>();
    private int nextId = 1;

    // Agregar premio
    public void agregar(String titulo, String descripcion, String tipo) throws Exception {

        for (Premio pre : premios.values()) {
            if (pre.getTitulo().equalsIgnoreCase(titulo)) {
                throw new Exception("Ya existe un Premio con el titulo de: " + titulo);
            }
        }

        Premio premio = new Premio(nextId, titulo, descripcion, tipo);
        premios.put(nextId, premio);
        System.out.println("Premio creado: " + titulo + " | ID: " + nextId);
        nextId++;
    }

    // Buscar premio
    public Premio buscar(int id) throws Exception {
        if (!premios.containsKey(id)) {
            throw new Exception("No se encontro el premio con el id: " + id);
        }
        return premios.get(id);
    }

    // Asignar ganador
    public void asignarGanador(int idPremio, PersonaPremiable ganador) throws Exception {
        if (!premios.containsKey(idPremio)) {
            throw new Exception("No se encontro el premio con el id: " + idPremio);
        }
        Premio premio = premios.get(idPremio);
        premio.asignarGanador(ganador);
        System.out.println("Ganador asignado: " + ganador.getNombre() + " (" + ganador.getTipo() + ")");
    }

    // Mostrar todos los premios
    public void mostrarTodos() throws Exception {
        if (premios.isEmpty()) {
            throw new Exception("No hay premios registrados.");
        }

        System.out.println("Lista de premios:");
        for (Premio p : premios.values()) {
            p.mostrarPremio();
            System.out.println("------------------------");
        }
    }

    // Eliminar premio
    public void eliminar(int id) throws Exception {
        if (!premios.containsKey(id)) {
            throw new Exception("No se encontro el premio con el id: " + id);
        }
        premios.remove(id);
        System.out.println("Premio eliminado con ID: " + id);
    }
}
