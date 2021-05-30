package net.projecteuler;

import java.util.Collections;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem003Test {

  @Test
  void highestPrimeFactorOfTheNumber() {
    var primeFactors = new Problem003().getPrimeFactorsOfTheNumber(600_851_475_143L);
    Assertions.assertEquals(Collections.max(primeFactors), 6857);
  }
}
