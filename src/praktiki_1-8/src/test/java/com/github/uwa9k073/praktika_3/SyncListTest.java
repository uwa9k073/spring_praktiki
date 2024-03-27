package com.github.uwa9k073.praktika_3;

import static org.junit.jupiter.api.Assertions.*;

import com.github.uwa9k073.MultiThreadTestClassBase;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SyncListTest extends MultiThreadTestClassBase {
  @SneakyThrows
  @Test
  void add() {
    SyncList<Integer> list = new SyncList<>();

    IntStream.range(1, 3).forEach((value -> execute(()->list.add(value))));

    shutdown();

    assertIterableEquals(IntStream.range(1,3).boxed().toList(), list);
  }

  @SneakyThrows
  @Test
  void remove() {
    SyncList<Integer> list = new SyncList<>();

    execute(()->list.add(1));
    execute(()->list.remove(0));


    shutdown();

    assertEquals(0, list.size());
  }

  @SneakyThrows
  @Test
  void set() {
    SyncList<Integer> list = new SyncList<>();


    execute(()->list.add(1));
    execute(()->list.set(0,2));

    shutdown();

    assertIterableEquals(Arrays.asList(2), list);
  }
}