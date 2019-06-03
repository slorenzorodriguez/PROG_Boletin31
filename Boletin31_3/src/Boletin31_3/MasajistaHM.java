
package Boletin31_3;

/**
 *
 * @author slorenzorodriguez
 */
public class MasajistaHM extends SeleccionFutbolHM implements IntegranteInterface {

    private String titulacion;
    private int anhosExperiencia;

    public MasajistaHM(String titulacion, int anhosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anhosExperiencia = anhosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAnhosExperiencia(int anhosExperiencia) {
        this.anhosExperiencia = anhosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnhosExperiencia() {
        return anhosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista: "+super.toString() + ", Titulacion = " + titulacion + ", Años Experiencia=" + anhosExperiencia;
    }

}
