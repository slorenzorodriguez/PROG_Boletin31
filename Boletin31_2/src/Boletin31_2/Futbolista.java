
package Boletin31_2;

import javax.swing.JOptionPane;

/**
 *
 * @author slorenzorodriguez
 */
public class Futbolista extends SeleccionFutbol {
    
  private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion, int id, String nome, String apelido, int edade) {
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
    
    
    
    public void entrevista(){
        System.out.println("entrevista.");
        
    }
    public void entrenar(){
        System.out.println("O xogador entrena.");
    }

    @Override
    public void viajar() {
        JOptionPane.showMessageDialog(null,"Viaxan o futbolista.\n");
    }

        @Override
    public void concentrarse() {
        JOptionPane.showMessageDialog(null,"concéntrase o futbolista");
    }

    @Override
    public void jugarPartido() {
        JOptionPane.showMessageDialog(null,"xoga o futbolista");
    }
    
    @Override
    public String toString() {
        return "Futbolista: "+super.toString()+", Dorsal = " + dorsal + ", Demarcación = " + demarcacion;
    }   

}
