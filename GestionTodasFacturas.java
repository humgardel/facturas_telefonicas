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
public class GestionTodasFacturas {
    //private ArrayList<Factura> todasFacturas2;
    static Scanner sc = new Scanner (System.in);
    public String op="s";
    public String op2="s";
    public int type=0;
    public int cont=0;
        
    public void gestion2(){
        FacturaTeLeLe t1 = new FacturaTeLeLe();
        FacturaTelefon t2 = new FacturaTelefon();
        while(op2=="s" && cont<=100){
            while(op=="s"){
                System.out.println("1. TeLeLe, 2. Telefon");
                int tipo=sc.nextInt();
                int horadeiniciotmp=0;
                int duraciontmp=0;
                if(tipo==1){
                    System.out.println("Hora de inicio (de 0 a 24): ");
                    horadeiniciotmp=sc.nextInt();
                    System.out.println("Duracion (segundos): ");
                    duraciontmp=sc.nextInt();
                    //todasFacturas2.add(t1);
                    t1.anadirLlamada(t1.costeLlamada(horadeiniciotmp, duraciontmp));
                    cont++;
                    System.out.println("Mas llamadas (s/n): ");
                    op=sc.next(op);
                }
                else if(tipo==2){
                    System.out.println("Hora de inicio (de 0 a 24): ");
                        horadeiniciotmp=sc.nextInt();
                        System.out.println("Duracion (segundos): ");
                        duraciontmp=sc.nextInt();
                        //todasFacturas2.add(t2);
                        t2.anadirLlamada(t2.costeLlamada(horadeiniciotmp, duraciontmp));
                        cont++;
                        System.out.println("Mas llamadas (s/n): ");
                        op=sc.next(op);
            }    
        }
        }
        
        
        
    }
}
