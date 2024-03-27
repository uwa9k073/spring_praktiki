package com.github.uwa9k073.praktika_10.components.impl;

import com.github.uwa9k073.praktika_10.components.Knight;
import org.springframework.stereotype.Component;

@Component("strong_knight")
public class StrongKnight implements Knight {

  public static final String message = "Strong knight is fighting!";

  @Override
  public String fight() {
    return message;
  }
}
