import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mauricio
 */
public class App {
    public static void main(String[] args) {
        Date data = new Date();
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(dataFormatada.format(data));
          
        String dataHora[] = dataFormatada.format(data).split(" ");
        System.out.println("Data: " + dataHora[0]);
        System.out.println("Hora: " + dataHora[1]); 
    }
}