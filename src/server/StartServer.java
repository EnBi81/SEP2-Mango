package server;

import server.networking.SocketServer;

public class StartServer
{
  public static void main(String[] args) {
    try{
      SocketServer server = new SocketServer();
      server.startServer();
    } catch (Exception e){
      e.printStackTrace();
    }
  }
}
