
package minhacalculadora;
import java.util.Scanner;

public class oPeracoes {
    Scanner entrada =new Scanner(System.in);
    int opc;
    double n1,n2;
    
    public void entrarNumeros(){
        System.out.println("Digite o primeiro número:");
        n1=entrada.nextDouble();
        System.out.println("Digite o segundo número:");
        n2=entrada.nextDouble();
               
    }
    
    public void Somar(double n1, double n2){
        System.out.println(n1 + " + "+ n2+ " = "+(n1+n2));
    }
    
    public void escolherOpc(){
        System.out.println("Digite a opção desejada:");
        opc=entrada.nextInt();
    }
    
    
    public void exibirOpcInval(){
        System.out.println("Opção Inválida");
    }
    
    public void exibirSair(){
        System.out.println("Saindo da Calculadora");
    }
    
    
    public void exibirMenu(){
        System.out.println("*******MENU DA CALCULADORA*****");
        System.out.println("*1 - ADIÇÃO                *");
        System.out.println("*2 - SUBTRAÇÃO             *");
        System.out.println("*3 - MULTIPLICAÇÃO        *");
        System.out.println("*4 - DIVISÃO              *");
        System.out.println("*5 - SAIR                 *");
          
        
    }
    
    
}
