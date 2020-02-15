
package archivos;

import java.io.File;
import java.io.FileWriter;
import archivos.Archivos;

public class Archivos {

   private String nombre; // cada caracter ocupa 2 bytes
   String puesto;
   private boolean activo;

    public Archivos() {
        nombre = "NN";
        puesto = "NN";
        activo = true;
    }

    public Archivos(String nombre, String puesto, boolean activo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.activo = activo;
    }
    
    
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

   public String toString() {
        return "\nNombre: " + nombre + "\nEdad: " + puesto;
    } 
    
    
}
