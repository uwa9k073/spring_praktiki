package com.github.uwa9k073.praktika_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Semaphore;
import lombok.SneakyThrows;

public class SyncList<E> implements List<E> {
  private final List<E> impl = new ArrayList<>();
  private final Semaphore semaphore = new Semaphore(1);


  @SneakyThrows
  @Override
  public int size() {
    semaphore.acquire();
    var result = impl.size();
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public boolean isEmpty() {
    semaphore.acquire();
    var result = impl.isEmpty();
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public boolean contains(Object o) {
    semaphore.acquire();
    var result = impl.contains(0);
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public Iterator<E> iterator() {
    semaphore.acquire();
    var result = impl.iterator();
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public Object[] toArray() {
    semaphore.acquire();
    var result = impl.toArray();
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public <T> T[] toArray(T[] a) {
    semaphore.acquire();
    var result = impl.toArray(a);
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public boolean add(E e) {
    semaphore.acquire();
    var result = impl.add(e);
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public boolean remove(Object o) {
    semaphore.acquire();
    var result = impl.remove(o);
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public boolean containsAll(Collection<?> c) {
    semaphore.acquire();
    var result = impl.containsAll(c);
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public boolean addAll(Collection<? extends E> c) {
    semaphore.acquire();
    var result = impl.addAll(c);
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public boolean addAll(int index, Collection<? extends E> c) {
    semaphore.acquire();
    var result = impl.addAll(index, c);
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public boolean removeAll(Collection<?> c) {
    semaphore.acquire();
    var result = impl.removeAll(c);
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public boolean retainAll(Collection<?> c) {
    semaphore.acquire();
    var result = impl.retainAll(c);
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public void clear() {
    semaphore.acquire();
    impl.clear();
    semaphore.release();

  }

  @SneakyThrows
  @Override
  public E get(int index) {
    semaphore.acquire();
    var result = impl.get(index);
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public E set(int index, E element) {
    semaphore.acquire();
    var result = impl.set(index, element);
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public void add(int index, E element) {
    semaphore.acquire();
    impl.add(index, element);
    semaphore.release();

  }

  @SneakyThrows
  @Override
  public E remove(int index) {
    semaphore.acquire();
    var result = impl.remove(index);
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public int indexOf(Object o) {
    semaphore.acquire();
    var result = impl.indexOf(o);
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public int lastIndexOf(Object o) {
    semaphore.acquire();
    var result = impl.lastIndexOf(o);
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public ListIterator<E> listIterator() {
    semaphore.acquire();
    var result = impl.listIterator();
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public ListIterator<E> listIterator(int index) {
    semaphore.acquire();
    var result = impl.listIterator(index);
    semaphore.release();
    return result;
  }

  @SneakyThrows
  @Override
  public List<E> subList(int fromIndex, int toIndex) {
    semaphore.acquire();
    var result = impl.subList(fromIndex, toIndex);
    semaphore.release();
    return result;
  }
}
