package com.github.uwa9k073.praktika_6.prototype;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrototypeTest {
  @Test
  void Test_Copyable(){
    Message origin = new Message(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(),
        LocalDateTime.now(), LocalDateTime.now(), "Hello!");

    assertEquals(origin, origin.copy());
  }
}