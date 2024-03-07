package com.github.uwa9k073.praktika_6.abstract_factory;

import com.github.uwa9k073.praktika_6.factory_method.Button;
import com.github.uwa9k073.praktika_6.factory_method.MacButton;

public class MacGUIFactory implements GUIFactory {

  @Override
  public Button createButton() {
    return new MacButton();
  }
}
