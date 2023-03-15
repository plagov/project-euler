package net.projecteuler.problems.problems026to050;

import java.util.HashSet;

public class Problem028 {

  public int solve() {
    var count = 1001;
    var numbers = numbersInLeftToRightDiagonal(count);
    numbers.addAll(numbersInRightToLeftDiagonal(count));
    return numbers.stream().mapToInt(Integer::intValue).sum();
  }

  private HashSet<Integer> numbersInRightToLeftDiagonal(int count) {
    var current = 1;
    var increment = 2;
    var storage = new HashSet<Integer>();
    storage.add(current);
    for (int i = 0; i < count - 1; i++) {
      current += increment;
      increment += 2;
      storage.add(current);
    }
    return storage;
  }

  private HashSet<Integer> numbersInLeftToRightDiagonal(int count) {
    var current = 1;
    var increment = 4;
    var storage = new HashSet<Integer>();
    storage.add(current);
    for (int i = 0; i < (count / 2); i++) {
      for (int k = 0; k < 2; k++) {
        current += increment;
        storage.add(current);
      }
      increment += 4;
    }
    return storage;
  }
}
