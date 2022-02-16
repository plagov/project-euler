package net.projecteuler.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem021Test {

  @Test
  void solve() {
    assertEquals(31_626, new Problem021().solve());
  }
}
