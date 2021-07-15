
package Capitulo4;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class Estudiante {
    private String nombre;
    private double promedio;

    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        if (promedio>0.0 && promedio<=100) {
            this.promedio = promedio;            
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio>0.0 && promedio<=100) {
            this.promedio = promedio;
        }
    }
    
    public String obtenerCalificacion(){
        String calificacion = "";
        if (promedio>=90) 
            calificacion = "A";
         else if(promedio >= 80)
            calificacion = "B";
         else if(promedio >= 70)
            calificacion = "C";
         else if(promedio >=60)
            calificacion = "D";
         else
            calificacion = "F";
        
        return calificacion;
    }
}
