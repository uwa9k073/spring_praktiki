package com.github.uwa9k073.praktika_6.factory_method;

public class MacButton implements Button {

  @Override
  public void render() {
    System.out.println("Render MAC button");
  }

  @Override
  public void onClick() {
    System.out.println("Handle onClick in MAC button");
  }
}
