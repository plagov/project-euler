package net.projecteuler.problems;

public class Problem009 {

  private long x, y, z;
  private long sum;

  public long productOfPythagoreanTripletWhichSumIsEqualTo(int sumOfPythagoreanTriplet) {
    long v = 1;
    long u = 2;

    while (sum != sumOfPythagoreanTriplet) {
      x = (long) (Math.pow(u, 2) - Math.pow(v, 2));
      y = 2 * u * v;
      z = (long) (Math.pow(u, 2) + Math.pow(v, 2));
      sum = x + y + z;
      if (sum > sumOfPythagoreanTriplet) {
        v++;
        u = v + 1;
      }
      u++;
    }

    return x * y * z;
  }
}
