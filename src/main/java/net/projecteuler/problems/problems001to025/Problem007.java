package net.projecteuler.problems.problems001to025;

import java.util.ArrayList;
import java.util.List;

public class Problem007 {

  public int primeNumberByIndex(int index) {
    List<Integer> primes = new ArrayList<>();

    for (int i = 2; primes.size() < index; i++) {
      if (isPrimeNumber(i)) {
        primes.add(i);
      }
    }
    return primes.get(primes.size() - 1);
  }

  private boolean isPrimeNumber(int number) {
    var max = Math.sqrt(number);
    for (int i = 2; i <= max; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return number > 1;
  }

}
