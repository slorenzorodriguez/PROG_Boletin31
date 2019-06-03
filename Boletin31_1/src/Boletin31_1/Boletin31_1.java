
package Boletin31_1;

import java.util.ArrayList;

/**
 *
 * @author slorenzorodriguez
 */
public class Boletin31_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Usamos un ArrayList de tipo SeleccionFutbol para poder engadir todas as demás clases xa que extenden de esta
        ArrayList<SeleccionFutbol> lSelec = new ArrayList<>();

        Futbolista fut = new Futbolista(94, "delantero", 1, "Ricardo", "Galloso", 22);
        Entrenador ent = new Entrenador(124, 2, "Gemma", "Vazquez", 35);
        Masajista mas = new Masajista("Master", 10, 3, "Esteban", "Fernandez", 45);
        
        lSelec.add(fut);
        lSelec.add(ent);
        lSelec.add(mas);

        for (SeleccionFutbol z : lSelec) {

            System.out.println(z);

        }
    }
    
}
