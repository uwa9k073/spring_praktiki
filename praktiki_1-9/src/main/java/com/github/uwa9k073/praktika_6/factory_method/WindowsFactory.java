package com.github.uwa9k073.praktika_6.factory_method;

public class WindowsFactory  extends  Factory{

  @Override
  public Button createButton(){
    return new WindowsButton();
  }

}
