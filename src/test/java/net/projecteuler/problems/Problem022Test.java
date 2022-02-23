package net.projecteuler.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem022Test {

  @Test
  void solve() {
    assertEquals(871_198_282, new Problem022().solve());
  }
}
