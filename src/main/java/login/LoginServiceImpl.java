package login;

import login.thrift.*;
import org.apache.thrift.TException;

public class LoginServiceImpl implements LoginService.Iface{

  @Override
  public String doAction(Request request) throws RequestException, TException {
    System.out.println("doAction:"+request);
    return "aaa";
  }

}
