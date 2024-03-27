package com.github.uwa9k073.praktika_4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomExecutorServiceTest {

  public static int THREAD_COUNT = 1;
  public static int NUM_TESTS = 10;
  ExecutorService executorService;


  @BeforeEach
  void setUp(){
     this.executorService = new CustomExecutorService(THREAD_COUNT);
  }

  @SneakyThrows
  @Test
  void execute() {
    List<Integer> list = new ArrayList<>();
    IntStream.range(1, NUM_TESTS+1).forEach((value)->executorService.execute(()-> list.add(value)));

    executorService.shutdown();
    executorService.awaitTermination(2, TimeUnit.SECONDS);

    assertIterableEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,10), list);
  }
}