package net.projecteuler.util.numbertoword.rules;

import net.projecteuler.util.numbertoword.DictionaryProcessing;
import net.projecteuler.util.numbertoword.NumberResult;
import net.projecteuler.util.numbertoword.NumberRule;

import java.util.Optional;

public class DoubleDigitNumberFromTwentyUpToHundredRule extends DictionaryProcessing implements NumberRule {

  @Override
  public Optional<NumberResult> evaluate(int number) {
    if (number > 20 && number < 100 && number % 10 != 0) {
      int firstDigit = number / 10;
      int lastDigit = number - firstDigit * 10;
      String firstWord = wordForNumber(firstDigit * 10);
      String secondWord = wordForNumber(lastDigit);
      return Optional.of(new NumberResult("%s %s".formatted(firstWord, secondWord)));
    }
    return Optional.empty();
  }
}
