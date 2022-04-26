package client.model;

import client.networking.Client;
import shared.UserType;
import transferobjects.LoginRequest;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class UserModelImp implements UserModel
{
  private PropertyChangeSupport support;
  private Client client;

  public UserModelImp(Client client)
  {
    this.client = client;
    support = new PropertyChangeSupport(this);

    client.addListener(LOGGED_IN_RECEIVED, this:: sendLogin);
  }

  private void sendLogin(PropertyChangeEvent event)
  {
    //todo should we send a user object or Strings...
    support.firePropertyChange(LOGGED_IN_RECEIVED, -1, event.getNewValue());
  }

  @Override public void login(String username, String password)
  {
    client.login(new LoginRequest(username,password));
  }

  @Override public void register(String firstName, String lastName,
      String username, String password, UserType userType)
  {
    client.register(new LoginRequest(firstName,lastName,username,password,userType));
  }

  @Override public void addListener(String event,
      PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(event,listener);
  }

  @Override public void addListener(PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(listener);
  }
}
