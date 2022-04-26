package client.view.register;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class RegisterViewController implements ViewController
{

  @FXML private TextField firstName;
  @FXML private RadioButton radioCustomer;
  @FXML private RadioButton radioEmployee;
  @FXML private TextField lastName;
  @FXML private TextField username;
  @FXML private PasswordField password;
  @FXML private PasswordField passwordRepeat;
  @FXML private Label errorMessage;
  private ViewModelFactory viewModelFactory;

  @Override public void init(ViewHandler viewHandler,
      ViewModelFactory viewModelFactory)
  {
    this.viewModelFactory = viewModelFactory;
  }

  @FXML private void onBack(ActionEvent actionEvent)
  {
  }

  @FXML private void onRegister(ActionEvent actionEvent)
  {
  }


}
