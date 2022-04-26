package client.core;

import client.view.Login.LoginViewModel;
import client.view.register.RegisterViewModel;

public class ViewModelFactory
{
  private ModelFactory modelFactory;
  private LoginViewModel loginViewModel;
  private RegisterViewModel registerViewModel;

  public ViewModelFactory(ModelFactory modelFactory)
  {
    this.modelFactory = modelFactory;
  }

  public LoginViewModel getLoginViewModel()
  {
    if(loginViewModel == null)
    {
      loginViewModel = new LoginViewModel();
    }
    return loginViewModel;
  }

  public RegisterViewModel getRegisterViewModel()
  {
    if(registerViewModel == null)
    {
      registerViewModel = new RegisterViewModel();
    }
    return registerViewModel;
  }
}
