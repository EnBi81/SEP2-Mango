package server.model;

import transferobjects.LoginRequest;
import transferobjects.User;

public interface UserModel
{
  User login(LoginRequest request);
  User register(LoginRequest request);
}
