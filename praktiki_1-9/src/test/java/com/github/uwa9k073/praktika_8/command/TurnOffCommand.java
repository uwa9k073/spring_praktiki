package com.github.uwa9k073.praktika_8.command;

public class TurnOffCommand<E extends Turn> implements  Command{

  private final Turn impl;

  public TurnOffCommand(E impl){
    this.impl = impl;
  }

  @Override
  public String execute(){
    return impl.turnOff();
  }

}
