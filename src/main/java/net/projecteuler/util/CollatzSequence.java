package net.projecteuler.util;

import java.util.ArrayList;
import java.util.List;

public class CollatzSequence {

  public static List<Long> collatzSequenceForNumber(long number) {
    List<Long> sequence = new ArrayList<>();
    sequence.add(number);
    while (number != 1) {
      if (number % 2 == 0) {
        sequence.add(number /= 2);
      } else {
        sequence.add(number = 3 * number + 1);
      }
    }
    return sequence;
  }
}
