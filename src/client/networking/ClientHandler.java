package client.networking;

import transferobjects.LoginRequest;
import transferobjects.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private final Socket socket;
    private final ObjectInputStream fromServer;
    private final ObjectOutputStream toServer;
    private final SocketClient client;

    //lets decide about try/catch or throwing exceptions
    public ClientHandler(SocketClient client) throws IOException {
        socket = new Socket("localhost", 1111);
        fromServer = new ObjectInputStream(socket.getInputStream());
        toServer = new ObjectOutputStream(socket.getOutputStream());
        this.client = client;
    }

    @Override
    public void run() {
        try {
            while(true){
                Object obj = fromServer.readObject();

                if(obj instanceof User){
                    client.userReceivedFromServer((User)obj);
                }
                else if(obj instanceof Error){
                    client.errorReceivedFromServer((Error)obj);
                }
            }
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void send(LoginRequest request) {
        try {
            toServer.writeObject(request);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
