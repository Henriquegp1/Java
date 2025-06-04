
package minhacalculadora;


public class MinhaCalculadora {

    
    public static void main(String[] args) {
       
        oPeracoes obj = new oPeracoes();
        
        obj.exibirMenu();
        obj.escolherOpc();
        if(obj.opc>=1 && obj.opc<=4){
            obj.entrarNumeros();
            if(obj.opc==1){
                obj.Somar(obj.n1, obj.n2);
            }
        }
        if(obj.opc<1 || obj.opc>5){
            obj.exibirOpcInval();
        }
        if(obj.opc == 5){
            obj.exibirSair();
        }        
        
        
        
        
        
        
        
        
    }
    
}
