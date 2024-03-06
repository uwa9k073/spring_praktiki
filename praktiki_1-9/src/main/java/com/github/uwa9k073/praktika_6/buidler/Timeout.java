package com.github.uwa9k073.praktika_6.buidler;

import java.util.concurrent.TimeUnit;
import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class Timeout {
  private Integer amount;
  private TimeUnit measure;

}
