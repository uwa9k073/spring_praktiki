package com.github.uwa9k073.praktika_7.adaptor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.uwa9k073.praktika_7.adapter.BoundingBox;
import com.github.uwa9k073.praktika_7.adapter.Shape;
import com.github.uwa9k073.praktika_7.adapter.TextShape;
import com.github.uwa9k073.praktika_7.adapter.TextView;
import org.junit.jupiter.api.Test;

public class AdaptorTest {

  @Test
  void Test_Adaptor() {
    BoundingBox box = new BoundingBox(10, 20, 30, 40);
    TextView textView = new TextView(box);
    Shape shape = new TextShape(box);

    assertEquals(box, textView.getExtent());
    assertEquals(box, shape.getBoundingBox());
    assertEquals(shape.getBoundingBox(), textView.getExtent());
  }
}
