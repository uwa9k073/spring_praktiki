package com.github.uwa9k073.praktika_8.chain_of_responsibility;

public class ConcreteHandlerA extends Handler {

  @Override
  public String handleRequest(int request) {
    if (request >= 0 && request < 10) {
      return "ConcreteHandlerA handled request with value: " + request;
    } else if (next != null) {
      return next.handleRequest(request);
    }

    return null;
  }
}
