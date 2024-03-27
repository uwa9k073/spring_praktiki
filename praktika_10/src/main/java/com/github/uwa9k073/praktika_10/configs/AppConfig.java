package com.github.uwa9k073.praktika_10.configs;


import com.github.uwa9k073.praktika_10.components.Knight;
import com.github.uwa9k073.praktika_10.components.impl.KingOfKnights;
import com.github.uwa9k073.praktika_10.components.impl.StrongKnight;
import com.github.uwa9k073.praktika_10.components.impl.WeakKnight;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean(name = "strong_knight")
  public Knight strongKnight() {
    return new StrongKnight();
  }


  @Bean(name = "weak_knight")
  public Knight weakKnight() {
    return new WeakKnight();
  }

  @Bean(name = "king_of_knights")
  public Knight kingOfKnights() {
    return new KingOfKnights();
  }
}
