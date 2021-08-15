package net.projecteuler.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem008Test {

  private final Problem008 problem008 = new Problem008();

  @Test
  void highestProductOfAdjacentDigitsWithSampleInput() {
    var highestProduct = problem008.highestProductOfAdjacentDigits(4);
    Assertions.assertEquals(5832, highestProduct);
  }

  @Test
  void highestProductOfAdjacentDigitsWithTaskInput() {
    var highestProduct = problem008.highestProductOfAdjacentDigits(13);
    Assertions.assertEquals(23_514_624_000L, highestProduct);
  }
}
