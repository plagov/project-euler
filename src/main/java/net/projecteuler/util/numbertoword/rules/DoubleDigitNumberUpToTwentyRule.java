package net.projecteuler.util.numbertoword.rules;

import net.projecteuler.util.numbertoword.NumberResult;
import net.projecteuler.util.numbertoword.NumberRule;

import java.util.Optional;

import static net.projecteuler.util.numbertoword.UtilFun.numberResultFor;

public class DoubleDigitNumberUpToTwentyRule implements NumberRule {

  @Override
  public Optional<NumberResult> evaluate(int number) {
    if (number >= 10 && number <= 20) {
      return numberResultFor(number);
    }
    return Optional.empty();
  }
}
