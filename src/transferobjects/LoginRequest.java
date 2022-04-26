package transferobjects;

import shared.UserType;

public class LoginRequest
{
  private String firstName;
  private String lastName;
  private String username;
  private String password;
  private UserType userType;
  private boolean isRegister;


  public LoginRequest()
  {
    throw new RuntimeException("Not implemented");
  }

  public LoginRequest(String username, String password)
  {
    this.username = username;
    this.password = password;
    isRegister = false;
    //todo what should I do with the other parameters?
  }

  public LoginRequest(String firstName, String lastName, String username, String password, UserType userType)
  {
    this.password=password;
    this.lastName = lastName;
    this.firstName = firstName;
    this.userType = userType;
    this.username = username;
    isRegister = true;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public String getUsername()
  {
    return username;
  }

  public String getPassword()
  {
    return password;
  }

  public UserType getUserType()
  {
    return userType;
  }

  public boolean getIsRegister()
  {
    return isRegister;
  }
}
