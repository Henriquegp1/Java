
package holerite;
import java.util.Scanner;

public class calCulos {
    Scanner entrada = new Scanner(System.in);
    String nome;
    double sal_atual, tx_inss;
    
    public void entrarNome(){
        System.out.println("Digite o nome do Funcionário: ");
        nome=entrada.nextLine();
    }
    
    public void entrarSalarioAtual(){
        System.out.println("Digite o Salário Atual: ");
        sal_atual=entrada.nextDouble();
    }
    
    public void entrarTx_inss(){
        System.out.println("Digite a Taxa de INSS: ");
        tx_inss=entrada.nextDouble();
    }
    
    
    public void exibirHolerite(){
        System.out.println("HOLERITE DO FUNCIONARIO: "+nome);
        System.out.println("Salário Atual:"+sal_atual);
        System.out.println("Taxa de desconto do INSS: "+tx_inss+ "%");
    }
    
}
