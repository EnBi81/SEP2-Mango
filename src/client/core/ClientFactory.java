package client.core;

import client.networking.Client;
import client.networking.SocketClient;

import java.io.IOException;

public class ClientFactory
{
  private Client client;

  public Client getClient()
  {
    if(client == null)
    {
      try
      {
        client = new SocketClient();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
    return client;
  }
}
