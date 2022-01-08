package net.projecteuler.util;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

  public static List<Integer> primeFactorizationOfTheNumber(long number) {
    List<Integer> primes = new ArrayList<>();
    var remainder = number;
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
