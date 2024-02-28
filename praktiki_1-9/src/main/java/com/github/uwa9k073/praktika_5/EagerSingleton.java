package com.github.uwa9k073.praktika_5;

public class EagerSingleton {
  private static final  EagerSingleton INSTANCE = new EagerSingleton();

  private EagerSingleton(){}

  public static synchronized EagerSingleton getInstance(){
    return INSTANCE;
  }

}
