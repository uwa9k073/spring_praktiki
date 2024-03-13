package com.github.uwa9k073.praktika_7.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoundingBox {
  private double x;
  private double y;
  private double width;
  private double height;
}
