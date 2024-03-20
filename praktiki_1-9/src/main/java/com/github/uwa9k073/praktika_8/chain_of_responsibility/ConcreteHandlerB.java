package com.github.uwa9k073.praktika_8.chain_of_responsibility;

public class ConcreteHandlerB extends Handler{
  @Override
  public String handleRequest(int request) {
    if (request >= 10 && request < 20) {
      return "ConcreteHandlerB handled request with value: " + request;
    } else if (next != null) {
      return next.handleRequest(request);
    }

    return null;
  }
}