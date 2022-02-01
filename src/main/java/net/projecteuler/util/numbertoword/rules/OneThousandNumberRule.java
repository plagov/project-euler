package net.projecteuler.util.numbertoword.rules;

import net.projecteuler.util.numbertoword.DictionaryProcessing;
import net.projecteuler.util.numbertoword.NumberResult;
import net.projecteuler.util.numbertoword.NumberRule;

import java.util.Optional;

public class OneThousandNumberRule extends DictionaryProcessing implements NumberRule {
  @Override
  public Optional<NumberResult> evaluate(int number) {
    if (number == 1000) {
      String word = wordForNumber(number);
      return Optional.of(new NumberResult("one %s".formatted(word)));
    }
    return Optional.empty();
  }
}
