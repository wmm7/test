package login;

import com.google.common.collect.Maps;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import java.util.Map;

import login.thrift.LoginService;
import login.thrift.Request;

public class ClientMain {
  public static void main(String[] args) {
    TTransport transport = new TSocket("localhost", 8888);
    TProtocol protocol = new TBinaryProtocol(transport);

    // 创建client
    LoginService.Client client = new LoginService.Client(protocol);

    try {
      transport.open();  // 建立连接
      // 第一种请求类型
      Request request = new Request().setUsername("wangmeimei").setPassword("123456");
      Map<String, String> params = Maps.newHashMap();
      params.put("test1", null);
      params.put("test2", "test2_value");
      request.setParams(params);
      System.out.println(client.doAction(request));
      transport.close();  // 请求结束，断开连接
    } catch (Throwable e) {
      e.printStackTrace();
    }

  }
}  