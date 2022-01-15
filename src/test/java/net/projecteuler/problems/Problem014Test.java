package net.projecteuler.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Problem014Test {

  private final Problem014 problem14 = new Problem014();

  @Test
  @Disabled
  void solve() {
    var numberOfTerms = problem14.solve();
    Assertions.assertEquals(42, numberOfTerms);
  }

  @Test
  void testCollatzSequence() {
    Assertions.assertEquals(
      List.of(12, 6, 3, 10, 5, 16, 8, 4, 2, 1),
      problem14.collatzSequenceForNumber(12)
    );
    Assertions.assertEquals(
      List.of(25, 76, 38, 19, 58, 29, 88, 44, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1),
      problem14.collatzSequenceForNumber(25)
    );
  }
}
