package com.github.uwa9k073.praktika_3;

import static org.junit.jupiter.api.Assertions.*;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

class SyncListTest {

  @SneakyThrows
  @Test
  void add() {
    SyncList<Integer> list = new SyncList<>();
    Thread thread1 = new Thread(()->list.add(1));
    Thread thread2 = new Thread(()->list.add(2));

    thread1.start();
    thread2.start();
    thread1.join();
    thread2.join();

    assertEquals(2, list.size());
    assertEquals(1,list.get(0));
    assertEquals(2,list.get(1));
  }

  @SneakyThrows
  @Test
  void remove() {
    SyncList<Integer> list = new SyncList<>();
    Thread thread1 = new Thread(()->list.add(1));
    Thread thread2 = new Thread(()->list.remove(0));

    thread1.start();
    thread2.start();
    thread1.join();
    thread2.join();

    assertEquals(0, list.size());
  }

  @SneakyThrows
  @Test
  void set() {
    SyncList<Integer> list = new SyncList<>();
    Thread thread1 = new Thread(()->list.add(1));
    Thread thread2 = new Thread(()->list.set(0,2));

    thread1.start();
    thread2.start();
    thread1.join();
    thread2.join();

    assertEquals(1, list.size());
    assertEquals(2,list.get(0));
  }
}