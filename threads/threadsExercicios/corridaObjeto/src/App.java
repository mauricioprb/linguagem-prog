public class App {
    public static void main(String[] args) {
       Piloto p1 = new Piloto("Fulano");
       Piloto p2 = new Piloto("Ciclano");
       Piloto p3 = new Piloto("Beltrano");

       p1.start();
       p2.start();
       p3.start();
    }
}