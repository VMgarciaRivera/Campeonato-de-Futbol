
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
    public void agregar(int id,String nombre, String nacionalidad, int experiencia) {
        DirectorTecnico dt = new DirectorTecnico(id, nombre, nacionalidad, experiencia);
        tecnicos.put(id, dt);
        System.out.println("Director Técnico agregado: " + nombre + " | ID: " + id);
    }

    // Buscar por ID
    public DirectorTecnico buscar(int id) {
        return tecnicos.get(id);
    }

    // Editar datos del DT
    public void editar(int id, String nuevoNombre, String nuevaNacionalidad, int nuevaExperiencia) {
        DirectorTecnico dt = tecnicos.get(id);
        if (dt != null) {
            dt.setNombre(nuevoNombre);
            dt.setNacionalidad(nuevaNacionalidad);
            dt.setExperiencia(nuevaExperiencia);
            System.out.println("✏️ DT actualizado con ID: " + id);
        } else {
            System.out.println("❌ No se encontró un DT con ese ID.");
        }
    }

    // Eliminar por ID
    public void eliminar(int id) {
        if (tecnicos.containsKey(id)) {
            tecnicos.remove(id);
            System.out.println("🗑️ DT eliminado con ID: " + id);
        } else {
            System.out.println("❌ No existe DT con ese ID.");
        }
    }

    // Mostrar todos
    public void mostrarTodos() {
        if (tecnicos.isEmpty()) {
            System.out.println("📭 No hay directores técnicos registrados.");
            return;
        }

        System.out.println("📋 Lista de Directores Técnicos:");
        for (DirectorTecnico dt : tecnicos.values()) {
            System.out.println("ID: " + dt.getId() + " | Nombre: " + dt.getNombre() +
                               " | Nacionalidad: " + dt.getNacionalidad() +
                               " | Experiencia: " + dt.getExperiencia() + " años");
        }
    }
}
