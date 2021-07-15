
package Capitulo5;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaPoliza {
    public static void main(String[] args) {
        PolizaAuto poliza1 = new PolizaAuto(11111111, "Toyota Camry", "NJ");
            PolizaAuto poliza2 = new PolizaAuto(2222222, "Toyota Camry", "ME");
        
        polizaEnEstadosSinCulpa(poliza1);
        polizaEnEstadosSinCulpa(poliza2);
    }
    
    public static void polizaEnEstadosSinCulpa(PolizaAuto poliza){
        System.out.println("La poliza del auto:");
        System.out.printf("Cuenta #: %d; Auto: %s; Estado %s %s un estado sin culpa%n%n",
                poliza.getNumeroCuenta(), poliza.getMarcaYModelo(),
                poliza.getEstado(),(poliza.esEstadoSinCulpa() ? "Esta en" : "no esta en"));
    }
}
