package org.example;

import java.io.IOException;
import java.net.ServerSocket;

public abstract class RemoteBoard extends Board{
    private ServerSocket ss;

    public RemoteBoard() throws IOException {
        ss = new ServerSocket(2137);
    }

}
