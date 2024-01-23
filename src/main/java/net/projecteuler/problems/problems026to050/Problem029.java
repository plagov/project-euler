package net.projecteuler.problems.problems026to050;

import java.math.BigInteger;
import java.util.HashSet;

public class Problem029 {

  public int solve() {
    var result = new HashSet<BigInteger>();

    var min = 2;
    var max = 100;

    for (var a = min; a <= max; a++) {
      var base = BigInteger.valueOf(a);
      for (var b = min; b <= max; b++) {
        var pow = base.pow(b);
        result.add(pow);
      }
    }

    return result.size();
  }

}
