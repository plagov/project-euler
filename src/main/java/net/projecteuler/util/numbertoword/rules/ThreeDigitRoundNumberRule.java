package net.projecteuler.util.numbertoword.rules;

import net.projecteuler.util.numbertoword.DictionaryProcessing;
import net.projecteuler.util.numbertoword.NumberResult;
import net.projecteuler.util.numbertoword.NumberRule;

import java.util.Optional;

public class ThreeDigitRoundNumberRule extends DictionaryProcessing implements NumberRule {

  @Override
  public Optional<NumberResult> evaluate(int number) {
    var stringInt = Integer.toString(number);
    if (stringInt.length() == 3 && stringInt.contains("0")) {
      var array = stringInt.split("");
      String firstWord = "%s %s".formatted(wordForNumber(Integer.parseInt(array[0])), wordForNumber(100));
      if (array[1].equals("0") && !array[2].equals("0")) {
        String thirdWord = wordForNumber(Integer.parseInt(array[2]));
        return Optional.of(new NumberResult("%s and %s".formatted(firstWord, thirdWord)));
      }
      if (!array[1].equals("0") && array[2].equals("0")) {
        int secondDigit = Integer.parseInt(array[1]) * 10;
        String secondWord = wordForNumber(secondDigit);
        return Optional.of(new NumberResult("%s and %s".formatted(firstWord, secondWord)));
      }
      if (array[1].equals("0")) {
        return Optional.of(new NumberResult(firstWord));
      }
    }
    return Optional.empty();
  }
}
