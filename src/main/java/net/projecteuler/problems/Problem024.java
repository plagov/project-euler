package net.projecteuler.problems;

import java.util.Deque;
import java.util.LinkedList;

public class Problem024 {

  private static final int NTH_LEXICOGRAPHIC_PERMUTATION = 1_000_000;

  public String solve() {
    var str = "0123456789";
    var n = NTH_LEXICOGRAPHIC_PERMUTATION - 1;

    Deque<Integer> remainders = new LinkedList<>();

    for (int i = 1; i < str.length() + 1; i++) {
      remainders.addFirst(n % i);
      n = n / i;
    }

    StringBuilder result = new StringBuilder();

    for (Integer x : remainders) {
      var k = str.charAt(x);
      result.append(k);
      str = str.replace(String.valueOf(k), "");
    }

    return result.toString();
  }
}
