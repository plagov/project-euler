package net.projecteuler.problems.problems001to025;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem012Test {

  @Test
  void solve() {
    assertEquals(76_576_500, new Problem012().solve());
  }
}
