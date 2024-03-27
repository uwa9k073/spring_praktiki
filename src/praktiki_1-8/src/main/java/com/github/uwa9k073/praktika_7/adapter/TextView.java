package com.github.uwa9k073.praktika_7.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextView {
  private BoundingBox boundingBox;

  public BoundingBox getExtent() { return this.boundingBox; }
}
