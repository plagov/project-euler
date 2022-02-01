package net.projecteuler.util.numbertoword.rules;

import net.projecteuler.util.numbertoword.NumberResult;
import net.projecteuler.util.numbertoword.NumberRule;

import java.util.Optional;

import static net.projecteuler.util.numbertoword.UtilFun.numberResultFor;

public class ThreeDigitNumberRule implements NumberRule {
  @Override
  public Optional<NumberResult> evaluate(int number) {
    if (number >= 100 && number < 1000) {
      int firstDigit = number / 100;
      int secondDigit = (number - firstDigit * 100) / 10;
      int thirdDigit = number - firstDigit * 100 - secondDigit * 10;
      String firstWord = "%s %s".formatted(numberResultFor(firstDigit).get().value(), numberResultFor(100).get().value());
      String secondWord = numberResultFor(secondDigit * 10).get().value();
      String thirdWord = numberResultFor(thirdDigit).get().value();
      return Optional.of(new NumberResult("%s and %s-%s".formatted(firstWord, secondWord, thirdWord)));
    }
    return Optional.empty();
  }
}
