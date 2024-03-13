package com.github.uwa9k073.praktika_7.bridge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BrdigeTest {
  private DrawingAPI api;
  private Shape shape;

  @Test
  public void Test_MacOs_Bridge() {
    this.api = new MacosAPI();

    this.shape = new Circle(api);
    assertEquals("Draw MacOs circle", shape.draw());

    this.shape = new Rectangle(api);
    assertEquals("Draw MacOs rectangle", shape.draw());
  }

  @Test
  public void Test_Win_Bridge() {
    this.api = new WinAPI();

    this.shape = new Circle(api);
    assertEquals("Draw Windows circle", shape.draw());

    this.shape = new Rectangle(api);
    assertEquals("Draw Windows rectangle", shape.draw());
  }

  @Test
  public void Test_Linux_Bridge() {
    this.api = new WinAPI();

    this.shape = new Circle(api);
    assertEquals("Draw Linux circle", shape.draw());

    this.shape = new Rectangle(api);
    assertEquals("Draw Linux rectangle", shape.draw());
  }
}
