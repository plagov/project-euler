package net.projecteuler.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem014Test {

  @Test
  void solve() {
    assertEquals(837_799, new Problem014().solve());
  }
}
