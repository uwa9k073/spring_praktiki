package com.github.uwa9k073.praktika_10;

import com.github.uwa9k073.praktika_10.components.impl.KingOfKnights;
import com.github.uwa9k073.praktika_10.components.impl.StrongKnight;
import com.github.uwa9k073.praktika_10.components.impl.WeakKnight;
import com.github.uwa9k073.praktika_10.configs.AppConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = AppConfig.class)
@ActiveProfiles("test")
class ApplicationTests {

  @Autowired
  private StrongKnight strongKnight;

  @Autowired
  private WeakKnight weakKnight;

  @Autowired
  private KingOfKnights kingOfKnights;

  @Test
  void contextLoads() {
    Assertions.assertEquals(StrongKnight.message, strongKnight.fight());
    Assertions.assertEquals(WeakKnight.message, weakKnight.fight());
    Assertions.assertEquals(KingOfKnights.message, kingOfKnights.fight());
  }

}
