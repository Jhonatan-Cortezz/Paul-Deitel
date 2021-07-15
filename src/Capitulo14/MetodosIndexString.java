
package Capitulo14;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class MetodosIndexString {
    public static void main(String[] args) {
        String letras = "abcdefghijklmabcdefghijklm";
        
        //prueba indexOf para localizar un carcater en una cadena
        System.out.printf("'c' se encuentra en el indice %d%n", letras.indexOf('c'));
        
        System.out.printf("'a' se encuentra en el indice %d%n", letras.indexOf('a', 1));
        
        System.out.printf("'$' se encuentra en el indice %d%n", letras.indexOf('$'));
        
        //prueba de lastIndexOf para buscar un caracter en una cadena
        System.out.printf("La ultima 'c' se encuentra en el indice %d%n", letras.lastIndexOf('c'));
        System.out.printf("La ultima 'a' se encuentra en el indice %d%n", letras.lastIndexOf('a', 25));
        System.out.printf("La ultima '$' se encuentra en el indice %d%n", letras.lastIndexOf('$'));
        
        //prueba de lastIndexOf para buscar una subcadena en una cadena
        System.out.printf("La ultima ocurrencia de 'def' se encuentra en el indice %d%n", letras.lastIndexOf("def"));
        System.out.printf("La ultima ocurrencia de 'def' se encuentra en el indice %d%n", letras.lastIndexOf("def", 25));
        System.out.printf("La ultima ocurrencia de 'hola' se encuentra en el indice %d%n", letras.lastIndexOf("hola"));
    }
}
