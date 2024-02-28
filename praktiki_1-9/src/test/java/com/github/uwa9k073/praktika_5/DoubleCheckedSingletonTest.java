package com.github.uwa9k073.praktika_5;

import static org.junit.jupiter.api.Assertions.*;

import com.github.uwa9k073.MultiThreadTestClassBase;
import org.junit.jupiter.api.Test;

class SingletonTest {

  @Test
  void DCL_getInstance() {
    var instance1 = DoubleCheckedSingleton.getInstance();
    var instance2 = DoubleCheckedSingleton.getInstance();

    assertEquals(instance1, instance2);
  }


  @Test
  void Lazy_getInstance() {
    var instance1 = LazySingleton.getInstance();
    var instance2 = LazySingleton.getInstance();

    assertEquals(instance1, instance2);
  }

  @Test
  void Eager_getInstance() {
    var instance1 = EagerSingleton.getInstance();
    var instance2 = EagerSingleton.getInstance();

    assertEquals(instance1, instance2);
  }
}