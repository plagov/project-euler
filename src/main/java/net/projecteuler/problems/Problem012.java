package net.projecteuler.problems;

import java.util.HashSet;
import java.util.Set;

public class Problem012 {

  public Long solve() {
    var numberOfFactors = 0L;
    var triangleNumberCounter = 2;
    var triangleNumber = 0L;

    while (numberOfFactors <= 500) {
      triangleNumber = (long) (0.5 * triangleNumberCounter * (triangleNumberCounter + 1));
      numberOfFactors = factorsOfNumber(triangleNumber).size();
      triangleNumberCounter++;
    }

    return triangleNumber;
  }

  public Set<Long> factorsOfNumber(long number) {
    Set<Long> factors = new HashSet<>();
    for (var i = 1L; i <= number; i++) {
      if (number % i == 0) {
        factors.add(i);
      }
    }
    return factors;
  }

  public Set<Integer> primeFactorizationOfTheNumber(long triangleNumber) {
    Set<Integer> primes = new HashSet<>();
    var remainder = triangleNumber;
    var prime = 2;

    while (remainder != 1) {
      if (remainder % prime == 0) {
        primes.add(prime);
        remainder = remainder / prime;
      } else {
        prime++;
      }
    }
    return primes;
  }
}

