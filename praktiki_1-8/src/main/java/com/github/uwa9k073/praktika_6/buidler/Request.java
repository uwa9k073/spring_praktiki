package com.github.uwa9k073.praktika_6.buidler;

import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Request {
  private String url;
  private Optional<String> data;
  private Method method;
  private Integer retries;
  private Timeout timeout;


  static public RequestBuilder builder(){
    return new DefaultRequestBuilder();
  }
}
