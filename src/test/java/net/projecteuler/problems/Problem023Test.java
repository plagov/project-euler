package net.projecteuler.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem023Test {

  @Test
  void solve() {
    assertEquals(4_179_871, new Problem023().solve());
  }
}
