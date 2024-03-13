package com.github.uwa9k073.praktika_7.bridge;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Shape {
  protected DrawingAPI impl;

  public abstract String draw();
}
