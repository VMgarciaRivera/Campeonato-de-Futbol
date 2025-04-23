/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campeonato.de.futbol.Base;

/**
 *
 * @author BCpollito
 */
public class PersonalLogistico {

    private String nombre;
    private String rol;            // Ej: Médico, Utilero, Asistente
    private String especialidad;   // Ej: Fisioterapia, Equipamiento, etc.

    public PersonalLogistico(String nombre, String rol, String especialidad) {
        this.nombre = nombre;
        this.rol = rol;
        this.especialidad = especialidad;
    }

    public void asignarTarea(String tarea) {
        System.out.println(nombre + " (" + rol + ") ha sido asignado a la tarea: " + tarea);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " | Rol: " + rol + " | Especialidad: " + especialidad);
    }
}
