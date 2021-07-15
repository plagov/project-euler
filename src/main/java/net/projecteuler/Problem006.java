package net.projecteuler;

public class Problem006 {

  public int sumOfSquaresOfNaturalNumbersUpTo(int upperNumber) {
    return ((upperNumber * (upperNumber + 1) * (2 * upperNumber + 1)) / 6);
  }

  public int squareOfTheSumOfNaturalNumbersUpTo(int upperNumber) {
    var sumOfAllNumbers = (upperNumber * (upperNumber + 1)) / 2;
    return sumOfAllNumbers * sumOfAllNumbers;
  }
}
