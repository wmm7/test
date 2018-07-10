namespace java login.thrift

struct Request {
    1: string username;
    2: string password;
    3: map<string, string> params;
}

exception RequestException {
    1: required i32 code;
    2: optional string reason;
}

// 服务名
service LoginService {
    string doAction(1: Request request) throws (1:RequestException qe); // 可能抛出异常。
}