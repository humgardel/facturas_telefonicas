/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturastelefonicas;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author HUMGARDEL
 */
public class GestionFacturas {
    //private ArrayList<Factura> todasFacturas;
    static Scanner sc = new Scanner (System.in);
    public String op="s";
        
    public void gestion(int empresa){
        FacturaTeLeLe t1 = new FacturaTeLeLe();
        FacturaTelefon t2 = new FacturaTelefon();
        String op="s";
            int horadeiniciotmp=0;
            int duraciontmp=0;
            if(empresa==1){
                while(op=="s"){
                    System.out.println("Hora de inicio (de 0 a 24): ");
                    horadeiniciotmp=sc.nextInt();
                    System.out.println("Duracion (segundos): ");
                    duraciontmp=sc.nextInt();
                    //todasFacturas.add(t1);
                    t1.anadirLlamada(t1.costeLlamada(horadeiniciotmp, duraciontmp));
                    System.out.println("Mas llamadas (s/n): ");
                    op=sc.next(op);
                }
                t1.generarEnvio(1, t1.toString());
            }
            else{
                while(op=="s"){
                    System.out.println("Hora de inicio (de 0 a 24): ");
                    horadeiniciotmp=sc.nextInt();
                    System.out.println("Duracion (segundos): ");
                    duraciontmp=sc.nextInt();
                    //todasFacturas.add(t2);
                    t2.anadirLlamada(t2.costeLlamada(horadeiniciotmp, duraciontmp));
                    System.out.println("Mas llamadas (s/n): ");
                    op=sc.next(op);
                } 
                t2.generarEnvio(2, t2.toString());
            }
        
    }  
    
}
