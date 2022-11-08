package Controller;

import Model.FuncionarioDAO;
import Model.Funcionario;
import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        FuncionarioDAO dao = new FuncionarioDAO();
        
        ArrayList<Funcionario> lista = dao.listarFuncionarios();
        
        for(int i = 0; i < lista.size();i++){
            System.out.println("ID: " + lista.get(i).getId());
            System.out.println("Nome: " + lista.get(i).getNome());
            System.out.println("Email: " + lista.get(i).getEmail());
            System.out.println("Cargo: " + lista.get(i).getCargo());
        }
    }
}