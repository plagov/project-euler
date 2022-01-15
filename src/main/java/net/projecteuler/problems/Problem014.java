package net.projecteuler.problems;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem014 {

  public int solve() {
    return IntStream.rangeClosed(1, 1_000_000)
      .boxed()
      .collect(Collectors.toMap(Function.identity(), this::sizeOfCollatzSequenceForNumber))
      .entrySet()
      .stream()
      .max(Map.Entry.comparingByValue())
      .orElseThrow()
      .getKey();
  }

  private int sizeOfCollatzSequenceForNumber(int number) {
    var size = 1;
    while (number != 1) {
      if (number % 2 == 0) {
        number = number / 2;
      } else {
        number = 3 * number + 1;
      }
      size++;
    }
    return size;
  }
}
