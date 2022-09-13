import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arquivo {
    public void cadastrar(Dados dados, String nomeArquivo) {
        try {
            File file = new File(nomeArquivo);
            FileWriter fileWriter = new FileWriter(nomeArquivo, true);
            fileWriter.write(dados.getNome() + "," + dados.getSobrenome() + "," +
            dados.getEmail() + "," + dados.getTelefone() + "," + dados.getCpf() + "," + dados.getCidade() +
            "," + dados.getNacionalidade() + "," + dados.getIdade() + "," +
            dados.getSexo() + "," + dados.getVaga() + ";\n");
            fileWriter.close();
            JOptionPane.showMessageDialog(null, dados.getNome() + " foi cadastrado com sucesso!");
        } catch(IOException e) {
            System.out.println("Erro");
        }
    }
}