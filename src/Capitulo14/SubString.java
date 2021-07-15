
package Capitulo14;

public class SubString {
    public static void main(String[] args) {
        String letras = "abcdefghijklmabcdefghijklm";
        
        System.out.printf("La subcadena desde el indice 20 hasta el final es %s%n", letras.substring(20));
        System.out.printf("%s '%s' %n", "La subcadena desde el indice 3 hasta, peros in incluir al 6 es", letras.substring(3, 6));
    }
}
