package net.projecteuler.util.numbertoword.rules;

import net.projecteuler.util.numbertoword.DictionaryProcessing;
import net.projecteuler.util.numbertoword.NumberResult;
import net.projecteuler.util.numbertoword.NumberRule;

import java.util.Optional;

public class DoubleDigitNumberUpToTwentyRule extends DictionaryProcessing implements NumberRule {

  @Override
  public Optional<NumberResult> evaluate(int number) {
    if (number >= 10 && number <= 20) {
      return Optional.of(new NumberResult(wordForNumber(number)));
    }
    return Optional.empty();
  }
}
