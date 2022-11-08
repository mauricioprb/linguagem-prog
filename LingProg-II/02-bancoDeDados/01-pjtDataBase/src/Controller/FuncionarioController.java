package Controller;

import Model.FuncionarioDAO;
import Model.Funcionario;
import View.Cadastro;
import View.Listar;
import View.Menu;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FuncionarioController {
    private Menu menu;
    private Cadastro cadastro;
    private FuncionarioDAO dao = new FuncionarioDAO();
    private Listar listar;
    private ArrayList<Funcionario> listaFuncionario;

    public FuncionarioController(Menu menu, Cadastro cadastro, Listar listar) {
        this.menu = menu;
        this.cadastro = cadastro;
        this.listar = listar;
    }
    
    public void initController() {
        listar.setVisible(false);
        cadastro.setVisible(false);
        
        menu.setVisible(true);
        menu.getBtListar().addActionListener(e -> exibirTelaListar());
        menu.getBtCadastro().addActionListener(e -> exibirTelaCadastro());
    }
    
    private void exibirTelaListar() {
        listar.setVisible(true);
        menu.setVisible(false);
        listar.getBtListar().addActionListener(e -> exibirLista());
        listar.getBtListarVoltar().addActionListener(e -> initController());
        listar.getBtDeletar().addActionListener(e -> deletarFuncionario());
    }
    
    private void exibirTelaCadastro() {
        cadastro.setVisible(true);
        menu.setVisible(false);
        cadastro.getBtCadastrar().addActionListener(e -> cadastrarFuncionario());
        
        cadastro.getBtCadastroVoltar().addActionListener(e -> initController());
    }
    
    private void cadastroFuncionario() {
        System.out.println(cadastro.getTfNome().getText());
    }
    
    private void cadastrarFuncionario() {
        dao.inserirFuncionario(new Funcionario(0, cadastro.getTfNome().getText(), cadastro.getTfEmail().getText(), cadastro.getTfCargo().getText()));
    }
    
    private void exibirLista() {
        listar.setVisible(true);
        
        DefaultTableModel DefaultTableModel = null;
        DefaultTableModel model = ((DefaultTableModel) listar.getTbTabelaLista().getModel());
        
        listaFuncionario = dao.listarFuncionarios();
        model.setRowCount(0);
        
        for(int i=0; i < listaFuncionario.size(); i++) {
            model.addRow(new Object[]{listaFuncionario.get(i).getId(), listaFuncionario.get(i).getNome(),listaFuncionario.get(i).getEmail(),listaFuncionario.get(i).getCargo()});
        }
    }
    
    private void deletarFuncionario() {
        JTable tabela = listar.getTbTabelaLista();
        int linha = tabela.getSelectedRow();
        System.out.println("Linha: " + linha);
        if (linha != -1) {
           int id = Integer.parseInt(tabela.getValueAt(linha, 0) + ""); 
           String nome = tabela.getValueAt(linha, 1) + "";
           String email = tabela.getValueAt(linha, 2) + "";
           String cargo = tabela.getValueAt(linha, 3) + "";
            
            Funcionario funcionario = new Funcionario(id, nome, email, cargo);
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Deletar funcionário: " + funcionario.toString());
            System.out.println("DIALOG: " + showConfirmDialog);
            if (showConfirmDialog == 0) {
                dao.deletarFuncionario(funcionario);
                exibirLista();
            }
            
            else {
                JOptionPane.showMessageDialog(null, "Selecione um usuário válido");
            } 
        }
    }
}