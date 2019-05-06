
package Boletin31_3;

/**
 *
 * @author Rafsniper
 */
public interface DeportistaInterface {
    default public void entrenar(){
            System.out.println(this+ " entrena");
        }
    default public void jugarPartido(){
        System.out.println(this+ " juega el partido");
    }
}
