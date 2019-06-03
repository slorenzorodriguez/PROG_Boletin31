
package Boletin31_3;

import java.util.ArrayList;

/**
 *
 * @author slorenzorodriguez
 */
public class Boletin31_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<SeleccionFutbolHM> lSelec = new ArrayList<>();

        FutbolistaHM fut = new FutbolistaHM(94, "delantero", 1, "Ricardo", "Galloso", 22);
        EntrenadorHM ent = new EntrenadorHM(124, 2, "Gemma", "Vazquez", 35);
        MasajistaHM mas = new MasajistaHM("Master", 10, 3, "Esteban", "Fernandez", 45);
        
        lSelec.add(fut);
        lSelec.add(ent);
        lSelec.add(mas);

        System.out.println("*************************");
        fut.entrenar();
        fut.concentrarse();
        ent.jugarPartido();
        ent.viajar();
        mas.concentrarse();
    }
    
}
