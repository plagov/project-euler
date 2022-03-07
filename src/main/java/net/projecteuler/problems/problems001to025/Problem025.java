package net.projecteuler.problems.problems001to025;

import java.math.BigInteger;

public class Problem025 {

  public static final int NUMBER_OF_DIGITS_OF_FIBONACCI_NUMBER = 1_000;

  private BigInteger f1 = BigInteger.valueOf(0);
  private BigInteger f2 = BigInteger.valueOf(1);

  public int solve() {

    var fibonacciNumber = BigInteger.ZERO;
    var indexOfNextUnknownNumber = 2;

    while (true) {
      fibonacciNumber = nextFibonacciNumber();
      if (fibonacciNumber.toString().length() == NUMBER_OF_DIGITS_OF_FIBONACCI_NUMBER) {
        break;
      }
      indexOfNextUnknownNumber++;
    }

    return indexOfNextUnknownNumber;
  }

  private BigInteger nextFibonacciNumber() {
    var next = f1.add(f2);
    f1 = f2;
    f2 = next;
    return next;
  }
}
