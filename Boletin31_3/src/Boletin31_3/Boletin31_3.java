
package Boletin31_3;

import java.util.ArrayList;

/**
 *
 * @author Rafsniper
 */
public class Boletin31_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Usamos un ArrayList de tipo SeleccionFutbol para poder engadir todas as demás clases xa que extenden de esta
        ArrayList<SeleccionFutbolHM> lSelec = new ArrayList<>();

        FutbolistaHM fut = new FutbolistaHM(94, "delantero", 1, "Fran", "Collazo", 22);
        EntrenadorHM ent = new EntrenadorHM(124, 2, "Maria", "Vez", 35);
        MasajistaHM mas = new MasajistaHM("Master", 10, 3, "Oliver", "Perez", 45);
        
        lSelec.add(fut);
        lSelec.add(ent);
        lSelec.add(mas);

//        for (SeleccionFutbolHM z : lSelec) {
//
//            System.out.println(z);
//
//        }
        System.out.println("*************************");
        fut.entrenar();
        fut.concentrarse();
        ent.jugarPartido();
        ent.viajar();
        mas.concentrarse();
    }
    
}
