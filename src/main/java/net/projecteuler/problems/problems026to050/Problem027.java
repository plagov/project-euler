package net.projecteuler.problems.problems026to050;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static net.projecteuler.util.PrimeNumber.isPrime;

public class Problem027 {

  private final Map<Integer, Integer> storage = new HashMap<>();

  public long solve() {

    for (int a = -999; a < 1000; a++) {
      for (int b = -1000; b <= 1000; b++) {
        var count = 0;
        var n = 0;
        while (true) {
          var result = formula(n, a, b);
          if (isPrime(result)) {
            n++;
            count++;
          } else {
            storage.put(count, a * b);
            break;
          }
        }
      }
    }

    var keys = new ArrayList<>(storage.keySet());
    var biggestKey = Collections.max(keys);
    return storage.get(biggestKey);
  }

  private int formula(int n, int a, int b) {
    return n * n + a * n + b;
  }
}
