/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campeonato.de.futbol.Base;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BCpollito
 */
public class Partido {

    private String fecha;
    private String hora;
    private String estadio;
    private int ronda;

    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Arbitro arbitro;

    private int golesLocal;
    private int golesVisitante;

    public Partido(String fecha, String hora, String estadio, int ronda,
            Equipo equipoLocal, Equipo equipoVisitante, Arbitro arbitro) {
        this.fecha = fecha;
        this.hora = hora;
        this.estadio = estadio;
        this.ronda = ronda;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.arbitro = arbitro;
        this.golesLocal = 0;
        this.golesVisitante = 0;
    }

    // Método para registrar goles
    public void registrarGol(String equipoNombre) {
        if (equipoNombre.equalsIgnoreCase(equipoLocal.getNombre())) {
            golesLocal++;
        } else if (equipoNombre.equalsIgnoreCase(equipoVisitante.getNombre())) {
            golesVisitante++;
        }
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getEstadio() {
        return estadio;
    }

    public int getRonda() {
        return ronda;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void mostrarResultado() {
        System.out.println("Resultado: " + equipoLocal.getNombre() + " " + golesLocal
                + " - " + golesVisitante + " " + equipoVisitante.getNombre());
    }
}
