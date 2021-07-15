
package Capitulo16;

import Capitulo8.Tiempo2;
import java.util.Comparator;

public class ComparardorTiempo implements Comparator<Tiempo2>{


    @Override
    public int compare(Tiempo2 tiempo1, Tiempo2 tiempo2) {
        int doferenciaHora = tiempo1.getHora() - tiempo2.getHora();
        
        if (doferenciaHora != 0) {
            return doferenciaHora;
        }
        
        int diferenciaMinuto = tiempo1.getMinuto() - tiempo2.getMinuto();
        if (diferenciaMinuto != 0) {
            return diferenciaMinuto;
        }
        
        int diferenciaSegundo = tiempo1.getSegundo() - tiempo2.getSegundo();
        return diferenciaSegundo;
    }
}
