
package Boletin31_3;

/**
 *
 * @author slorenzorodriguez
 */
public class EntrenadorHM extends SeleccionFutbolHM implements DeportistaInterface,IntegranteInterface {

    private int idFederacion;

    public EntrenadorHM(int idFederacion, int id, String nombre, String apellidos, int edad) {
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
    public String toString() {
        return "Entrenador: " +super.toString()+ ", idFederacion = " + idFederacion;
    }

}
