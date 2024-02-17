package com.github.uwa9k073.praktika_1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Function;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmallestUniqueNumberTest {

  Function<int[], String> func = new SmallestUniqueNumber();

  @Test
  void apply() {
    int[] numbers = {1,3,1};

    Assertions.assertEquals("13", func.apply(numbers));
  }
}