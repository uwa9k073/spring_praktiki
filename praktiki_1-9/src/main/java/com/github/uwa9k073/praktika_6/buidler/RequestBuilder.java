package com.github.uwa9k073.praktika_6.buidler;

import java.util.concurrent.TimeUnit;

public interface RequestBuilder {

  public Request build();

  public RequestBuilder get(String url);

  public RequestBuilder post(String url);

  public RequestBuilder post(String url, String data);


  public RequestBuilder put(String url);

  public RequestBuilder put(String url, String data);


  public RequestBuilder delete(String url);


  public RequestBuilder timeout(Timeout timeout);

  public RequestBuilder timeout(Integer amount, TimeUnit measure);


  public RequestBuilder retry(Integer retry);

  public RequestBuilder data(String data);

}
