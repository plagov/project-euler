package net.projecteuler.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem014 {

  public int solve() {
    var integers = collatzSequenceForNumber(13);
    return integers.size();
  }

  private List<Integer> collatzSequenceForNumber(int number) {
    var intermediateNumber = number;
    List<Integer> sequence = new ArrayList<>();
    sequence.add(intermediateNumber);
    while (intermediateNumber != 1) {
      if (intermediateNumber % 2 == 0) {
        intermediateNumber = intermediateNumber / 2;
        sequence.add(intermediateNumber);
      } else {
        intermediateNumber = 3 * intermediateNumber + 1;
        sequence.add(intermediateNumber);
      }
    }
    return sequence;
  }
}
