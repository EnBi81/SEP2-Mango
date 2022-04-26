package client.core;

import client.view.Login.LoginViewController;
import client.view.register.RegisterViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler
{
  private ViewModelFactory viewModelFactory;
  private Stage stage;

  private  Parent root = null;

  public ViewHandler(ViewModelFactory viewModelFactory, Stage stage)
  {
    this.viewModelFactory = viewModelFactory;
    this.stage = stage;
  }

  public void start()
  {
    openLoginView();
  }

  public void openLoginView()
  {
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("../view/Login/LoginView.fxml"));

    try
    {
      root = loader.load();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

    LoginViewController controller = loader.getController();
    controller.init(this, viewModelFactory);
    stage.setTitle("Log in");

    Scene scene =new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  public void openRegisterView()
  {
    FXMLLoader loader = new FXMLLoader();

    loader.setLocation(getClass().getResource("../view/register/RegisterView.fxml"));

    try
    {
      root = loader.load();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

    RegisterViewController controller = loader.getController();
    controller.init(this, viewModelFactory);
    stage.setTitle("Register");

    Scene scene =new Scene(root);
    stage.setScene(scene);
    stage.show();
  }
}
