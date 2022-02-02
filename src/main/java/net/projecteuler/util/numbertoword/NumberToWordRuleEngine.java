package net.projecteuler.util.numbertoword;

import net.projecteuler.util.numbertoword.rules.DoubleDigitNumberFromTwentyUpToHundredRule;
import net.projecteuler.util.numbertoword.rules.DoubleDigitNumberUpToTwentyRule;
import net.projecteuler.util.numbertoword.rules.DoubleDigitRoundNumberRule;
import net.projecteuler.util.numbertoword.rules.OneThousandNumberRule;
import net.projecteuler.util.numbertoword.rules.SingleDigitNumberRule;
import net.projecteuler.util.numbertoword.rules.ThreeDigitNumberRule;
import net.projecteuler.util.numbertoword.rules.ThreeDigitRoundNumberRule;

import java.util.List;
import java.util.Optional;

public class NumberToWordRuleEngine {
  private final List<NumberRule> rules = List.of(
    new SingleDigitNumberRule(),
    new DoubleDigitNumberUpToTwentyRule(),
    new DoubleDigitNumberFromTwentyUpToHundredRule(),
    new DoubleDigitRoundNumberRule(),
    new ThreeDigitNumberRule(),
    new ThreeDigitRoundNumberRule(),
    new OneThousandNumberRule()
  );

  public NumberResult process(int number) {
    return rules.stream()
      .map(rule -> rule.evaluate(number))
      .flatMap(Optional::stream)
      .findFirst().orElseThrow();
  }
}
