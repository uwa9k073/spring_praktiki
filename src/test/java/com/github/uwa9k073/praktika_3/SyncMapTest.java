package com.github.uwa9k073.praktika_3;

import static org.junit.jupiter.api.Assertions.*;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

class SyncMapTest {
  @SneakyThrows
  @Test
  void put() {
    SyncMap<String, Integer> map = new SyncMap<>();
    Thread thread1 = new Thread(()->map.put("key1", 1));
    Thread thread2 = new Thread(()->map.put("key2", 2));
<<<<<<< HEAD

=======
>>>>>>> 41838cf8eb6051e6cd877d67cafe9ad7274fea37
    thread1.start();
    thread2.start();
    thread1.join();
    thread2.join();
<<<<<<< HEAD

=======
>>>>>>> 41838cf8eb6051e6cd877d67cafe9ad7274fea37
    assertEquals(1, map.get("key1"));
    assertEquals(2, map.get("key2"));
  }

  @SneakyThrows
  @Test
  void remove() {
    SyncMap<String, Integer> map = new SyncMap<>();
    Thread thread1 = new Thread(()->map.put("key1", 1));
    Thread thread2 = new Thread(()->map.remove("key1"));
    thread1.start();
    thread2.start();
    thread1.join();
    thread2.join();
    assertEquals(null, map.get("key1"));
  }
}