/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campeonato.de.futbol.Base;

/**
 *
 * @author BCpollito
 */
public class Jugador extends PersonaPremiable {
    private int numeroCamiseta;
    private String posicion;

    public Jugador(String nombre, String nacionalidad, int numeroCamiseta, String posicion) {
        super(nombre, nacionalidad);
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
    }

    @Override
    public String getTipo() {
        return "Jugador";
    }

    // Getters adicionales
    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNumeroCamiseta(int numero) {
        this.numeroCamiseta = numero;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}

