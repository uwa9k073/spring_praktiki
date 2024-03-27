package com.github.uwa9k073.praktika_10.components.impl;

import com.github.uwa9k073.praktika_10.components.Knight;
import org.springframework.stereotype.Component;


@Component("king_of_knights")
public class KingOfKnights implements Knight {

  public static final String message = "King of knights is fighting!";

  @Override
  public String fight() {
    return message;
  }
}

