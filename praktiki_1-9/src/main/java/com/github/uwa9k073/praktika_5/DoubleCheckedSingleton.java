package com.github.uwa9k073.praktika_5;

public class DoubleCheckedSingleton {
  private static volatile DoubleCheckedSingleton instance;

  private DoubleCheckedSingleton(){}

  public static DoubleCheckedSingleton getInstance(){
    if (instance==null){
      synchronized (DoubleCheckedSingleton.class){
        if (instance==null){
          instance = new DoubleCheckedSingleton();
        }
      }
    }

    return instance;
  }

}
