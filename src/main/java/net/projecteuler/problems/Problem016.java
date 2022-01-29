package net.projecteuler.problems;

import java.math.BigInteger;
import java.util.Arrays;

public class Problem016 {
  public long solve() {
    return Arrays.stream(new BigInteger("2").pow(1_000).toString().split(""))
      .mapToInt(Integer::valueOf)
      .sum();
  }
}
