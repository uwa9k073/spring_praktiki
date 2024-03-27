package com.github.uwa9k073.praktika_5;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EagerSingleton {
  private static final  EagerSingleton INSTANCE = new EagerSingleton();

  public static synchronized EagerSingleton getInstance(){
    return INSTANCE;
  }

}
