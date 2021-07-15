
package Capitulo10;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaSistemaNomina {
    public static void main(String[] args) {
        EmpleadoAsalariado employAsalary = new EmpleadoAsalariado(800.00, "Jhon", "Smitt", "111-11-1111");
        EmpleadoPorHora employHour = new EmpleadoPorHora(16.75, 40, "Karen", "Price", "222-22-2222");
        EmpleadoPorComision employComision = new EmpleadoPorComision(1000, .06, "Sue", "Jones", "333-33-3333");
        EmpleadoBaseMasComision employPlusComision = new EmpleadoBaseMasComision(300, 5000, .04, "Bob", "Lewis", "444-44-4444");
        
        System.out.println("Empleados procesado por separado");
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                employAsalary, "ingresos", employAsalary.obtenerMontoPago());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                employHour, "ingresos", employHour.obtenerMontoPago());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                employComision, "ingresos", employComision.obtenerMontoPago());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                employPlusComision, "ingresos", employPlusComision.obtenerMontoPago());
        
        //arreglo empleado de 4 elementos
        Empleado[] empleados = new Empleado[4];
        
        //inicializa el arreglo con objetos empleados
        empleados[0] = employAsalary;
        empleados[1] = employHour;
        empleados[2] = employComision;
        empleados[3] = employPlusComision;
        
        System.out.println("====================================");
        System.out.println("Empleado procesados en forma polimorfica\n");
        
        //procesa de forma generica a cada elemento en el arreglo de empleados
        for(Empleado empleadoActual : empleados){
            System.out.println(empleadoActual);
            
            //determina si el elemento es un EmpleadoBaseMasComision
            if (empleadoActual instanceof EmpleadoBaseMasComision) {
                //conversion descendente de la referencia de Empleado
                //a una referencia EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
                
                empleado.setSalarioBase(1.10 * empleado.getSalarioBase());
                System.out.printf("el nuevo salario base con 10%% de aumento es: $%,.2f%n",
                        empleado.getSalarioBase());
            }
            System.out.printf("ingresos $%,.2f%n%n", empleadoActual.obtenerMontoPago());
            
        }
        for (int i = 0; i < empleados.length; i++) {
            System.out.printf("El empleado %d es un %s%n", i, empleados[i].getClass().getName());
        }
    }
}
