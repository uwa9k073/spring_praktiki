package com.github.uwa9k073.praktika_5;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LazySingleton {
  private static LazySingleton instance;

  public static synchronized LazySingleton getInstance(){
    if (instance==null){
      instance = new LazySingleton();
    }
    return instance;
  }

}
