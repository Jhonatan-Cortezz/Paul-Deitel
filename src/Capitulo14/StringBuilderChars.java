
package Capitulo14;

public class StringBuilderChars {
    public static void main(String[] args) {
        StringBuilder bufer = new StringBuilder("hola a todos");
        System.out.printf("bufer = %s%n", bufer.toString());
        System.out.printf("Caracter en 0: %s%nCaracter en 3: %s%n%n", bufer.charAt(0), bufer.charAt(3));
        
        char[] arreglosChar = new char[bufer.length()];
        bufer.getChars(0, bufer.length(), arreglosChar, 0);
        System.out.print("Los caracteres son: ");
        
        for(char carater : arreglosChar){
            System.out.print(carater);
        }
        
        bufer.setCharAt(0, 'H');
        bufer.setCharAt(7, 'T');
        System.out.printf("%n%nbufer = %s", bufer.toString());
        
        bufer.reverse();
        System.out.printf("%n%nbufer = %s%n", bufer.toString());
            
    }
}
