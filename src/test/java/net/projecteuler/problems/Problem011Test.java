package net.projecteuler.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem011Test {

  @Test
  void solve() {
    assertEquals(70_600_674, new Problem011().solve());
  }
}
