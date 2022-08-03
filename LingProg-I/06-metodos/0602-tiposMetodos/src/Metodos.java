// MÉTODOS/FUNÇÕES E SUAS POSSIBILIDADES

import javax.swing.JOptionPane;

public class Metodos {
    public static void main(String[] args) {
        exibirMensagem();
        exibirMsgDinamica("Boa noite");
        exibirMsgDinamica("Obrigado pela ajuda");
        //int diasDeVida = calcularNumDiasVividos(10);
        //System.out.println(diasDeVida);
        //JOptionPane.showMessageDialog(null, "Dias vividos: " + calcularNumDiasVividos(10));
        exibirMsgDinamica(calcularNumDiasVividos(10) + "");
        exibirMsgDinamica(String.valueOf(calcularNumDiasVividos(10)));   
    }
    
    // Método sem retorno (void) e sem passagem de parâmetro
    public static void exibirMensagem() {
        JOptionPane.showMessageDialog(null, "Bom dia!");       
    }
    
    // Método sem retorno (void) e com passagem de parâmetro
    public static void exibirMsgDinamica(String msg) {
        JOptionPane.showMessageDialog(null, "Essa é uma msg dinâmica: " + msg);
    }
    
    // Método com retorno (int) e com passagem de parâmetro
    public static int calcularNumDiasVividos(int idadeEmAnos) {
        return idadeEmAnos * 365;
    } 
}