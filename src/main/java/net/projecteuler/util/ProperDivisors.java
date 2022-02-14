package net.projecteuler.util;

import java.util.List;
import java.util.stream.IntStream;

public class ProperDivisors {

  public static List<Integer> properDivisorsOfNumber(int number) {
    return IntStream.range(1, number)
      .filter(n -> number % n == 0)
      .boxed()
      .toList();
  }
}
