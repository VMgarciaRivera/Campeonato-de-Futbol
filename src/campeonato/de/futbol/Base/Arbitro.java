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
    private int id;
    private String nombre;
    private String nacionalidad;
    private String rol;

    public Arbitro(int id, String nombre, String nacionalidad, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
