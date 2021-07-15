
package Capitulo14;

public class StringValueOf {
    public static void main(String[] args) {
        char[] aregloChar = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean valorBolean = true;
        char valorCaracter = 'Z';
        int valorEntero = 7;
        long valorLong = 10000000000L;
        float valorFloat = 2.5f;
        double valorDouble = 33.333;
        Object refObject = "hola";  
        System.out.printf("arreglo de  valores char = %s%n", String.valueOf(aregloChar));
        System.out.printf("parte del arreglo char = %s%n", String.valueOf(aregloChar, 3, 3));
        System.out.printf("boolean = %s%n", String.valueOf(valorBolean));
        System.out.printf("char = %s%n", String.valueOf(valorCaracter));
        System.out.printf("int = %s%n", String.valueOf(valorEntero));
        System.out.printf("long = %s%n", String.valueOf(valorLong));
        System.out.printf("float = %s%n", String.valueOf(valorFloat));
        System.out.printf("double = %s%n", String.valueOf(valorDouble));
        System.out.printf("Object = %s", String.valueOf(refObject));
    }
    
    
}
