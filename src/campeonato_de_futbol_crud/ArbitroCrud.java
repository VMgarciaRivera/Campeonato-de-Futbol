/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campeonato_de_futbol_crud;

import campeonato.de.futbol.Base.Arbitro;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author BCpollito
 */
public class ArbitroCrud {

    private Map<Integer, Arbitro> arbitros = new HashMap<>();

    // Agregar árbitro
    public void agregar(int id, String nombre, String nacionalidad, String rol) throws Exception {
        //el id Es la identificacion directa del arbitro, la cedula por ejemplo
        if (arbitros.containsKey(id)) {
            throw new Exception("El arbitro con la identificacion: " + id + ". Ya existe!!");
        }
        if (nombre.isBlank() || nacionalidad.isBlank() || rol.isBlank()) {
            throw new Exception("Los campos no pueden estar Vacios!!");
        }
        Arbitro arbitro = new Arbitro(id, nombre, nacionalidad, rol);
        arbitros.put(id, arbitro);
        System.out.println("Arbitro agregado: " + nombre + " | ID: " + id);
    }

    // Buscar por ID
    public Arbitro buscar(int id) throws Exception{
        if (!arbitros.containsKey(id)) {
            throw new Exception("El arbitro con el id: "+ id +". No existe");
        }
        return arbitros.get(id);
    }

    // Editar datos del árbitro
    public void editar(int id, String nuevoNombre, String nuevaNacionalidad, String nuevoRol) throws Exception{
        if (!arbitros.containsKey(id)) {
            throw new Exception("El arbitro con el id: "+ id +". No existe");
        }
        Arbitro arbitro = arbitros.get(id);
            arbitro.setNombre(nuevoNombre);
            arbitro.setNacionalidad(nuevaNacionalidad);
            arbitro.setRol(nuevoRol);
            System.out.println("Arbitro actualizado con ID: " + id);
    }

    // Eliminar árbitro
    public void eliminar(int id) throws Exception{
        if (!arbitros.containsKey(id)) {
            throw new Exception("El arbitro con el id: "+ id +". No existe");
        }
            arbitros.remove(id);
            System.out.println("Arbitro eliminado con ID: " + id);
    }

    // Mostrar todos los árbitros
    public void mostrarTodos() throws Exception{
        if (arbitros.isEmpty()) {
            throw new Exception("No hay arbitros registrados.");
        }

        System.out.println("Lista de arbitros:");
        for (Arbitro a : arbitros.values()) {
            System.out.println("ID: " + a.getId() + " | Nombre: " + a.getNombre()
                    + " | Nacionalidad: " + a.getNacionalidad()
                    + " | Rol: " + a.getRol());
        }
    }
}
