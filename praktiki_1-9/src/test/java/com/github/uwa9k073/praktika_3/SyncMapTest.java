package com.github.uwa9k073.praktika_3;

import static org.junit.jupiter.api.Assertions.*;

import com.github.uwa9k073.MultiThreadTestClassBase;
import java.util.Map;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SyncMapTest extends MultiThreadTestClassBase {

  Map<String, Integer> map;

  @BeforeEach
  void setMap(){
    map = new SyncMap<>();
  }
  @SneakyThrows
  @Test
  void put() {
    execute(()->map.put("key1", 1));
    execute(()->map.put("key2", 2));
    
    shutdown();


    assertEquals(1, map.get("key1"));
    assertEquals(2, map.get("key2"));
  }

  @SneakyThrows
  @Test
  void remove() {
    execute(()->map.put("key1", 1));
    execute(()->map.remove("key1"));

    shutdown();

    assertEquals(null, map.get("key1"));
  }
}