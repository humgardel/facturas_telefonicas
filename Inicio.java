/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturastelefonicas;
import java.util.Scanner;
/**
 *
 * @author HUMGARDEL
 */
public class Inicio {
    private static Scanner sc= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int empresa=0;
        System.out.println("1.TeLeLe");
        System.out.println("2.Telefon");
        System.out.println("3.Salir");
        empresa = sc.nextInt();
        new GestionFacturas().gestion(empresa);
        new GestionTodasFacturas().gestion2();
    }
    
}
