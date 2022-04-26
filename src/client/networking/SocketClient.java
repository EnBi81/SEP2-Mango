package client.networking;

import transferobjects.LoginRequest;
import transferobjects.User;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;

public class SocketClient implements Client{
    private ClientHandler clientHandler;
    private PropertyChangeSupport support;

    public SocketClient() throws IOException {
        support = new PropertyChangeSupport(this);
        clientHandler = new ClientHandler(this);
        Thread t = new Thread(clientHandler);
        t.start();
    }

    @Override
    public void login(LoginRequest request) {
        clientHandler.send(request);
    }

    @Override
    public void register(LoginRequest request) {
        clientHandler.send(request);
    }

    @Override
    public void addListener(String event, PropertyChangeListener listener) {
        support.addPropertyChangeListener(event,listener);
    }

    @Override
    public void addListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }


    public void userReceivedFromServer(User obj) {
        support.firePropertyChange(LOGGED_IN_RECEIVED, null,obj);
    }

    public void errorReceivedFromServer(Error obj) {
        support.firePropertyChange(ERROR_RECEIVED, null, obj);
    }
}
