package com.github.uwa9k073.praktika_8.command;

public class Switch {
  private final Command flipUpCommand;
  private final Command flipDownCommand;


  public Switch(Command flipUpCommand, Command flipDownCommand){
    this.flipUpCommand=flipUpCommand;
    this.flipDownCommand=flipDownCommand;
  }

  public String flipUp(){
    return flipUpCommand.execute();
  }

  public String flipDown(){
    return flipDownCommand.execute();
  }

}
