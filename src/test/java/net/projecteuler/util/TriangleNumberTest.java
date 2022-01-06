package net.projecteuler.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleNumberTest {

  @Test
  void triangleNumberByCounter() {
    assertEquals(28, TriangleNumber.triangleNumberByCounter(7));
  }
}
