include "../common.thrift"

namespace java com.xiaoju.ddpay.userlimit

//用户限额信息
struct UserLimitInfo {
    1:required string tradeType,
    2:required string bankId,
    3:required string status,
    4:optional string singleLimitAmount,
    5:optional string dailyLimitAmount,
    6:optional string monthlyLimitAmount,
    7:optional string remark,
}

//用户限额查询请求信息
struct GetUserLimitRequest {
    1:optional string tradeType,
    2:optional string bankId,
    3:optional string status,
    4:optional BizOperation bizOperation,
}

//用户限额新增请求信息
struct SetUserLimitRequest {
    1:required UserLimitInfo tradeType,
    2:optional BizOperation bizOperation,
}

//用户限额修改请求信息
struct ResetUserLimitRequest {
    1:required UserLimitInfo tradeType,
    2:optional BizOperation bizOperation,
}

service userlimit {
    //查询用户限额
    ReturnMsg getUserLimit(1:required Caller caller, 2:required GetUserLimitRequest getUserLimitRequest);

    //新增用户限额
    ReturnMsg setUserLimit(1:required Caller caller, 2:required SetUserLimitRequest setUserLimitRequest);

    //修改用户限额
    ReturnMsg resetUserLimit(1:required Caller caller, 2:required ResetUserLimitRequest resetUserLimitRequest);

}