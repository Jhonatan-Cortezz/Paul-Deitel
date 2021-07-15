
package Capitulo14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class ConcordanciaRegex {
    public static void main(String[] args) {
        //se crea la expresion regular
        Pattern expresion = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");
        String cadena1 = "Jane nacio el 05-12-75\n" + "Dave nacio el 11-04-68\n" + "John nacio el 04-28-73\n" + "Joe nacio el 12-17-77";
        
        Matcher matcher = expresion.matcher(cadena1);
        while (matcher.find()) {            
            System.out.println(matcher.group());
        }
    }
}
