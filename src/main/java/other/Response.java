package other;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class Response<T> implements Serializable {

  private Integer status;
  private String  message;
  private List<T> data;

  public Response() {
    this.data = Collections.emptyList();
    buildSuccess();
  }

  public Response(T a) {
    this.data = Collections.singletonList(a);
    buildSuccess();
  }

  public Response(List<T> a) {
    this.data = a;
    buildSuccess();
  }

    public Response(StatusResponse statusResponse, T a) {
        this.status = statusResponse.val();
        this.message = statusResponse.msg();
        this.data = Collections.singletonList(a);
        buildSuccess();
    }
  public Response<T> setData(List<T> data) {
    this.data = data;
    return this;
  }

  public Integer getStatus() {
    return status;
  }

  private Response<T> setStatus(Integer status) {
    this.status = status;
    return this;
  }

  public String getMessage() {
    return message;
  }

  private Response<T> setMessage(String message) {
    this.message = message;
    return this;
  }

  public List<T> getData() {
    return data;
  }


  public Response<T> buildSuccess() {
    return this.setMessage("响应成功！").setStatus(StatusResponse.SUCCESS.val());
  }

  public Response<T> buildFail(StatusResponse statusResponse) {
    return this.setMessage(statusResponse.msg()).setStatus(statusResponse.val());
  }

  public Response<T> buildFail(StatusResponse statusResponse, String message) {
    return this.setMessage(message).setStatus(statusResponse.val());
  }

}
