package Persistence;

import Model.Coin;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Storage {
    public boolean create(Coin coin) {
        try {
            FileWriter fileWriter = new FileWriter(coin.getSymbol() + ".txt");
            fileWriter.write(coin.getName() + ";" + coin.getSymbol() + ";" + coin.getDescription()+ ";" + coin.getYear() + ";" + coin.getRanking() + ";" + coin.getMarketCap());
            fileWriter.close();
            return true;
        } catch(IOException e) {
            return false;
        }
    }

    public Coin read(String symbol) {
        Coin coin = new Coin();
        String content="";
        try {
            File file = new File(symbol + ".txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                content += scanner.nextLine();
            }
            scanner.close();
            String line[] = new String[6];
            line = content.split(";");
            coin.setName(line[0]);
            coin.setSymbol(line[1]);
            coin.setDescription(line[2]);
            coin.setYear(Integer.parseInt(line[3]));
            coin.setRanking(Integer.parseInt(line[4]));
            coin.setMarketCap(Double.parseDouble(line[5]));
        } catch(IOException e) {
            System.out.println("Error");
        }
        return coin;
    }  
}