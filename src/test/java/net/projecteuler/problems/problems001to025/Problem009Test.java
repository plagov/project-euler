package net.projecteuler.problems.problems001to025;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem009Test {

  private final Problem009 problem9 = new Problem009();

  @Test
  void productOfPythagoreanTripletWhichSumIsEqualTo() {
    long productOfPythagoreanTriplet = problem9.productOfPythagoreanTripletWhichSumIsEqualTo(1000);
    Assertions.assertEquals(31_875_000, productOfPythagoreanTriplet);
  }
}
