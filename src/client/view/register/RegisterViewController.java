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
import shared.UserType;

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
  private ViewHandler viewHandler;
  private RegisterViewModel viewModel;

  @Override public void init(ViewHandler viewHandler,
      ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    viewModel = viewModelFactory.getRegisterViewModel();

    errorMessage.textProperty().bindBidirectional(viewModel.getErrorMessage()); // binds with the errorMessage in VM
  }

  @FXML private void onBack(ActionEvent actionEvent)
  {
    viewHandler.openLoginView();
  }

  @FXML private void onRegister(ActionEvent actionEvent)
  {
    UserType userType = null;

    if (firstName.getText().equals("") || lastName.getText().equals("")
        || username.getText().equals("") || password.getText()
        .equals("")) // checks for empty fields
    {
      errorMessage.setText("Empty field");
    }
    else if (!password.equals(passwordRepeat))  //checks if the password and passwordRepeat do match
    {
      errorMessage.setText("Passwords do not match");
    }
    else
    {

      if (radioCustomer.isSelected()) // checks for the selected radio button
      {
        userType = UserType.CUSTOMER;
      }
      else if (radioEmployee.isSelected())
      {
        userType = UserType.EMPLOYEE;
      }

      viewModel.register(firstName.getText(), lastName.getText(),
          username.getText(), password.getText(), userType);
    }

  }

}
