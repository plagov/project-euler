package net.projecteuler.problems.problems001to025;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem007Test {

  private final Problem007 problem007 = new Problem007();

  @Test
  void primeNumberByIndexForSampleInput() {
    Assertions.assertEquals(13, problem007.primeNumberByIndex(6));
  }

  @Test
  void primeNumberByIndexForTaskInput() {
    Assertions.assertEquals(104_743, problem007.primeNumberByIndex(10_001));
  }
}
