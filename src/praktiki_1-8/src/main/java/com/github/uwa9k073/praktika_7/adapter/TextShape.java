package com.github.uwa9k073.praktika_7.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextShape implements Shape {
  TextView impl;

  public TextShape(BoundingBox box) { this.impl = new TextView(box); }

  @Override
  public BoundingBox getBoundingBox() {
    return this.impl.getExtent();
  }
}
