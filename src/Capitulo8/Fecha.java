
package Capitulo8;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class Fecha {
    private int mes;
    private int dia;
    private int anio;
    
    private static final int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
    //constructor confirma el valor apropiado para el mes y el dia dado el año
    public Fecha(int mes, int dia, int anio){
        //revisa si mes esta en el rango
        if (mes < 0 || mes >= 12) {
            throw new IllegalArgumentException("mes (" + mes + ") debe ser 1-12");
        }
        
        //revisa si dia esta en el rango para el mes
        if (dia<=0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29))) {
            throw new IllegalArgumentException("dia (" + dia +") fuera de rango para el mes y anio especificado");
        }
        
        //revisa si es año bisiesto cuando mes es dos y dia 29
        if (mes == 2 && dia == 29 && !(anio % 400 == 0 || (anio % 4 == 0 && anio % 100 !=0))) {
            throw new IllegalArgumentException("dia (" + dia+ ") fuera del rango para el mes y año especificado");
        }
        
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
        
        System.out.printf("Constructor de objeto Fecha para la fecha %s%n", this);
    }
    
    public String toString(){
        return String.format("%d/%d/%d", mes, dia, anio);
    }
}
