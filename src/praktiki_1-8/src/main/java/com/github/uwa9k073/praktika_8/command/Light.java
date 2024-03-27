package com.github.uwa9k073.praktika_8.command;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Light implements Turn {

  public static final String turnOnMessage = "The light is on";
  public static final String turnOffMessage = "The light is off";

  @Override
  public String turnOn() {
    return turnOnMessage;
  }


  @Override
  public String turnOff() {
    return turnOffMessage;
  }
}
