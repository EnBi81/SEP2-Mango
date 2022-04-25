package server.databaseConn;

import transferobjects.User;

public interface DatabaseConn
{
  User login(String username, String password);
  User register(String firstName, String lastName, String username, String password, int userType);
}
