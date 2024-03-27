package com.github.uwa9k073.praktika_7.bridge;

public class Circle extends Shape {

  public Circle(DrawingAPI api) { super(api); }

  @Override
  public String draw() {
    return impl.drawCircle();
  }
}
