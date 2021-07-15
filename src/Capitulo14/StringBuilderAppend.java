
package Capitulo14;

public class StringBuilderAppend {
    
    public static void main(String[] args) {
        Object refObject = "Hola";
        String cadena = "Adios";
        char[] arregloChar = {'a', 'b', 'c', 'd','e', 'f'};
        boolean valorBoolean = true;
        char valorChar = 'Z';
        int valorInt = 7;
        long valorLong = 10000000000L;
        float valorFloat = 2.5f;
        double valorDouble = 33.333;
        
        StringBuilder ultimoBuffer = new StringBuilder("ultimo bufer");
        StringBuilder bufer = new StringBuilder();
        
        bufer.append(refObject)
                .append("\n")
                .append(cadena)
                .append("\n")
                .append(arregloChar)
                .append("\n")
                .append(arregloChar, 0, 3)
                .append("\n")
                .append(valorBoolean)
                .append("\n")
                .append(valorChar)
                .append("\n")
                .append(valorInt)
                .append("\n")
                .append(valorLong)
                .append("\n")
                .append(valorFloat)
                .append("\n")
                .append(valorDouble)
                .append("\n")
                .append(ultimoBuffer);
        
        System.out.printf("Bufer contiene%n%s%n", bufer.toString());
    }
}
