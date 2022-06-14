public class Piloto extends Thread {
    private String nome;

    public Piloto(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        try {
            System.out.println("LARGADA");
            System.out.println("Primeira volta: " + nome);
            for(int cont = 0; cont < 10000; cont++) {}
            System.out.println(nome + " terminou a corrida"); 
        }

        catch(Exception e) {}
    }
}
