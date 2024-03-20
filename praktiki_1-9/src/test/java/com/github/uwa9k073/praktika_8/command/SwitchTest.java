package com.github.uwa9k073.praktika_8.command;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwitchTest {

  @Test
  void flip() {
    Turn light = new Light();
    Switch flip = new Switch(new TurnOnLightCommand<>(light), new TurnOffCommand<>(light));
    assertEquals(Light.turnOnMessage, flip.flipUp());
    assertEquals(Light.turnOffMessage, flip.flipDown());
  }
}