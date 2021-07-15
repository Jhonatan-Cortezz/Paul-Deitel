
package Capitulo14;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class StringBuilderDeleteInsert {
    public static void main(String[] args) {
        Object refObject = "hola";
        String cadena = "adios";
        char[] arregloChar = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean valorBoolean = true;
        char valorChar = 'K';
        int valorInt = 7;
        long valorLong = 10000000;
        float valorFloat = 2.5f;
        double valorDouble = 33.333;

        StringBuilder bufer = new StringBuilder();

        bufer.insert(0, refObject);
        bufer.insert(0, "  ");
        bufer.insert(0, cadena);
        bufer.insert(0, "  ");
        bufer.insert(0, arregloChar);
        bufer.insert(0, "  ");
        bufer.insert(0, arregloChar, 3, 3);
        bufer.insert(0, "  ");
        bufer.insert(0, valorBoolean);
        bufer.insert(0, "  ");
        bufer.insert(0, valorChar);
        bufer.insert(0, "  ");
        bufer.insert(0, valorInt);
        bufer.insert(0, "  ");
        bufer.insert(0, valorLong);
        bufer.insert(0, "  ");
        bufer.insert(0, valorFloat);
        bufer.insert(0, "  ");
        bufer.insert(0, valorDouble);
        
        System.out.printf("bufer despues de insertar:%n%s%n%n", bufer.toString());
        bufer.deleteCharAt(10); //delete the 5 in 2.5
        bufer.delete(2, 6);//delete the .333 in 33.333
        
        System.out.printf("bufer despues de eliminar:%n%s%n", bufer.toString());
        
    }
    
}
