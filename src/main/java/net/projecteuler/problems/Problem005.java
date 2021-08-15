package net.projecteuler.problems;

import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problem005 {

  public int smallestDivisibleNumberByEachFromRange(Supplier<IntStream> range) {
    var rangeLastElement = range.get().reduce((first, second) -> second).orElseThrow();
    var infiniteStream = Stream.iterate(rangeLastElement, i -> i + 1);

    return infiniteStream
        .filter(number -> range.get().allMatch(divisible -> number % divisible == 0))
        .findFirst()
        .orElseThrow();
  }

}
