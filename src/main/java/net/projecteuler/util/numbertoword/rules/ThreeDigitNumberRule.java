package net.projecteuler.util.numbertoword.rules;

import net.projecteuler.util.numbertoword.DictionaryProcessing;
import net.projecteuler.util.numbertoword.NumberResult;
import net.projecteuler.util.numbertoword.NumberRule;

import java.util.Optional;

public class ThreeDigitNumberRule extends DictionaryProcessing implements NumberRule {
  @Override
  public Optional<NumberResult> evaluate(int number) {
    if (number >= 100 && number < 1000 && number % 100 != 0) {
      int firstDigit = number / 100;
      int secondDigit = (number - firstDigit * 100) / 10;
      int thirdDigit = number - firstDigit * 100 - secondDigit * 10;
      String firstWord = "%s %s".formatted(wordForNumber(firstDigit), wordForNumber(100));
      String secondWord = wordForNumber(secondDigit * 10);
      String thirdWord = wordForNumber(thirdDigit);
      return Optional.of(new NumberResult("%s and %s-%s".formatted(firstWord, secondWord, thirdWord)));
    }
    return Optional.empty();
  }
}
