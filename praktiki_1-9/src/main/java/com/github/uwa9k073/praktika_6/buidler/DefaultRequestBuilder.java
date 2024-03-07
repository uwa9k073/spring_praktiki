package com.github.uwa9k073.praktika_6.buidler;

import java.util.Optional;
import java.util.concurrent.TimeUnit;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DefaultRequestBuilder implements RequestBuilder {


  private String url;
  private Optional<String> data = Optional.empty();
  private Method method;
  private Integer retries = 3;
  private Timeout timeout = new Timeout(1, TimeUnit.SECONDS);

  @Override
  public Request build() {
    return new Request(url, data, method, retries, timeout);
  }

  @Override
  public RequestBuilder get(String url) {
    this.url = url;
    this.method = Method.GET;
    return this;
  }

  @Override
  public RequestBuilder post(String url) {
    this.url = url;
    this.method = Method.POST;
    return this;
  }

  @Override
  public RequestBuilder post(String url, String data) {
    this.url = url;
    this.method = Method.POST;
    this.data = data.describeConstable();
    return this;
  }

  @Override
  public RequestBuilder put(String url) {
    this.url = url;
    this.method = Method.PUT;
    return this;
  }

  @Override
  public RequestBuilder put(String url, String data) {
    this.url = url;
    this.method = Method.PUT;
    this.data = data.describeConstable();
    return this;
  }

  @Override
  public RequestBuilder delete(String url) {
    this.url = url;
    this.method = Method.DELETE;
    return this;
  }


  @Override
  public RequestBuilder timeout(Timeout timeout) {
    this.timeout = timeout;
    return this;
  }

  @Override
  public RequestBuilder timeout(Integer amount, TimeUnit measure) {
    this.timeout = new Timeout(amount, measure);
    return this;
  }

  @Override
  public RequestBuilder retry(Integer retry) {
    this.retries = retry;
    return this;
  }

  @Override
  public RequestBuilder data(String data) {
    if(method!=Method.DELETE && method!=Method.GET) {
      this.data = data.describeConstable();
    }
    return this;
  }
}
