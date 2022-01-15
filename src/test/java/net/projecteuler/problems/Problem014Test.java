package net.projecteuler.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Problem014Test {

  private final Problem014 problem14 = new Problem014();

  @Test
  void solve() {
    Assertions.assertEquals(837_799, problem14.solve());
  }

  @Test
  void testCollatzSequence() {
    Assertions.assertEquals(
      List.of(12L, 6L, 3L, 10L, 5L, 16L, 8L, 4L, 2L, 1L),
      problem14.collatzSequenceForNumber(12L)
    );
    Assertions.assertEquals(
      List.of(13L, 40L, 20L, 10L, 5L, 16L, 8L, 4L, 2L, 1L),
      problem14.collatzSequenceForNumber(13L)
    );
  }
}
