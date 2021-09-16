package net.projecteuler.problems;

public class Problem009 {

  public int productOfPythagoreanTripletWhichSumIsEqualTo(int sumOfPythagoreanTriplet) {
    int v = 1;
    int u = 2;
    int x = 0, y = 0, z = 0;
    int sum = 0;

    while (sum != sumOfPythagoreanTriplet) {
      x = (int) (Math.pow(u, 2) - Math.pow(v, 2));
      y = 2 * u * v;
      z = (int) (Math.pow(u, 2) + Math.pow(v, 2));
      sum = x + y + z;
      if (sum > sumOfPythagoreanTriplet) {
        v++;
        u = v +1;
      }
      u++;
    }

    return x * y * z;
  }
}
