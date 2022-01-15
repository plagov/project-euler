package net.projecteuler.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CollatzSequenceTest {

  @Test
  void testCollatzSequence() {
    Assertions.assertEquals(
      List.of(12L, 6L, 3L, 10L, 5L, 16L, 8L, 4L, 2L, 1L),
      CollatzSequence.collatzSequenceForNumber(12L)
    );
    Assertions.assertEquals(
      List.of(13L, 40L, 20L, 10L, 5L, 16L, 8L, 4L, 2L, 1L),
      CollatzSequence.collatzSequenceForNumber(13L)
    );
  }
}
