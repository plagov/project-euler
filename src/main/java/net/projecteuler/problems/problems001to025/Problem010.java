package net.projecteuler.problems.problems001to025;

import java.util.HashSet;
import java.util.Set;

public class Problem010 {

  public long sumOfPrimeNumbersBelowNumber(int upperNumber) {
    Set<Integer> nonPrimes = new HashSet<>();
    Set<Integer> primes = new HashSet<>();

    for (int i = 2; i <= upperNumber; i++) {
      if (!nonPrimes.contains(i)) {
        primes.add(i);
        for (int j = i * 2; j <= upperNumber; j += i) {
          nonPrimes.add(j);
        }
      }
    }

    return primes.stream()
      .mapToLong(Integer::intValue)
      .sum();
  }
}
