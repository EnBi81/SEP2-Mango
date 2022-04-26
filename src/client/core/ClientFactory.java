package client.core;

import client.networking.Client;

public class ClientFactory
{
  private Client client;

  public Client getClient()
  {
    if(client == null)
    {
    ///create client
    }
    return client;
  }
}
