/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campeonato.de.futbol.Base;

/**
 *
 * @author BCpollito
 */
public class DirectorTecnico extends PersonaPremiable {
    private int experiencia; // años

    public DirectorTecnico(String nombre, String nacionalidad, int experiencia) {
        super(nombre, nacionalidad);
        this.experiencia = experiencia;
    }

    @Override
    public String getTipo() {
        return "Director Técnico";
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
