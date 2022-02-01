package net.projecteuler.util.numbertoword.rules;

import net.projecteuler.util.numbertoword.NumberResult;
import net.projecteuler.util.numbertoword.NumberRule;

import java.util.Optional;

import static net.projecteuler.util.numbertoword.UtilFun.numberResultFor;

public class DoubleDigitNumberFromTwentyUpToHundredRule implements NumberRule {

  @Override
  public Optional<NumberResult> evaluate(int number) {
    if (number > 20 && number < 100) {
      int firstDigit = number / 10;
      int lastDigit = number - firstDigit * 10;
      String firstWord = numberResultFor(firstDigit * 10).orElseThrow().value();
      String secondWord = numberResultFor(lastDigit).orElseThrow().value();
      return Optional.of(new NumberResult("%s %s".formatted(firstWord, secondWord)));
    }
    return Optional.empty();
  }
}
