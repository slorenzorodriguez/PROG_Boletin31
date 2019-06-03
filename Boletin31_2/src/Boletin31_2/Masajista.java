
package Boletin31_2;

/**
 *
 * @author slorenzorodriguez
 */
public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int anhosExperiencia;

    public Masajista(String titulacion, int anhosExperiencia, int id, String nombre, String apellidos, int edad) {
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
    public void concentrarse() {
        System.out.println("Se concrentra el Masajista");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el Masajista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el Masajista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega partido el Masajista");
    }

    public void darMasaje() {

        System.out.println("Da masaje el Masajista");

    }

    @Override
    public String toString() {
        return "Masajista: "+super.toString() + ", Titulacion = " + titulacion + ", Años Experiencia=" + anhosExperiencia;
    }

}
