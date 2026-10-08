
package com.mycompany.sachaslimpia;


public class Conductor {
    
    private String nmae;
    private int cedula;
    private boolean disponibilidad;

    public Conductor(String nmae, int cedula, boolean disponibilidad) {
        this.nmae = nmae;
        this.cedula = cedula;
        this.disponibilidad = disponibilidad;
    }

    public String getNmae() {
        return nmae;
    }

    public void setNmae(String nmae) {
        this.nmae = nmae;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
    
    
}
