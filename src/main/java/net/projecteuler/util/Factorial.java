package net.projecteuler.util;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Factorial {

  public static BigInteger factorialOfNumber(int number) {
    return IntStream.rangeClosed(1, number)
      .mapToObj(BigInteger::valueOf)
      .reduce(BigInteger.ONE, BigInteger::multiply);
  }
}
