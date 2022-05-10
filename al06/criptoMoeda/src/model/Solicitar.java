package model;

import javax.swing.JOptionPane;

public class Solicitar{
    public Veiculos solicitarDados(){
        Veiculos veiculo = new Veiculos();
        veiculo.setMarca(JOptionPane.showInputDialog("Digite a marca do veículo"));
        veiculo.setModelo(JOptionPane.showInputDialog("Digite o modelo do veículo"));
        veiculo.setNumPlaca(JOptionPane.showInputDialog("Digite a placa do veículo"));
        return veiculo;
    }
}