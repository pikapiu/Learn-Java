package other;
/**
 *  @Author: zs
 *  @Date: 2019/6/6 19:19
 */
public enum StatusResponse {

  SUCCESS(200, "请求成功"),
  PARAMS_ERROR(400, "参数有误"),
  INVALID_AUTHCODE(401, "授权会话过期"),
  FORBIDDEN(403 , "用户无访问权限"),
  SERVER_ERROR(500, "服务器内部错误"),
  CODE_ERROR(4002, "验证码有误"),
  REGISTERED_ERROR(4003, "该用户已注册"),
  UNREGISTERED_ERROR(4004, "该手机号未注册"),
  PASSWORD_ERROR(4005, "密码有误"),
  CUSTOMER_FORBIDDEN(4006, "访问被禁止"),
  ALREADY_IN_ERROR(4007, "用户已在该组织中"),
  SMS_ERROR(4008, "短信接口调用失败"),
  REPEAT_APPLY_ERROR(4009, "请勿重复申请");


   StatusResponse(Integer value, String msg) {
    this.val = value;
    this.msg = msg;
  }

  public Integer val() {
    return val;
  }

  public String msg() {
    return msg;
  }

  private Integer val;
  private String  msg;

  @Override
  public String toString() {
    return "StatusResponse{" +
            "val=" + val +
            ", msg='" + msg + '\'' +
            '}';
  }
}
