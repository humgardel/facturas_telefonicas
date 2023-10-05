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
public interface CorreoPostal {
    public String GenerarImpresion(String factura, int comp);
    void MandarImpresion(String datos);
}
