package com.github.uwa9k073.praktika_6.buidler;

import java.util.concurrent.TimeUnit;

public interface RequestBuilder {

  Request build();

  RequestBuilder get(String url);

  RequestBuilder post(String url);

  RequestBuilder post(String url, String data);


  RequestBuilder put(String url);

  RequestBuilder put(String url, String data);


  RequestBuilder delete(String url);


  RequestBuilder timeout(Timeout timeout);

  RequestBuilder timeout(Integer amount, TimeUnit measure);


  RequestBuilder retry(Integer retry);

  RequestBuilder data(String data);

}
