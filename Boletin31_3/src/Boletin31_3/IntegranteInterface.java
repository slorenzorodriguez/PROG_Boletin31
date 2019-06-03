
package Boletin31_3;

/**
 *
 * @author slorenzorodriguez
 */
public interface IntegranteInterface {
    default public void concentrarse(){
         System.out.println(this+ " se concentra");
     }
    default public void viajar(){
        System.out.println(this+ " viaja");
    }
}
