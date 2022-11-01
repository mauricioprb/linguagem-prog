package Controller;

import Model.DAO;
import Model.Funcionario;
import View.Cadastro;
import View.Listar;
import View.Menu;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Controller {
    private Menu menu;
    private Cadastro cadastro;
    private DAO dao = new DAO();
    private Listar listar;
    private ArrayList<Funcionario> listaFuncionario;

    public Controller(Menu menu, Cadastro cadastro, Listar listar) {
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
            model.addRow(new Object[]{listaFuncionario.get(i).getNome(),listaFuncionario.get(i).getEmail(),listaFuncionario.get(i).getCargo()});
        }
    }
}