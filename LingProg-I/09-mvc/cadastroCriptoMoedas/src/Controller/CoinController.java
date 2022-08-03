package Controller;

import Model.Coin;
import Persistence.Storage;
import View.CoinView;
import javax.swing.JOptionPane;

public class CoinController {
    public static void main(String[] args) {
        Coin coin = new Coin();
        CoinView coinView = new CoinView();
        Storage storage = new Storage();

        while(true) {
            String menu = "CRIPTOMOEDAS" + "\n"
                    + "[1] Cadastrar" + "\n"
                    + "[2] Consultar" + "\n"
                    + "Pressione qualquer outra tecla para sair";
            int option = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch(option) {
                case 1: 
                    coin = coinView.getCoinData();
                    if(storage.create(coin)) {
                        JOptionPane.showMessageDialog(null, "Criptomoeda " + coin.getName() + " cadastrada com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar a criptomoeda " + coin.getName() + "!");
                    }
                    break;
                
                case 2: 
                    String symbol = JOptionPane.showInputDialog("Digite o símbolo/abreviatura da criptomoeda que deseja consultar");
                    coin = storage.read(symbol);
                    coinView.showCoinData(coin);
                    break;
                
                default: 
                    JOptionPane.showMessageDialog(null, "Encerrando a aplicação!");
                    System.exit(0);
                    break;
            }
        }
    }
}