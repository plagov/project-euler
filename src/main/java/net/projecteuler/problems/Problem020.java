package net.projecteuler.problems;

import net.projecteuler.util.Factorial;

import java.util.Arrays;

public class Problem020 {
  public long solve() {
    var stringOfFactorial = Factorial.factorialOfNumber(100).toString();
    return Arrays.stream(stringOfFactorial.split(""))
      .mapToLong(Long::parseLong)
      .sum();
  }
}
