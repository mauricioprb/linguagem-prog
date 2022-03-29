import java.net.SocketImpl;

public class App{
    public static void main(String[] args){
        System.out.println(exibirMensagem());

        exibirResultadoSoma(1,7);

        float precoGasolinaHoje = getGasValue();
        System.out.println("R$: " + precoGasolinaHoje);

        float largura = 2;
        float comprimento = 4;
        float profundidade = (float)1.32;
        calcularVolumePiscina(largura, comprimento, profundidade);

        // tipo nome[] = new tipo[tamanho]

    }
    public static String exibirMensagem(){
        return "Bom dia!";
    }

    public static void exibirResultadoSoma(int valor1, int valor2){
        System.out.println("Resposta da soma: " + (valor1 + valor2));
    }

    public static float getGasValue(){
        return (float)6.59;
    }

    public static void calcularVolumePiscina(float largura, float comprimento, float profundidade){
        System.out.println("O volume da piscina com medidas " + largura + "x" + comprimento + "x" + profundidade + "m é " + (largura * comprimento * profundidade));
    }
}