package com.github.uwa9k073.praktika_6.factory_method;

public abstract class Factory {
  public void renderButton(){
    var button = createButton();
    button.render();
  }
  public abstract Button createButton();
}
