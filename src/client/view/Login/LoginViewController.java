package client.view.Login;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginViewController
{
  public TextField username;
  public TextField password;
  public Label errorLabel;

  private ViewHandler viewHandler;
  private LoginViewModel viewModel;

  @Override public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    this.viewModel = viewModelFactory.getLoginViewModel();

    username.textProperty().bindBidirectional(viewModel.getUsername());
    password.textProperty().bindBidirectional(viewModel.getPassword());
    errorLabel.textProperty().bind(viewModel.getErrorMessage());
  }

  public void onLogIn(ActionEvent actionEvent)
  {
  }

  public void onRegister(ActionEvent actionEvent)
  {
  }
}
