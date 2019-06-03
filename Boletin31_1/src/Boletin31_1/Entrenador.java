
package Boletin31_1;

/**
 *
 * @author slorenzorodriguez
 */
public class Entrenador extends SeleccionFutbol {

    private int idFederacion;

    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("Se concrentra el Entrenador");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el Entrenador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el Entrenador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega partido el Entrenador");
    }

    public void planificarEntrenamiento() {

        System.out.println("Planifica entrenamiento el Entrenador");

    }

    @Override
    public String toString() {
        return "Entrenador: " +super.toString()+ ", idFederacion = " + idFederacion;
    }

}
