package com.github.uwa9k073.praktika_7.bridge;

public class Rectangle extends Shape {
  public Rectangle(DrawingAPI api) { super(api); }

  @Override
  public String draw() {
    return impl.drawRectangle();
  }
}
