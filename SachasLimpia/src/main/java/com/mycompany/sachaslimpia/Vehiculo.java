package com.mycompany.sachaslimpia;

public class Vehiculo {
    
   //atributos
    private String licenseplates; 
    private String description;

    public Vehiculo(String licenseplates, String description) {
        this.licenseplates = licenseplates;
        this.description = description;
    }

    public String getLicenseplates() {
        return licenseplates;
    }

    public void setLicenseplates(String licenseplates) {
        this.licenseplates = licenseplates;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
