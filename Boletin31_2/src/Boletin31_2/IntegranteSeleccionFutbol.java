
package Boletin31_2;

/**
 *
 * @author slorenzorodriguez
 */
public interface IntegranteSeleccionFutbol {
    
    public void concentrarse();
    public void viajar();
    public void entrenar();
    public void jugarPartido();
    default public void ruedaPrensa(){
        System.out.println("Realizando rueda de prensa");
    }
    default public void videoPublicitario(){
        System.out.println("Realizando video publicitario");
}
    
}
