package net.projecteuler.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem014Test {

  private final Problem014 problem14 = new Problem014();

  @Test
  void solve() {
    var numberOfTerms = problem14.solve();
    Assertions.assertEquals(42, numberOfTerms);
  }
}
