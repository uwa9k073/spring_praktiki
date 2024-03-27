package com.github.uwa9k073.praktika_10;

import com.github.uwa9k073.praktika_10.components.Knight;
import com.github.uwa9k073.praktika_10.configs.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {


  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(AppConfig.class);
    for(var el: args){
      var knight = context.getBean(el, Knight.class);
      System.out.println(knight.fight());
    }
  }

}
