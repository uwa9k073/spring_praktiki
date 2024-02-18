package com.github.uwa9k073.praktika_3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SyncMap<K, V> implements Map<K, V> {
  private final Map<K, V> impl = new HashMap<>();

  @Override
  public synchronized int size() {
    return impl.size();
  }

  @Override
  public synchronized boolean isEmpty() {
    return impl.isEmpty();
  }

  @Override
  public synchronized boolean containsKey(Object key) {
    return impl.containsKey(key);
  }

  @Override
  public synchronized boolean containsValue(Object value) {
    return impl.containsValue(value);
  }

  @Override
  public synchronized V get(Object key) {
    return impl.get(key);
  }

  @Override
  public synchronized V put(K key, V value) {
    return impl.put(key, value);
  }

  @Override
  public synchronized V remove(Object key) {
    return impl.remove(key);
  }

  @Override
  public synchronized void putAll(Map<? extends K, ? extends V> m) {
    impl.putAll(m);
  }

  @Override
  public synchronized void clear() {
    impl.clear();
  }

  @Override
  public synchronized Set<K> keySet() {
    return impl.keySet();
  }

  @Override
  public synchronized Collection<V> values() {
    return impl.values();
  }

  @Override
  public synchronized Set<Entry<K, V>> entrySet() {
    return impl.entrySet();
  }
}
