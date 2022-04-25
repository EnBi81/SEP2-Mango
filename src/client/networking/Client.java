package client.networking;

import transferobjects.LoginRequest;
import util.PropertyChangeSubject;

public interface Client extends PropertyChangeSubject
{
  String ERROR_RECEIVED = "ErrorReceived";
  String LOGGED_IN_RECEIVED = "LogInReceived";

  void login(LoginRequest request);
  void register(LoginRequest request);
}
