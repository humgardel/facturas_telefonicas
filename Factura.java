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
public abstract class Factura implements CorreoPostal, CorreoElectronico{
    private String nombreCompania;
    private double totalAPagar;
    private int contadorLlamadas;
    private static Scanner sc= new Scanner(System.in);
    
    public Factura(String nombreCompania_){
        this.nombreCompania = nombreCompania_;
        this.totalAPagar=0;
        this.contadorLlamadas=0;
    }
    
    public String getCompania() {
        return nombreCompania;
    }

    
    public double getTotal() {
        return totalAPagar;
    }
    
    
    public int getNumLlamadas() {
        return contadorLlamadas;
    }
    
    public abstract double costeLlamada(int horaInicio, int duracion);
    
    public void anadirLlamada(double costo) {
        this.totalAPagar=this.totalAPagar+costo;
        this.contadorLlamadas=this.contadorLlamadas+1; 
    }
    public String toString(){
        return "Compania: "+this.getCompania()+" - Llamadas: "+this.getNumLlamadas()+" - Importe: "+this.getTotal();
    }
    
    
    public String GenerarImpresion(String factura, int comp) {
        
        return this.datosCompania(comp) +"\n"+ this.datosUsuarioCorreo() +"\n"+factura;
    }

    public void MandarImpresion(String datos) {
        System.out.println(datos);
    }

    public void EnviarEmail(String datos, int comp) {
        String e=this.datosUsuarioEmail();
        System.out.println(this.datosCompania(comp));    
        System.out.println("e-mail: "+e);
        System.out.println(datos);
    }
    
    public void generarEnvio(int comp, String f){
        System.out.println("1.Correo Postal - 2.Correo Electronico");
        int op = sc.nextInt();
        switch(op){
            case 1:
                this.MandarImpresion(this.GenerarImpresion(f, comp));
                break;
            case 2:
                this.EnviarEmail(f, comp);
                break;
            default:
                break;
        }
    }
    
    public String datosCompania(int comp){
        if (comp==1){
            return "Compania: TeLeLe - Cobro: Dependiendo de la hora";
        }
        else if(comp==2){
            return "Compania: TeleFon - Cobro: 0.05 Euros el minuto";
        }
        else{
            return "No valido";
        }
    }
    
    public String datosUsuarioCorreo(){
        System.out.println("Ingrese su nombre");
        String n = sc.next();
        System.out.println("Ingrese su direccion");
        String d = sc.next();
        return "Nombre: "+ n +" - Direccion: "+d;
    }
    
    public String datosUsuarioEmail(){
        System.out.println("Ingrese su direccion de email");
        String d = sc.next();
        return "e-mail: "+ d;
    }
    
}
