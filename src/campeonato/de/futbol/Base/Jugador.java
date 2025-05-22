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
    private int id;
    private int numeroCamiseta;
    private String posicion;

    public Jugador(int id, String nombre, String nacionalidad, int numeroCamiseta, String posicion) {
        super(nombre, nacionalidad);
        this.id = id;
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getTipo() {
        return "Jugador";
    }

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

