
package campeonato_de_futbol_crud;

import campeonato.de.futbol.Base.DirectorTecnico;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author BCpollito
 */
public class DirectorTecnicoCrud {
    private Map<Integer, DirectorTecnico> tecnicos = new HashMap<>();

    // Agregar DT (el id puede ser la cedula)
    public void agregar(int id,String nombre, String nacionalidad, int experiencia) throws Exception{
        if (tecnicos.containsKey(id)) {
            throw new Exception("El director Tenico con el id: "+ id +". Ya Existe.");
        }
        DirectorTecnico dt = new DirectorTecnico(id, nombre, nacionalidad, experiencia);
        tecnicos.put(id, dt);
        System.out.println("Director Técnico agregado: " + nombre + " | ID: " + id);
    }

    // Buscar por ID
    public DirectorTecnico buscar(int id) throws Exception{
        if (!tecnicos.containsKey(id)) {
            throw new Exception("El DT con el id: "+ id + " no existe");
        }
        return tecnicos.get(id);
    }

    // Editar datos del DT
    public void editar(int id, String nuevoNombre, String nuevaNacionalidad, int nuevaExperiencia) throws Exception{
        if (!tecnicos.containsKey(id)) {
            throw new Exception("No existe Dt con el id: "+ id);
        }
        DirectorTecnico dt = tecnicos.get(id);
            dt.setNombre(nuevoNombre);
            dt.setNacionalidad(nuevaNacionalidad);
            dt.setExperiencia(nuevaExperiencia);
            System.out.println("DT actualizado con ID: " + id);
        
    }

    // Eliminar por ID
    public void eliminar(int id) throws Exception{
        if (tecnicos.containsKey(id)) {
            tecnicos.remove(id);
            System.out.println("DT eliminado con ID: " + id);
        } else {
            throw new Exception("No existe Dt con el id: "+ id);
        }
    }

    // Mostrar todos
    public void mostrarTodos() throws Exception{
        if (tecnicos.isEmpty()) {
            throw new Exception("No hay directores técnicos registrados.");
        }

        System.out.println("Lista de Directores Técnicos:");
        for (DirectorTecnico dt : tecnicos.values()) {
            System.out.println("ID: " + dt.getId() + " | Nombre: " + dt.getNombre() +
                               " | Nacionalidad: " + dt.getNacionalidad() +
                               " | Experiencia: " + dt.getExperiencia() + " años");
        }
    }
}
