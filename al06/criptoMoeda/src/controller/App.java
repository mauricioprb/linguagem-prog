package controller;
import javax.swing.JOptionPane;

import model.Solicitar;
import model.Veiculos;
import model.Arquivo;
import view.Menu;

public class App{
    public static void main(String[] args){
        int op = 0;
        Menu menu = new Menu();
        Solicitar solicitar = new Solicitar();
        Veiculos veiculos = new Veiculos();
        Arquivo arquivo = new Arquivo();
        while(op != 3){
            op = menu.getOption();
            switch (op){
                case 1:{
                    veiculos = solicitar.solicitarDados();
                    arquivo.cadastrar(veiculos, "veiculos.txt");
                    break;
                }
                case 2:{
                    System.out.println("LISTA DE VEÍCULOS CADASTRADOS:");
                    System.out.println(arquivo.consultar("veiculos.txt"));
                    break;
                }
                case 3:{
                    System.exit(0);
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null, "Você digitou uma opção inválida");
                    break;
                }
            }
        }   
    } 
}