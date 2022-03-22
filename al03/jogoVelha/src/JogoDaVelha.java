import java.util.*;

public class JogoDaVelha{

    public static char tabuleiro[][] = new char[3][3];
    static boolean fimDeJogo = false;

    public static void main(String[] args){
        iniciarTabuleiro();

        while (!fimDeJogo){
            jogadaComputador();
            gerarTabuleiro();
            checarVencedor();
            jogadaHumano();
            gerarTabuleiro();
            checarVencedor();
        }
    }

    public static void iniciarTabuleiro(){
        for (int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 3; coluna++){
                tabuleiro[linha][coluna] = '-';
            }
        }
    }

    public static void gerarTabuleiro(){
        System.out.println("\n\n\n\n\n\n");
        for (int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 3; coluna++){
                System.out.print(tabuleiro[linha][coluna] + " ");
            }
            System.out.println("");
        }
    }

    public static void jogadaComputador(){
        int linha = (int) (Math.random() * 3);
        int coluna = (int) (Math.random() * 3);
        if (tabuleiro[linha][coluna] == '-'){
            tabuleiro[linha][coluna] = 'X';
        } else {
            jogadaComputador();
        }
    }

    public static void jogadaHumano(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a linha que deseja: ");
        int linha = scanner.nextInt();

        System.out.println("Digite a coluna que deseja: ");
        int coluna = scanner.nextInt();
        
        if (tabuleiro[linha][coluna] == '-'){
            tabuleiro[linha][coluna] = 'O';
        } else {
            System.out.println("Jogada já realizada. Escolha outra posição!");
            jogadaHumano();
        }
    }

    public static void checarVencedor(){
        // TESTAR COMPUTADOR VENCEDOR
        // testar linhas
        if ((tabuleiro[0][0] == tabuleiro[0][1]) && (tabuleiro[0][1] == tabuleiro[0][2]) && (tabuleiro[0][2] == 'X')){
            System.out.println("Computador ganhou!");
            fimDeJogo = true;
        } else if ((tabuleiro[1][0] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[1][2]) && (tabuleiro[1][2] == 'X')){
            System.out.println("Computador ganhou!");
            fimDeJogo = true;
        } else if ((tabuleiro[2][0] == tabuleiro[2][1]) && (tabuleiro[2][1] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'X')){
            System.out.println("Computador ganhou!");
            fimDeJogo = true;
        } // testar colunas
        else if ((tabuleiro[0][0] == tabuleiro[1][0]) && (tabuleiro[1][0] == tabuleiro[2][0]) && (tabuleiro[2][0] == 'X')){
            System.out.println("Computador ganhou!");
            fimDeJogo = true;
        } else if ((tabuleiro[0][1] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][1]) && (tabuleiro[2][1] == 'X')){
            System.out.println("Computador ganhou!");
            fimDeJogo = true;
        } else if ((tabuleiro[0][2] == tabuleiro[1][2]) && (tabuleiro[1][2] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'X')){
            System.out.println("Computador ganhou!");
            fimDeJogo = true;
        } //testar diagonais
        else if ((tabuleiro[0][0] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'X')){
            System.out.println("Computador ganhou!");
            fimDeJogo = true;
        } else if ((tabuleiro[0][2] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][0]) && (tabuleiro[2][0] == 'X')){
            System.out.println("Computador ganhou!");
            fimDeJogo = true;
        }

        if ((tabuleiro[0][0] == tabuleiro[0][1]) && (tabuleiro[0][1] == tabuleiro[0][2]) && (tabuleiro[0][2] == 'O')){
            System.out.println("Humano ganhou!");
            fimDeJogo = true;
        } else if ((tabuleiro[1][0] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[1][2]) && (tabuleiro[1][2] == 'O')){
            System.out.println("Humano ganhou!");
            fimDeJogo = true;
        } else if ((tabuleiro[2][0] == tabuleiro[2][1]) && (tabuleiro[2][1] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'O')){
            System.out.println("Humano ganhou!");
            fimDeJogo = true;
        } // testar colunas
        else if ((tabuleiro[0][0] == tabuleiro[1][0]) && (tabuleiro[1][0] == tabuleiro[2][0]) && (tabuleiro[2][0] == 'O')){
            System.out.println("Humano ganhou!");
            fimDeJogo = true;
        } else if ((tabuleiro[0][1] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][1]) && (tabuleiro[2][1] == 'O')){
            System.out.println("Humano ganhou!");
            fimDeJogo = true;
        } else if ((tabuleiro[0][2] == tabuleiro[1][2]) && (tabuleiro[1][2] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'O')){
            System.out.println("Humano ganhou!");
            fimDeJogo = true;
        } //testar diagonais
        else if ((tabuleiro[0][0] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'O')){
            System.out.println("Humano ganhou!");
            fimDeJogo = true;
        } else if ((tabuleiro[0][2] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][0]) && (tabuleiro[2][0] == 'O')){
            System.out.println("Humano ganhou!");
            fimDeJogo = true;
        }
    }
}