/*
Fazer uma thread para corrida de fórmula 1. Onde vários pilotos
dão a largada ao mesmo tempo.
*/

public class ThreadsCorrida {
    public static void main(String[] args) {
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }

    private static Runnable t1 = new Runnable() {
        @Override
        public void run() {
            String nome = "fulano";
            try {  
                System.out.println("LARGADA");
                System.out.println("Primeira volta: " + nome);
                for(int cont = 0; cont < 10000; cont++) {}
                System.out.println(nome + " terminou a corrida"); 
            }
            
            catch(Exception e) {
                
            }
        }
    };
    
    private static Runnable t2 = new Runnable() {
        @Override
        public void run() {
            String nome = "ciclano";
            try {
                System.out.println("LARGADA");
                System.out.println("Primeira volta: " + nome);
                for(int cont = 0; cont < 10000; cont++) {}
                System.out.println(nome + " terminou a corrida"); 
            }

            catch(Exception e) {}
        }
    };

    private static Runnable t3 = new Runnable() {
        @Override
        public void run() {
            String nome = "beltrano";
            try {
                System.out.println("LARGADA");
                System.out.println("Primeira volta: " + nome);
                for(int cont = 0; cont < 10000; cont++) {}
                System.out.println(nome + " terminou a corrida"); 
            }

            catch(Exception e) {}
        }
    };
}