package net.projecteuler.util;

public class NaturalNumber {

  public static boolean isAbundant(int number) {
    var divisors = ProperDivisors.properDivisorsOfNumber(number);
    var sumOfDivisors = divisors.stream().reduce(0, Math::addExact);
    return sumOfDivisors > number;
  }
}
