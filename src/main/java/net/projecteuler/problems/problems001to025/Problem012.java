package net.projecteuler.problems.problems001to025;

import java.util.stream.Collectors;

import static net.projecteuler.util.PrimeFactorization.primeFactorizationOfTheNumber;
import static net.projecteuler.util.TriangleNumber.triangleNumberByCounter;

public class Problem012 {

  public Long solve() {
    var numberOfFactors = 0L;
    var triangleNumberCounter = 1;
    var triangleNumber = 0L;

    while (numberOfFactors <= 500) {
      triangleNumber = triangleNumberByCounter(triangleNumberCounter);
      numberOfFactors = numberOfDivisorsForNumber(triangleNumber);
      triangleNumberCounter++;
    }
    return triangleNumber;
  }

  private long numberOfDivisorsForNumber(long number) {
    var exponentsOfPrimeFactorization = primeFactorizationOfTheNumber(number)
      .stream()
      .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
      .values();
    return exponentsOfPrimeFactorization.stream().map(n -> n + 1).reduce(1L, Math::multiplyExact);
  }
}

