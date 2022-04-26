package client.core;

import client.model.UserModel;

public class ModelFactory
{
  private ClientFactory clientFactory;
  private UserModel userModel;

  public ModelFactory(ClientFactory clientFactory)
  {
    this.clientFactory = clientFactory;
  }

  public UserModel getUserModel()
  {
    if(userModel == null)
    {
      // create userModel
    }
    return userModel;
  }


}
