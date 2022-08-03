import javax.swing.JOptionPane;

public class App {
    public static char tabuleiro[][] = new char[3][3];
    static boolean fimDeJogo = false;

    public static void main(String[] args) {
        inicializarTabuleiro();
        while(!fimDeJogo) {
            jogarComputador();
            exibirTabuleiro();
            verificarVencedor();
            jogarHumano();
            exibirTabuleiro();
            verificarVencedor();
        }
    }

    public static void inicializarTabuleiro() {
        for(int linha = 0; linha < 3; linha++) {
            for(int coluna = 0; coluna < 3; coluna++) {
                tabuleiro[linha][coluna] = '-';
            }
        }
    }

    public static void exibirTabuleiro() {
        System.out.println("\n\n\n\n\n\n");
        for(int linha = 0; linha < 3; linha++) {
            for(int coluna = 0; coluna < 3; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + " ");
            }
            System.out.println("");
        }
    }

    public static void jogarComputador() {
        int linha = (int) (Math.random() * 3);
        int coluna = (int) (Math.random() * 3);
        if(tabuleiro[linha][coluna] == '-') {
            tabuleiro[linha][coluna] = 'X';
        } else {
            jogarComputador();
        }
    }

    public static void jogarHumano() {
        int linha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma linha"));
        int coluna = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma coluna"));
        if(tabuleiro[linha][coluna] == '-') {
            tabuleiro[linha][coluna] = 'O';
        } else {
            JOptionPane.showMessageDialog(null, "Jogada já realizada. Escolha outra posição");
            jogarHumano();
        }
    }

    public static void verificarVencedor() {
        // TESTAR COMPUTADOR VENCEDOR
        // testar linhas
        if((tabuleiro[0][0] == tabuleiro[0][1]) && (tabuleiro[0][1] == tabuleiro[0][2]) && (tabuleiro[0][2] == 'X')) {
            JOptionPane.showMessageDialog(null, "Computador venceu");
            fimDeJogo = true;
        } else if((tabuleiro[1][0] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[1][2]) && (tabuleiro[1][2] == 'X')) {
            JOptionPane.showMessageDialog(null, "Computador venceu");
            fimDeJogo = true;
        } else if((tabuleiro[2][0] == tabuleiro[2][1]) && (tabuleiro[2][1] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'X')) {
            JOptionPane.showMessageDialog(null, "Computador venceu");
            fimDeJogo = true;
        } // testar colunas
        else if((tabuleiro[0][0] == tabuleiro[1][0]) && (tabuleiro[1][0] == tabuleiro[2][0]) && (tabuleiro[2][0] == 'X')) {
            JOptionPane.showMessageDialog(null, "Computador venceu");
            fimDeJogo = true;
        } else if((tabuleiro[0][1] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][1]) && (tabuleiro[2][1] == 'X')) {
            JOptionPane.showMessageDialog(null, "Computador venceu");
            fimDeJogo = true;
        } else if((tabuleiro[0][2] == tabuleiro[1][2]) && (tabuleiro[1][2] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'X')) {
            JOptionPane.showMessageDialog(null, "Computador venceu");
            fimDeJogo = true;
        } //testar diagonais
        else if((tabuleiro[0][0] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'X')) {
            JOptionPane.showMessageDialog(null, "Computador venceu");
            fimDeJogo = true;
        } else if((tabuleiro[0][2] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][0]) && (tabuleiro[2][0] == 'X')) {
            JOptionPane.showMessageDialog(null, "Computador venceu");
            fimDeJogo = true;
        }

        // Testar humano vencedor
        // Testar linhas
        if((tabuleiro[0][0] == tabuleiro[0][1]) && (tabuleiro[0][1] == tabuleiro[0][2]) && (tabuleiro[0][2] == 'O')) {
            JOptionPane.showMessageDialog(null, "Humano venceu");
            fimDeJogo = true;
        } else if((tabuleiro[1][0] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[1][2]) && (tabuleiro[1][2] == 'O')) {
            JOptionPane.showMessageDialog(null, "Humano venceu");
            fimDeJogo = true;
        } else if((tabuleiro[2][0] == tabuleiro[2][1]) && (tabuleiro[2][1] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'O')) {
            JOptionPane.showMessageDialog(null, "Humano venceu");
            fimDeJogo = true;
        } // Testar colunas
        else if((tabuleiro[0][0] == tabuleiro[1][0]) && (tabuleiro[1][0] == tabuleiro[2][0]) && (tabuleiro[2][0] == 'O')) {
            JOptionPane.showMessageDialog(null, "Humano venceu");
            fimDeJogo = true;
        } else if((tabuleiro[0][1] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][1]) && (tabuleiro[2][1] == 'O')) {
            JOptionPane.showMessageDialog(null, "Humano venceu");
            fimDeJogo = true;
        } else if((tabuleiro[0][2] == tabuleiro[1][2]) && (tabuleiro[1][2] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'O')) {
            JOptionPane.showMessageDialog(null, "Humano venceu");
            fimDeJogo = true;
        } //testar diagonais
        else if((tabuleiro[0][0] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'O')) {
            JOptionPane.showMessageDialog(null, "Humano venceu");
            fimDeJogo = true;
        } else if((tabuleiro[0][2] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][0]) && (tabuleiro[2][0] == 'O')) {
            JOptionPane.showMessageDialog(null, "Humano venceu");
            fimDeJogo = true;
        }
    }
}