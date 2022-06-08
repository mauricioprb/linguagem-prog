package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arquivo{
    public void cadastrar(Veiculos veiculo, String nomeArquivo){
        try{
            File file = new File(nomeArquivo);
            FileWriter fileWriter = new FileWriter(nomeArquivo, true);
            fileWriter.write(veiculo.getMarca() + ";" + veiculo.getModelo() + ";" + veiculo.getNumPlaca() + "\n");
            fileWriter.close();
            JOptionPane.showMessageDialog(null, "O veículo "+ veiculo.getModelo() + " foi cadastrado com sucesso!");
        } catch(IOException e){
            System.out.println("Erro");
        }
    }

    public String consultar(String nomeArquivo){
        String conteudo="";
        try{
            File file = new File(nomeArquivo);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                conteudo += scanner.nextLine();
            }
            scanner.close();
        } catch(IOException e){
            System.out.println("Erro");
          }
        return conteudo;
    }   
}