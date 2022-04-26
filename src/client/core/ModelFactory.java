package client.core;

import client.model.UserModel;
import client.model.UserModelImp;

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
      userModel = new UserModelImp(clientFactory.getClient());
    }
    return userModel;
  }


}
