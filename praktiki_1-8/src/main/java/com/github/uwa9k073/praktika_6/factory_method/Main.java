package com.github.uwa9k073.praktika_6.factory_method;

public class Main {

  public static void main(String[] args) {
  Factory factory = new MacFactory();
  factory.renderButton();
  factory = new WindowsFactory();
  factory.renderButton();
  }
}
