
package Capitulo17;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class NoTieneNadaQueVer {
    public static void main(String[] args) throws Exception{
        int[] nDias = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
         int aux = 0;
         int n = 172;
         for (int i = 0; n > nDias[i]; i++) {
            n-= nDias[i];
            aux = i;
        }
         
        System.out.println(mes[aux+1] + " " + n);
    }
}
