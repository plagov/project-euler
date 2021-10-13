package net.projecteuler.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem010Test {

  private final Problem010 problem010 = new Problem010();

  @Test
  void sumOfPrimeNumbersBelowSampleNumber() {
    Assertions.assertEquals(
      17,
      problem010.sumOfPrimeNumbersBelowNumber(10)
    );

  }

  @Test
  void sumOfPrimeNumbersBelowTaskNumber() {
    Assertions.assertEquals(
      142_913_828_922L,
      problem010.sumOfPrimeNumbersBelowNumber(2_000_000)
    );
  }
}
