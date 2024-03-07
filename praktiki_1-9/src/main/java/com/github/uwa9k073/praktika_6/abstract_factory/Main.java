package com.github.uwa9k073.praktika_6.abstract_factory;

public class Main {

  public static void main(String[] args) {
    GUIFactory factory = new MacGUIFactory();
    factory.createButton().render();
    factory = new WindowsGUIFactory();
    factory.createButton().render();
  }

}
