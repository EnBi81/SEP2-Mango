package client.model;

import shared.UserType;
import util.PropertyChangeSubject;

public interface UserModel extends PropertyChangeSubject
{
  String ERROR_RECEIVED = "ErrorReceived";
  String LOGGED_IN_RECEIVED = "LogInReceived";

  void login(String username, String password);
  void register(String firstName, String lastName, String username, String password, UserType userType);
}
