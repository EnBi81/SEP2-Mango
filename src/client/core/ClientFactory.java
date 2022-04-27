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
        System.err.println("--------------------------------------------");
        System.err.println("          SERVER IS NOT RUNNING");
        System.err.println("--------------------------------------------");

        System.exit(0);
      }
    }
    return client;
  }
}
