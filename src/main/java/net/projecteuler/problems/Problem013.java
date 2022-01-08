package net.projecteuler.problems;

import java.math.BigInteger;
import java.util.Arrays;

import static net.projecteuler.util.FileUtil.readInputFile;

public class Problem013 {

  public String solve() {
    var sum = Arrays.stream(readInputFile("problem013.txt").split("\n"))
      .map(BigInteger::new).reduce(BigInteger::add).orElseThrow();
    return sum.toString().substring(0, 10);
  }
}
