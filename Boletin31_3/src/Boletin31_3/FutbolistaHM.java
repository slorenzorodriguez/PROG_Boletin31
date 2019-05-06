
package Boletin31_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafsniper
 */
public class FutbolistaHM extends SeleccionFutbolHM implements DeportistaInterface,IntegranteInterface {
    
  private int dorsal;
    private String demarcacion;

    public FutbolistaHM(int dorsal, String demarcacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    @Override
    public String toString() {
        return "Futbolista: "+super.toString()+", Dorsal = " + dorsal + ", Demarcación = " + demarcacion;
    }   

}
