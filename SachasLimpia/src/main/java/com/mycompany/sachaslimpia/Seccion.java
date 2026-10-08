package com.mycompany.sachaslimpia;

public class Seccion {

    private String nameseccion;
    private float legth;
    private float timecleanestimated;

    public Seccion(String nameseccion, float legth, float timecleanestimated) {
        this.nameseccion = nameseccion;
        this.legth = legth;
        this.timecleanestimated = timecleanestimated;
    }

    public String getNameseccion() {
        return nameseccion;
    }

    public void setNameseccion(String nameseccion) {
        this.nameseccion = nameseccion;
    }

    public float getLegth() {
        return legth;
    }

    public void setLegth(float legth) {
        this.legth = legth;
    }

    public float getTimecleanestimated() {
        return timecleanestimated;
    }

    public void setTimecleanestimated(float timecleanestimated) {
        this.timecleanestimated = timecleanestimated;
    }

}
