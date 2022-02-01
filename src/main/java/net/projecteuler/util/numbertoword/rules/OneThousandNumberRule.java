package net.projecteuler.util.numbertoword.rules;

import net.projecteuler.util.numbertoword.NumberResult;
import net.projecteuler.util.numbertoword.NumberRule;

import java.util.Optional;

import static net.projecteuler.util.numbertoword.UtilFun.numberResultFor;

public class OneThousandNumberRule implements NumberRule {
  @Override
  public Optional<NumberResult> evaluate(int number) {
    if (number == 1000) {
      String word = numberResultFor(number).get().value();
      return Optional.of(new NumberResult("one %s".formatted(word)));
    }
    return Optional.empty();
  }
}
