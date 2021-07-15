
package Capitulo8;

/**
 *
 * @author JHONATAN CORTEZ
 */
public enum Libro {
    //declaracion de constantes de tipo enum
    JHTP("Java how to program", "2015"),
    CHTP("C How to program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How To Program", "2014"),
    CSHARPHTP("Visual C# How To Program", "2014");
    
    private final String titulo;
    private final String anioCopyright;
    
    //contructor de enum

    private Libro(String titulo, String anioCopyright) {
        this.titulo = titulo;
        this.anioCopyright = anioCopyright;
    }
    
    //metodo de acceso para el capo titulo
    public String getTitulo(){
        return titulo;
    }
    
    public String getAnioCopyright(){
        return anioCopyright;
    }
    
}
