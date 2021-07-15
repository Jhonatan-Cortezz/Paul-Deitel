
package Capitulo8;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class EmpleadoStatic {
    private static int cuenta = 0;//numero de objetos Empleado creados
    private String nombre;
    private String apellido;
    
    public EmpleadoStatic(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        
        ++cuenta; //incrementa la variable cuenta de empleados
        System.out.printf("Constructor de empleado: %s %s; cuenta = %d%n", nombre, apellido, cuenta);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    //metodo static  para obtener el valor de static cuenta
    public static int getCuenta(){
        return cuenta;
    }
}
