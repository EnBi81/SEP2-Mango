package client.view.register;

import client.model.UserModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import shared.UserType;
import transferobjects.User;

public class RegisterViewModel
{
  private UserModel userModel;
  private StringProperty errorMessage;

  public RegisterViewModel(UserModel userModel){
    this.userModel = userModel;
    errorMessage = new SimpleStringProperty("");
  }


  public User register(String firstName, String lastName, String username, String password, UserType userType){

    userModel.register(firstName, lastName, username, password, userType);

    return new User(username,userType,firstName,lastName); // rewrite this return
  }

  public StringProperty getErrorMessage(){
    return errorMessage;
  }
}
