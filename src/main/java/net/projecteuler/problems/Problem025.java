package net.projecteuler.problems;

public class Problem025 {

  private static final double GOLDEN_RATIO = 1.618034;

  long f1 = 1;
  long f2 = 1;

  public long solve() {

    long fibNumber = 0;
    long index = 1;

    while (true) {
      fibNumber = nextFibonacciNumber();
      var stringResult = String.valueOf(fibNumber);
      if (stringResult.length() == 1000) {
        break;
      }
    }

    while (true) {
      double numberByIndex = (Math.pow(GOLDEN_RATIO, index) - Math.pow(1 - GOLDEN_RATIO, index)) / Math.sqrt(5);
      if (fibNumber == Math.round(numberByIndex)) {
        break;
      }
      index++;
    }

    return index;
  }

  private long nextFibonacciNumber() {
    var next = f1 + f2;
    f1 = f2;
    f2 = next;
    return next;
  }
}
