package net.projecteuler.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem014 {

  public int solve() {
    return IntStream.rangeClosed(1, 100_000)
      .boxed()
      .collect(Collectors.toMap(Function.identity(), n -> collatzSequenceForNumber(n).size()))
      .entrySet()
      .stream()
      .max(Map.Entry.comparingByValue())
      .orElseThrow()
      .getKey();
  }

  public List<Integer> collatzSequenceForNumber(int number) {
    List<Integer> sequence = new ArrayList<>();
    sequence.add(number);
    while (number != 1) {
      if (number % 2 == 0) {
        number = number / 2;
        sequence.add(number);
      } else {
        number = 3 * number + 1;
        sequence.add(number);
      }
    }
    return sequence;
  }
}
