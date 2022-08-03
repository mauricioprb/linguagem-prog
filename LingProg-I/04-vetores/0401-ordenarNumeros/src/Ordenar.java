/*
Criar uma classe executável em Java para:
    - solicitar ao usuário 5 números inteiros
    - ordená-los de modo crescente
    - exibi-los na tela como foram digitados e como ficaram ordenados

obs: utilize métodos para as ações necessárias
*/
import javax.swing.JOptionPane;

public class Ordenar {
    public static void main(String[] args) { 
        
        int numeros[] = solicitarNumeros();
        System.out.print("ORIGINAL: ");   
        
        for(int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");    
        }       
        System.out.println("");
        
        int numerosOrdenados[] = ordenarVetor(numeros);
        
        System.out.print("ORDENADOS: ");
        for(int i = 0; i < numerosOrdenados.length; i++) {
            System.out.print(numerosOrdenados[i] + " ");    
        }
    }
    
    public static int[] solicitarNumeros() {
        int vetor[] = new int[5];
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da posição " + i));          
        }
        return vetor;    
    }
    
    public static int[] ordenarVetor(int[] vetor) {
        int aux;

        for(int i = 0; i < vetor.length; i++){           
            for(int j = 0; j < vetor.length; j++) {            
                if(vetor[i] < vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }    
        }
        return vetor;
    }
}