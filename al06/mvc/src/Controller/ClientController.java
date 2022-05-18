package Controller;

import Model.Client;
import View.ClientView;

public class ClientController {
    public static void main(String[] args) {
        ClientView clientView = new ClientView();
        Client client = new Client();
        client = clientView.getUserData();
        clientView.showUserData(client);
    }   
}