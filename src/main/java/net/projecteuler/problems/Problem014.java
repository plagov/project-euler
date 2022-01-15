package net.projecteuler.problems;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static net.projecteuler.util.CollatzSequence.collatzSequenceForNumber;

public class Problem014 {

  public int solve() {
    return IntStream.rangeClosed(1, 1_000_000)
      .boxed()
      .collect(Collectors.toMap(Function.identity(), n -> collatzSequenceForNumber(n).size()))
      .entrySet()
      .stream()
      .max(Map.Entry.comparingByValue())
      .orElseThrow()
      .getKey();
  }
}
