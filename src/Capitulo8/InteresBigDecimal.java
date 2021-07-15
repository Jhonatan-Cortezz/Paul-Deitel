
package Capitulo8;

/**
 *
 * @author JHONATAN CORTEZ
 */
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class InteresBigDecimal {
    public static void main(String[] args) {
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal tasa = BigDecimal.valueOf(0.05);
        System.out.printf("%s%20s%n", "Año", "Monto en Deposito");
        
        //calcula el monto en deposito para cada uno de dies años
        for (int anio = 1; anio <= 10; ++anio) {
            //calcula el nuevo monto para el año especificado
            BigDecimal monto = principal.multiply(tasa.add(BigDecimal.ONE).pow(anio));
            
            System.out.printf("%4d%20s%n", anio, 
                    NumberFormat.getCurrencyInstance(Locale.US).format(monto));
        }
    }
}
