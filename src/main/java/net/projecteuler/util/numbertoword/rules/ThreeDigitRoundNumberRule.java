package net.projecteuler.util.numbertoword.rules;

import net.projecteuler.util.numbertoword.DictionaryProcessing;
import net.projecteuler.util.numbertoword.NumberResult;
import net.projecteuler.util.numbertoword.NumberRule;

import java.util.Optional;

public class ThreeDigitRoundNumberRule extends DictionaryProcessing implements NumberRule {

  @Override
  public Optional<NumberResult> evaluate(int number) {
    if (number >= 100 && number < 1000 && number % 100 == 0) {
      int firstDigit = number / 100;
      return Optional.of(new NumberResult("%s %s".formatted(wordForNumber(firstDigit), wordForNumber(100))));
    }
    return Optional.empty();
  }
}
