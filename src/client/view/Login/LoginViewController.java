package client.view.Login;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import shared.UserType;

public class LoginViewController implements ViewController
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
    errorLabel.textProperty().bind(viewModel.getError());
  }

  public void onLogIn(ActionEvent actionEvent)
  {
    if (username.getText().equals("") || password.getText().equals(""))
    {
      errorLabel.setText("Empty field");
    }
     viewModel.login(username.getText(), password.getText());
  }

  public void onRegister(ActionEvent actionEvent)
  {
    viewHandler.openRegisterView();
  }
}
