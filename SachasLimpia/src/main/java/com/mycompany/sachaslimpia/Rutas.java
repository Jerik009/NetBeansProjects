
package com.mycompany.sachaslimpia;

public class Rutas {
    
    private int code;
    private String nameruta;
    private String seccion[];

    public Rutas(int code, String nameruta, String[] seccion) {
        this.code = code;
        this.nameruta = nameruta;
        this.seccion = seccion;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNameruta() {
        return nameruta;
    }

    public void setNameruta(String nameruta) {
        this.nameruta = nameruta;
    }

    public String[] getSeccion() {
        return seccion;
    }

    public void setSeccion(String[] seccion) {
        this.seccion = seccion;
    }
    
    //metodos
   
    
}
