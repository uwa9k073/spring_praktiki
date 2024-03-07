package com.github.uwa9k073.praktika_6.factory_method;

public class WindowsButton implements Button {

  @Override
  public void render() {
    System.out.println("Render Windows button");
  }

  @Override
  public void onClick() {
    System.out.println("Click on Windows button");
  }

}
