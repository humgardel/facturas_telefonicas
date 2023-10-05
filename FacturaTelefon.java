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
public class FacturaTelefon extends Factura{
    public FacturaTelefon() {
        super("Telefon");
    }
    
    @Override
    public double costeLlamada(int horaInicio, int duracion){
        duracion-=60;
        if (duracion>0)
            return (0.40+(double)(duracion/5));
        else
            return 0.40;
    }
    
    
    
    
   
    
}
