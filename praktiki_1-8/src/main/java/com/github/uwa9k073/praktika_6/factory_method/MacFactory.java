package com.github.uwa9k073.praktika_6.factory_method;

public class MacFactory extends  Factory{

  @Override
  public Button createButton() {
    return new MacButton();
  }
}
