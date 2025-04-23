/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campeonato.de.futbol.Base;

/**
 *
 * @author BCpollito
 */
public class Arbitro {
    private String nombre;
    private String nacionalidad;
    private String rol; // Ej: Principal, Asistente, VAR

    public Arbitro(String nombre, String nacionalidad, String rol) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getRol() {
        return rol;
    }

    public void mostrarInformacion() {
        System.out.println("Árbitro: " + nombre + " | Nacionalidad: " + nacionalidad + " | Rol: " + rol);
    }
}
