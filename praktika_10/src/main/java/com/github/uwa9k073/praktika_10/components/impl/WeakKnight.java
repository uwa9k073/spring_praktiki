package com.github.uwa9k073.praktika_10.components.impl;

import com.github.uwa9k073.praktika_10.components.Knight;
import org.springframework.stereotype.Component;


@Component("weak_knight")
public class WeakKnight implements Knight {

  public static final String message = "Weak knight is fighting!";

  @Override
  public String fight() {
    return message;
  }
}

