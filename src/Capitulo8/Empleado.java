
package Capitulo8;

/**
 *
 * @author JHONATAN CORTEZ
 * ejemplo de clases con referencia a otros objetos
 * una forma de composicion es decir clases compuestas por otras
 */
public class Empleado {
    private String nombre;
    private String apellido;
    //variables de tipo clase Fecha
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;
    
    public Empleado(String nombre, String apellido, Fecha fechaNacimiento, Fecha fechaContratacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
    }
    
    //convierte empleado a formato String
    public String toString(){
        return String.format("%s, %s COntratado: %s Cumpleaños: %s",
                apellido, nombre, fechaContratacion, fechaNacimiento);
    }
}
