package com.github.uwa9k073.praktika_6.buidler;

import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RequestBuilderTest {

  private RequestBuilder requestBuilder;

  @BeforeEach
  void setup(){
    this.requestBuilder = Request.builder();
  }

@Test
void Test_Get_Method(){
    var request = requestBuilder.get("url").build();

    assertEquals("url", request.getUrl());
    assertEquals(Method.GET, request.getMethod());
  }


  @Test
  void Test_POST_Method(){
    var request = requestBuilder.post("url").data("some data").build();

    assertEquals("url", request.getUrl());
    assertEquals(Method.POST, request.getMethod());
    assertEquals("some data", request.getData().get());
  }


  @Test
  void Test_Settings_Setup(){
    var request = requestBuilder.get("url").timeout(2, TimeUnit.SECONDS).retry(5).build();

    assertEquals(new Timeout(2, TimeUnit.SECONDS), request.getTimeout());
    assertEquals(5, request.getRetries());
  }

}