package net.projecteuler.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem007 {

  public int primeNumberByIndex(int index) {
    List<Integer> primes = new ArrayList<>();
    int number = 2;
    while (primes.size() < index) {
      if (isPrimeNumber(number)) {
        primes.add(number);
      }
      number++;
    }
    return primes.get(primes.size() - 1);
  }

  private boolean isPrimeNumber(int number) {
    int divisibleNumber = 2;
    while (number != divisibleNumber) {
      if (number % divisibleNumber == 0) {
        return false;
      }
      divisibleNumber++;
    }
    return true;
  }

}
