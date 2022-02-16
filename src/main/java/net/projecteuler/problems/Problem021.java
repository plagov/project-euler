package net.projecteuler.problems;

import java.util.HashSet;

import static net.projecteuler.util.ProperDivisors.properDivisorsOfNumber;

public class Problem021 {

  public long solve() {
    var startPoint = 1;
    var upperLimit = 10_000;
    var amicableNumbers = new HashSet<Integer>();
    while (startPoint != upperLimit) {
      var first = sumOfProperDivisors(startPoint);
      var second = sumOfProperDivisors(first);
      if (startPoint == second && !first.equals(second)) {
        amicableNumbers.add(startPoint);
        amicableNumbers.add(first);
      }
      startPoint++;
    }
    return amicableNumbers.stream().reduce(0, Integer::sum);
  }

  private Integer sumOfProperDivisors(int number) {
    return properDivisorsOfNumber(number).stream().reduce(0, Integer::sum);
  }
}
