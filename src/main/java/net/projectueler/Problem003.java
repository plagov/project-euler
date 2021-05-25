package net.projectueler;

import java.util.HashSet;
import java.util.Set;

public class Problem003 {

  public Set<Long> getPrimeFactorsOfTheNumber(long number) {
    var primeFactors = new HashSet<Long>();
    long k = 2;
    long remainder;

    while (true) {
      remainder = number / k;
      if (number % k == 0) {
        primeFactors.add(k);
        number = remainder;
        if (number == k) {
          break;
        }
        if (remainder == 1) {
          break;
        }
      } else {
        k++;
      }
    }

    return primeFactors;
  }

}
