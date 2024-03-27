package com.github.uwa9k073.praktika_8.chain_of_responsibility;

import lombok.Setter;

@Setter
public abstract class Handler {

  protected Handler next;

  public abstract String handleRequest(int request);
}
