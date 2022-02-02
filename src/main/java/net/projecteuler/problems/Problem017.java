package net.projecteuler.problems;

import net.projecteuler.util.numbertoword.NumberToWordRuleEngine;

import java.util.stream.IntStream;

public class Problem017 {

  public long solve() {
    var ruleEngine = new NumberToWordRuleEngine();
    var numberResultStream = IntStream.rangeClosed(1, 1000)
      .mapToObj(ruleEngine::process);
    return numberResultStream
      .map(word -> word.value().replaceAll("\\s|-", ""))
      .map(String::length)
      .mapToLong(Integer::longValue)
      .sum();
  }
}
