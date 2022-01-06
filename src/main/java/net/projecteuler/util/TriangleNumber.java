package net.projecteuler.util;

public class TriangleNumber {

  public static int triangleNumberByCounter(int counter) {
    return (int) (0.5 * counter * (counter + 1));
  }
}
