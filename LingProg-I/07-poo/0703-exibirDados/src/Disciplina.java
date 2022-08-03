public class Disciplina {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Fulano";

        Laboratorio laboratorio = new Laboratorio();
        laboratorio.sala = "Sala 02";

        System.out.println("Nome: " + professor.nome + "\n" +  "Sala: " + laboratorio.sala);
    }
}