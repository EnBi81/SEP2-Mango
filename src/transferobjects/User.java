package transferobjects;

import shared.UserType;

public class User
{
  private String username;
  private UserType userType;
  private String firstName;
  private String lastName;

  public User(String username,UserType userType,String firstName,String lastName)
  {
    this.username = username;
    this.firstName = firstName;
    this.lastName = lastName;
    this.userType = userType;
  }

  public String getUsername()
  {
    return username;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public UserType getUserType()
  {
    return userType;
  }
}
