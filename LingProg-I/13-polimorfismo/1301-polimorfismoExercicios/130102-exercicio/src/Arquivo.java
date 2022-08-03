import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class Arquivo {
  public boolean criacaoArq(String nome, String email) {
    try {
      FileWriter escrever = new FileWriter(nome + ".txt");
      escrever.write(nome + ";" + email);
      escrever.close();

      return true; 
    }
      catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();

      return false;
    }
  }

  public boolean criacaoArq(String nome) {
    try {
      FileWriter escrever = new FileWriter(nome + ".txt");
      escrever.write(nome + ";");
      escrever.close();

      return true; 
    }
      catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();

      return false;
    }
  }
}