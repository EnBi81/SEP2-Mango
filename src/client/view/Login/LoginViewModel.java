package client.view.Login;

import client.model.UserModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import shared.UserType;
import transferobjects.User;

public class LoginViewModel
{
  private UserModel userModel;
  private StringProperty username;
  private StringProperty password;
  private StringProperty error;

  public LoginViewModel(UserModel userModel)
  {
    this.userModel = userModel;
    username = new SimpleStringProperty();
    password = new SimpleStringProperty();
    error = new SimpleStringProperty();
  }

  public void login(String username, String password)
  {
    userModel.login(username,password);
  }

  public StringProperty getUsername()
  {
    return username;
  }

  public StringProperty getPassword()
  {
    return password;
  }

  public StringProperty getError()
  {
    return error;
  }
}
