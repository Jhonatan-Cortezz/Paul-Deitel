
package Capitulo14;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class CompararCadena {
    public static void main(String[] args) {
        String s1 = new String("hola");//s1 es una copia de hola
        String s2 = "adios";
        String s3 = "Feliz cumpleaños";
        String s4 = "feliz cumpleaños";
        
        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n%n", s1, s2, s3, s4);
        
        //prueba la igualdad
        if (s1.equals("hola")) {
            System.out.println("s1 es igual a \"hola\"");
        } else {
            System.out.println("s1 no es igual a \"hola\"");
        }
        
        //pruba la igualda con == 
        if (s1 == "hola") {//false; no son el mismo objeto
            System.out.println("s1 es el mismo objeto que \"hola\"");
        } else {
            System.out.println("s1 no es el mismo objeto que \"hola\"");
        }
        
        //prueba la igualda ignora el uso de mausculas/minusculas
        if (s3.equalsIgnoreCase(s4)) {//true
            System.out.printf("%s es igual a %s si se ignora el uso de mayusculas/minusculas", s3, s4);            
        } else {
            System.out.println("s3 no es igual a s4");
        }
        
        //prueba con compateTo
        System.out.printf("%ns1.compareTo(s2) es %d", s1.compareTo(s2));
        System.out.printf("%ns2.compareTo(s1) es %d", s2.compareTo(s1));
        System.out.printf("%ns1.compareTo(s1) es %d", s1.compareTo(s1));
        System.out.printf("%ns3.compareTo(s4) es %d", s3.compareTo(s4));
        System.out.printf("%ns4.compareTo(s3) es %d", s4.compareTo(s3));
        
        //prueba con regionMatches (sensible a mayusculas/minusculas)
        if (s3.regionMatches(0, s4, 0, 5)) {
            System.out.println("Los primeros 5 caracteres de s3 y s5 coinciden");
        } else {
            System.out.println("Los primeros 5 caracteres de s3 y s4 no coinciden");
        }
        
        //prueba con regionMatches ignora el uso de mayusculas y minusculas
        if (s3.regionMatches(true, 0, s4, 0, 5)) {
            System.out.println("Los primeros 5 caracteres de s3 y s4 coinciden ognorando el uso de mayusculas y minusculas ");
        } else {
            System.out.println("Los primeros 5 caracteres de s3 y s4 no coinciden ignorando el uso de mayusculas y minusculas ");
        }
    }
}
