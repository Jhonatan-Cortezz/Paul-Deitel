
package Capitulo7;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class LibroCalificaciones {
    private String nombreDelCurso;
    private int[] calificaciones;

    public LibroCalificaciones(String nombreDelCurso, int[] calificaciones) {
        this.nombreDelCurso = nombreDelCurso;
        this.calificaciones = calificaciones;
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }
    
    //realiza varias operaciones sobre los datos
    public void procesarCalificaciones(){
        //pendiente
        imprimirCalificaciones();
        
        System.out.printf("%nEl promedio de la clase es %.2f%n", obtenerPromedio());
        
        System.out.printf("La calificacion mas baja es %d%nLa calificación mas alta es %d%n%n",
                            obtenerMinima(), obtenerMaxima());
    }
    
    //busca la calificacion mas baja
    public int obtenerMinima(){
        int califBaja = calificaciones[0];//asume que 0 es la menor calificacion
        
        for(int calificacion : calificaciones){
            if (calificacion < califBaja) {
                califBaja = calificacion;
            }
        }
        return califBaja;
    }
    
    //calificacion maxima
    public int obtenerMaxima(){
        int califAlta = calificaciones[0];
        
        for(int calificacion : calificaciones){
            if (calificacion > califAlta) {
                califAlta = calificacion;
            }
        }
        return califAlta;
    }
    
    //promedio de las calificaciones
    public double obtenerPromedio(){
        int total = 0;
        
        for(int calificacion : calificaciones){
            total += calificacion;
        }
        return (double) total / calificaciones.length;
    }
    
    //imprimir grafico de barras
    public void imprimirGraficoBarras(){
        System.out.println("Distribucion de calificacines");
        
        int[] frecuencia = new int[11];//almacena la frecuencia de las calificaciones en cada rango de 10
        
        for(int calificacion : calificaciones){
            ++frecuencia[calificacion / 10];//incrementa la frecuencia apropiada para cada calificacion
        }
        
        for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
            if (cuenta == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", cuenta * 10, cuenta * 10 + 9);//muestra los intervalos
            }
            
            //imprime asteriscos
            for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
    
    public void imprimirCalificaciones(){
        System.out.printf("Las calificaciones son:%n%n");
        //imprime la calificacion de cada estudiante
        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            System.out.printf("Estudiante %2d: %3d%n", estudiante + 1, calificaciones[estudiante]);
        }
    }
}
