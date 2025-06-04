/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holerite;

/**
 *
 * @author 051968
 */
public class Holerite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        calCulos bolo = new calCulos();
        
        bolo.entrarNome();
        bolo.entrarSalarioAtual();
        bolo.entrarTx_inss();
        bolo.exibirHolerite();
    }
    
}
