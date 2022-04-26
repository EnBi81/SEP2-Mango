package client;

import client.core.ClientFactory;
import client.core.ModelFactory;
import client.core.ViewHandler;
import client.core.ViewModelFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class CanEat extends Application
{
  @Override public void start(Stage stage) throws Exception
  {
    ClientFactory clientFactory= new ClientFactory();
    ModelFactory modelFactory = new ModelFactory(clientFactory);
    ViewModelFactory viewModelFactory  = new ViewModelFactory(modelFactory);
    ViewHandler viewHandler = new ViewHandler(viewModelFactory, stage);

    viewHandler.start();

  }
}
