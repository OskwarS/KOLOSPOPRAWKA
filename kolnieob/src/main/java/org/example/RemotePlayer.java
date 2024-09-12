package org.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class RemotePlayer extends Player{
    private ServerSocket ss;
    private List<Client> clients = new ArrayList<>();
    private Map<String, Client> clientMap = new HashMap<>();
    public void listen() throws IOException {
        while (true){
            Socket socket = ss.accept();
            Client client = new Client(this, socket);
            new Thread(client).start();
            clients.add(client);
        }
    }
    public void broadcast(String message) {
        for(Client client : clients) {
            client.send(message);
        }
    }

}
