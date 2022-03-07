package net.projecteuler.problems.problems001to025;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem006Test {

  private final Problem006 problem6 = new Problem006();

  @Test
  void testDifferenceForSampleInput() {
    var sumOfTheSquares = problem6.sumOfSquaresOfNaturalNumbersUpTo(10);
    var squareOfTheSum = problem6.squareOfTheSumOfNaturalNumbersUpTo(10);
    Assertions.assertEquals(2640, squareOfTheSum - sumOfTheSquares);
  }

  @Test
  void testDifferenceForTaskInput() {
    var sumOfTheSquares = problem6.sumOfSquaresOfNaturalNumbersUpTo(100);
    var squareOfTheSum = problem6.squareOfTheSumOfNaturalNumbersUpTo(100);
    Assertions.assertEquals(25_164_150, squareOfTheSum - sumOfTheSquares);
  }
}
