package com.github.uwa9k073;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;

public class MultiThreadTestClassBase {
  private ExecutorService executor;

  protected void execute(Runnable runnable){
    executor.submit(runnable);
  }

  @SneakyThrows
  protected void shutdown(){
    executor.shutdown();
    executor.awaitTermination(2, TimeUnit.SECONDS);
  }

  @BeforeEach
  void setup(){
    executor = Executors.newFixedThreadPool(2);
  }

}
