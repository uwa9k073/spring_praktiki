package com.github.uwa9k073.praktika_6.buidler;

import java.util.Optional;
import java.util.concurrent.TimeUnit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {
  private String url;
  private Optional<String> data;
  private Method method;
  private Integer retries;
  private Timeout timeout;


  public void setTimeout(Integer amount, TimeUnit measure) {
    this.timeout = new Timeout(amount, measure);
  }

  static public RequestBuilder builder(){
    return new DefaultRequestBuilder();
  }
}
