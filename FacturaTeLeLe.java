/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturastelefonicas;

/**
 *
 * @author HUMGARDEL
 */
public class FacturaTeLeLe extends Factura{
    public FacturaTeLeLe() {
        super("TeLeLe");
    }

    
    @Override
    public double costeLlamada(int horaInicio, int duracion) {
        return ((double)duracion*tarifaxHorario(horaInicio)+0.25);
        }
        
        
    public double tarifaxHorario(int horaInicio_){
        if (horaInicio_>=0 && horaInicio_<8)
            return 0.01;
        else if (horaInicio_>=8 && horaInicio_<14)
            return 0.05;
        else //if (horaInicio_>=14 && horaInicio_<23)
            return 0.02;
    }
    
    
   
}
