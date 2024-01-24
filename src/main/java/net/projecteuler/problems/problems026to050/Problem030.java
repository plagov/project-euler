package net.projecteuler.problems.problems026to050;

import java.util.stream.IntStream;

public class Problem030 {

  private static final int POWER = 5;

  private static int sumOfFifthPowers(int number) {
    return Integer.toString(number).chars()
      .map(Character::getNumericValue)
      .map(i -> (int) Math.pow(i, 5))
      .sum();
  }

  private static int getBound(int power, int base) {
    var number = power * (int) Math.pow(base, 5);
    var maxLength = Integer.toString(number).length();

    while (Integer.toString(number).length() <= maxLength) {
      power++;
      number = power * (int) Math.pow(base, 5);
    }
    return number;
  }

  public int solve() {
    var start = getBound(POWER, 1);
    var end = getBound(POWER, 9);

    return IntStream.rangeClosed(start, end)
      .filter(number -> number == sumOfFifthPowers(number))
      .sum();
  }
}
