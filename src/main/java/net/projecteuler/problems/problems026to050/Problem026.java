package net.projecteuler.problems.problems026to050;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem026 {

  private static final int UPPER_BOUND = 1000;

  public int solve() {
    Map<Integer, Integer> map = new HashMap<>();
    for (int d = 2; d < UPPER_BOUND; d++) {
      List<Integer> list = new ArrayList<>();
      var remainder = 1;
      while (true) {
        remainder %= d;
        if (list.contains(remainder) || remainder == 0) {
          break;
        }
        list.add(remainder);
        remainder *= 10;
      }
      map.put(d, list.size());
    }
    return map.entrySet().stream().max(Map.Entry.comparingByValue())
      .orElseThrow()
      .getKey();
  }
}
