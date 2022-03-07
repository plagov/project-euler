package net.projecteuler.problems.problems001to025;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem015Test {

  @Test
  void solve() {
    assertEquals(137_846_528_820L, new Problem015().solve());
  }
}
