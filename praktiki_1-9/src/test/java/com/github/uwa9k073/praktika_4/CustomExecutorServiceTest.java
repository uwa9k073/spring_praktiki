package com.github.uwa9k073.praktika_4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class CustomExecutorServiceTest {

  public static int THREAD_COUNT = 2;

  ExecutorService executorService = new CustomExecutorService(THREAD_COUNT);

  @Test
  void execute() {
    List<Integer> list = new ArrayList<>();
    IntStream.range(1, 10).forEach((value)->executorService.execute(()->{
      list.add(value);
    }));
    assertIterableEquals(Arrays.asList(1,2,3,4,5,6,7,8,9), list);
  }
}