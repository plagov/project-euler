package net.projecteuler.problems;

import java.util.function.Supplier;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem005Test {

  private final Problem005 problem5 = new Problem005();

  @Test
  void smallestDivisibleNumberBySampleInput() {
    Supplier<IntStream> sampleRange = () -> IntStream.rangeClosed(1, 10);
    var smallestNumber = problem5.smallestDivisibleNumberByEachFromRange(sampleRange);
    Assertions.assertEquals(2520, smallestNumber);
  }

  @Test
  void smallestDivisibleNumberByTaskInput() {
    Supplier<IntStream> taskRange = () -> IntStream.rangeClosed(1, 20);
    var smallestNumber = problem5.smallestDivisibleNumberByEachFromRange(taskRange);
    Assertions.assertEquals(232_792_560, smallestNumber);
  }
}
