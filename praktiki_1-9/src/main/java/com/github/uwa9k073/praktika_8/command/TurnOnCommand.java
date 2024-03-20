package com.github.uwa9k073.praktika_8.command;


public class TurnOnCommand<E extends Turn> implements Command{

  private final Turn impl;

  TurnOnCommand(E impl){
    this.impl = impl;
  }

  @Override
  public String execute(){
    return impl.turnOn();
  }
}