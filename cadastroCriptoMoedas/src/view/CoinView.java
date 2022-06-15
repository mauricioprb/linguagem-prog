package view;

import model.Coin;
import javax.swing.JOptionPane;

public class CoinView {
     public Coin getCoinData() {
        Coin coin = new Coin();
        coin.setName(JOptionPane.showInputDialog("Digite o nome da criptomoeda"));
        coin.setSymbol(JOptionPane.showInputDialog("Digite o símbolo - abreviatura"));
        coin.setDescription(JOptionPane.showInputDialog("Digite a descrição da criptomoeda"));
        coin.setYear(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de lançamento")));
        coin.setRanking(Integer.parseInt(JOptionPane.showInputDialog("Digite o ranking atual da criptomoeda")));
        coin.setMarketCap(Double.parseDouble(JOptionPane.showInputDialog("Digite o market cap atual da criptomoeda")));
        return coin;
    }
    
    public void showCoinData(Coin coin) {
        String text = "DADOS DA CRIPTOMOEDA" + "\n" +
                "Nome: " + coin.getName() + "\n" +
                "Símbolo: " + coin.getSymbol() + "\n" +
                "Descrição: " + coin.getDescription() + "\n" +
                "Ano de lançamento: " + coin.getYear() + "\n" +
                "Ranking: " + coin.getRanking() + "\n" +
                "Market cap: " + coin.getMarketCap();
        JOptionPane.showMessageDialog(null, text);
    }  
}