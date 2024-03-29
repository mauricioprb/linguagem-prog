package Controller;

import Model.FuncionarioDAO;
import Model.Funcionario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FuncionarioDAO dao = new FuncionarioDAO();
        ArrayList<Funcionario> listaDeFuncionarios = dao.listarFuncionarios();
        
        for (int i = 0; i < listaDeFuncionarios.size(); i++) {
            System.out.println("ID: " + listaDeFuncionarios.get(i).getId());
            System.out.println("Nome: " + listaDeFuncionarios.get(i).getNome());
            System.out.println("Email: " + listaDeFuncionarios.get(i).getEmail());
            System.out.println("Cargo: " + listaDeFuncionarios.get(i).getCargo());
        }
    }
}