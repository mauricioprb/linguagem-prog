package agendamentoApp;

import Controller.FuncionarioController;
import Model.FuncionarioDAO;
import Model.Funcionario;
import View.Cadastro;
import View.Listar;
import View.Menu;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        FuncionarioController c = new FuncionarioController(new Menu(), new Cadastro(), new Listar());
        c.initController();
        /*FuncionarioDAO dao = new FuncionarioDAO();
        ArrayList<Funcionario> listaDeFuncionarios = dao.listarFuncionarios();
        
        for (int i = 0; i < listaDeFuncionarios.size(); i++) {
            System.out.println("ID: " + listaDeFuncionarios.get(i).getId());
            System.out.println("Nome: " + listaDeFuncionarios.get(i).getNome());
            System.out.println("Email: " + listaDeFuncionarios.get(i).getEmail());
            System.out.println("Cargo: " + listaDeFuncionarios.get(i).getCargo());
        }
        
        dao.inserirFuncionario(new Funcionario(0, "Luiz Inacio", "dedo@gmail.com", "Futuro presidente"));
        dao.inserirFuncionario(new Funcionario(0, "Jair Bolsonaro", "bozo@gmail.com", "Ex-presidente")); */
    }
}