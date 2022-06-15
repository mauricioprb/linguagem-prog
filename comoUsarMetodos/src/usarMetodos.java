/*
MÉTODOS: revisão geral
SEMPRE FAZER A SI PRÓPRIO AS SEGUINTES PERGUNTAS:
    1) Qual o nome do método?
    2) Ele possui retorno? 
        - Se sim, qual o tipo de retorno aguardado 
        por quem o chamou? 
        - Se não, então é void!
    3) Ele possui parâmetros?
        - Se sim, qual o tipo, quuantos e qual a ordem?
        - Se não, então ()
*/
public class usarMetodos {
    public static void main(String[] args) {
        System.out.println(exibirMensagem());
        exibirResultadoSoma(2,7);
        System.out.println("R$: "+ getGasValue());
        float largura = 2;
        float comprimento = 4;
        float profundidade = (float)1.32;
        String nome = "Paulo";
        calcularVolumePiscina(largura, comprimento, profundidade, nome);
        
        // tipo nome[] = new tipo[tamanho]
        int vetorI[] = new int[2]; // [5][10]
        char vetorC[] = new char[2]; // ['a']['b']
        String vetorS[] = new String[2]; // ["Pedro"]["Duda"]
        
        //vetorI[0] = 5;
        //vetorI[1] = 10;
        
        vetorI = getValues();
        
        System.out.println("VetorI: ");
        System.out.println("[0] " + vetorI[0]);
        System.out.println("[1] " + vetorI[1]);    
    }
    
    public static String exibirMensagem(){
        return "Bom dia. Bem-vindo aos métodos em Java.";
    }
    
    public static void exibirResultadoSoma(int v1, int v2){
        System.out.println("Resposta da soma: "+ (v1 + v2));
    }
    
    public static float getGasValue(){
        return (float)6.59;
    }
    
    public static void calcularVolumePiscina(float l, float c, float p, String nome){
        System.out.println("O volume da piscina com medidas " + l + "x" + c + "x" + p + "m do proprietário " + nome +" é " + (l*c*p) + "m3");
    }
    
    public static int[] getValues(){
        int vet[] = new int[2];
        vet[0] = 5;
        vet[1] = 10;
        return vet;
    }
}