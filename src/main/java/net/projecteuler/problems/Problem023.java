package net.projecteuler.problems;

import net.projecteuler.util.NaturalNumber;

import java.util.HashSet;
import java.util.stream.IntStream;

public class Problem023 {

  public static final int UPPER_BOUND = 28_123;

  public long solve() {
    var abundantNumbers = IntStream.range(1, UPPER_BOUND)
      .boxed()
      .filter(NaturalNumber::isAbundant)
      .toList();

    var sums = new HashSet<Integer>();

    for (Integer i : abundantNumbers) {
      for (Integer k : abundantNumbers) {
        var sum = i + k;
        if (sum < UPPER_BOUND) {
          sums.add(sum);
        }
      }
    }

    var numbers = IntStream.range(1, UPPER_BOUND)
      .boxed()
      .filter(n -> !sums.contains(n))
      .toList();

    return numbers.stream().reduce(0, Math::addExact);
  }
}
