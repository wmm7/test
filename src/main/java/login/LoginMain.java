package login;

import java.net.ServerSocket;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;

import login.thrift.LoginService;
import login.thrift.LoginService.Processor;

public class LoginMain {
  public static void main(String[] args) throws Exception {

    LoginService.Processor processor = new Processor(new LoginServiceImpl());
    ServerSocket socket = new ServerSocket(8888);
    TServerSocket serverTransport = new TServerSocket(socket);
    TServer.Args tServerArgs = new TServer.Args(serverTransport);
    tServerArgs.processor(processor);
    TServer server = new TSimpleServer(tServerArgs);
    System.out.println("Starting the simple server...");
    server.serve();
  }
}  