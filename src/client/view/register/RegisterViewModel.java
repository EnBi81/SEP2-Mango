package client.view.register;

import client.model.UserModel;
import shared.UserType;
import transferobjects.User;

public class RegisterViewModel
{
  private UserModel userModel;

  public RegisterViewModel(UserModel userModel){
    this.userModel = userModel;
  }


  public User register(String firstName, String lastName, String username, String password, UserType userType){

    userModel.register(firstName, lastName, username, password, userType);

    return new User(); // rewrite this return
  }
}
