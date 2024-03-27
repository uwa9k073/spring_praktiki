package com.github.uwa9k073.praktika_4;

import java.util.Collection;
import java.util.concurrent.*;
import java.util.List;

public class CustomExecutorService implements ExecutorService {
  ExecutorService impl;

  public CustomExecutorService(int coroPoolCount) {
    this.impl = Executors.newFixedThreadPool(coroPoolCount);
  }

  @Override
  public void shutdown() {
    impl.shutdown();
  }

  @Override
  public List<Runnable> shutdownNow() {
    return impl.shutdownNow();
  }

  @Override
  public boolean isShutdown() {
    return impl.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return impl.isTerminated();
  }

  @Override
  public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
    return impl.awaitTermination(timeout, unit);
  }

  @Override
  public <T> Future<T> submit(Callable<T> task) {
    return impl.submit(task);
  }

  @Override
  public <T> Future<T> submit(Runnable task, T result) {
    return impl.submit(task,result);
  }

  @Override
  public Future<?> submit(Runnable task) {
    return impl.submit(task);
  }

  @Override
  public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks)
      throws InterruptedException {
    return impl.invokeAll(tasks);
  }

  @Override
  public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout,
      TimeUnit unit) throws InterruptedException {
    return impl.invokeAll(tasks, timeout, unit);
  }

  @Override
  public <T> T invokeAny(Collection<? extends Callable<T>> tasks)
      throws InterruptedException, ExecutionException {
    return impl.invokeAny(tasks);
  }

  @Override
  public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
      throws InterruptedException, ExecutionException, TimeoutException {
    return impl.invokeAny(tasks, timeout, unit);
  }

  @Override
  public void execute(Runnable command) {
    impl.execute(command);
  }
}