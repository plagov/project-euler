package net.projecteuler.problems.problems001to025;

import java.util.HashMap;

public class Problem015 {

  private final HashMap<String, Long> memory = new HashMap<>();

  public long solve() {
    return gridTraveler(21, 21);
  }

  private long gridTraveler(int x, int y) {
    var key = x + "," + y;

    if (memory.containsKey(key)) return memory.get(key);
    if (x == 1 && y == 1) return 1;
    if (x == 0 || y == 0) return 0;

    memory.put(key, gridTraveler(x - 1, y) + gridTraveler(x, y - 1));
    return memory.get(key);
  }

}
