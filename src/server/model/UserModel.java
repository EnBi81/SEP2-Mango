package server.model;

import transferobjects.LoginRequest;

public interface UserModel
{
  void login(LoginRequest request);
  void register(LoginRequest request);
}
