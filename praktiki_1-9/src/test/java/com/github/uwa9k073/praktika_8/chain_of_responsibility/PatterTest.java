package com.github.uwa9k073.praktika_8.chain_of_responsibility;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class PatterTest {

  private static final String responseHandlerAFormat = "ConcreteHandlerA handled request with value: %s";
  private static final String responseHandlerBFormat = "ConcreteHandlerB handled request with value: %s";

  @Test
  void TEST_CHAIN() {
    Handler h1 = new ConcreteHandlerA();
    Handler h2 = new ConcreteHandlerB();
    h1.setNext(h2);

    assertEquals(String.format(responseHandlerAFormat, 5), h1.handleRequest(5));
    assertEquals(String.format(responseHandlerBFormat, 15), h1.handleRequest(15));
    assertNull(h1.handleRequest(25));
  }
}
