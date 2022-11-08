package Model;

import ConnectionFactory.ConnectionFactory;
import View.Cadastro;
import java.sql.*;
import java.util.ArrayList;

public class FuncionarioDAO {
    private Connection con;
    
    Cadastro cadastro = new Cadastro();

    // READ - Recuperar infos de funcionários
    
    public ArrayList<Funcionario> listarFuncionarios() {
        // Criar lista de funcionários
        ArrayList<Funcionario> funcionarios = new ArrayList();
        // Declarar a query utilizada para retornar dados de funcionários
        String read = "select * from funcionario";
        
        try {
            // Abrir a conexão
            con = new ConnectionFactory().getConnection();
            // Preparar a query para execução do banco de dados
            PreparedStatement pst = con.prepareStatement(read);
            // Executar a query
            ResultSet rs = pst.executeQuery();
            // Passando os valores contidos no RS para a lista de func
            while (rs.next()) {
                int id = Integer.parseInt(rs.getString(1));
                String nome = rs.getString(2);
                String email =rs.getString(3);
                String cargo = rs.getString(4);
                // Adicionar um novo funcionário na lista
                funcionarios.add(new Funcionario(id, nome, email, cargo));
            }
            
            con.close();
            return funcionarios;
        } catch (Exception e) {
            return null;
        }
    }
    
    public void inserirFuncionario(Funcionario funcionario) {
            //String text = "insert into funcionarios values(null, " + viewFrame.jTextField1.getText()...;
            String insert = "insert into funcionario(nome, email, cargo) values (?, ?, ?);";
            try {
                con = new ConnectionFactory().getConnection();
                PreparedStatement pst = con.prepareStatement(insert);
                pst.setString(1, funcionario.getNome());
                pst.setString(2, funcionario.getEmail());
                pst.setString(3, funcionario.getCargo());
                pst.execute();
                con.close();
                pst.close();
            } catch(Exception e) {
                System.out.println("Erro ao inserir!" + e);
            }
        }
    
    public void editarFuncionario(Funcionario funcionario) {
        String update = "UPDATE Funcionarios set DS_Nome = ?, DS_Email = ?, DS_Cargo = ?" +
                "where ID = ?;";
        con = new ConnectionFactory().getConnection();
        
        try {
            PreparedStatement pst = con.prepareStatement(update);
            pst.setString(1, funcionario.getNome());
            pst.setString(1, funcionario.getEmail());
            pst.setString(1, funcionario.getCargo());
            
            pst.executeUpdate();
            con.close();
            pst.close();
            
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public void deletarFuncionario(Funcionario funcionario) {
        String delete = "delete from funcionario where id = ?;";
        
        con = new ConnectionFactory().getConnection();
        
        try {
            PreparedStatement pst = con.prepareStatement(delete);
            pst.setString(1, funcionario.getId() + "");
            
            pst.execute();
            con.close();
            pst.close();
            
        } catch(SQLException e) {
            System.out.println("ERRO AO DELETAR:" + e);
        }
    }
}