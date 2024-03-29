package Model;

import View.Cadastro;
import java.sql.*;
import java.util.ArrayList;

public class DAO {
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/Aula03agenda";
    private String user = "root";
    private String password = "laboratorio";
    
    Cadastro cadastro = new Cadastro();


//método de conexão
    private Connection conectar(){
        Connection con = null;
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            return con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    // READ - Recuperar infos de funcionários
    
    public ArrayList<Funcionario> listarFuncionarios() {
        // Criar lista de funcionários
        ArrayList<Funcionario> funcionarios = new ArrayList();
        // Declarar a query utilizada para retornar dados de funcionários
        String read = "select * from funcionario";
        
        try {
            // Abrir a conexão
            Connection con = conectar();
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
                Connection con = conectar();
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
}