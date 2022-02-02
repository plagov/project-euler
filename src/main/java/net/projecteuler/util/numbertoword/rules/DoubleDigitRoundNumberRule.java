package net.projecteuler.util.numbertoword.rules;

import net.projecteuler.util.numbertoword.DictionaryProcessing;
import net.projecteuler.util.numbertoword.NumberResult;
import net.projecteuler.util.numbertoword.NumberRule;

import java.util.Optional;

public class DoubleDigitRoundNumberRule extends DictionaryProcessing implements NumberRule {
  @Override
  public Optional<NumberResult> evaluate(int number) {
    if (number > 20 && number < 100 && number % 10 == 0) {
      return Optional.of(new NumberResult(wordForNumber(number)));
    }
    return Optional.empty();
  }
}
