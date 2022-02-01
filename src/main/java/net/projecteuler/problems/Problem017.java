package net.projecteuler.problems;

import java.util.List;
import java.util.Optional;

public class Problem017 {

  private static final List<Number> dictionary = List.of(
    new Number(1, "one"),
    new Number(2, "two"),
    new Number(3, "three"),
    new Number(4, "four"),
    new Number(5, "five"),
    new Number(6, "six"),
    new Number(7, "seven"),
    new Number(8, "eight"),
    new Number(9, "nine"),
    new Number(10, "ten"),
    new Number(11, "eleven"),
    new Number(12, "twelve"),
    new Number(13, "thirteen"),
    new Number(14, "fourteen"),
    new Number(15, "fifteen"),
    new Number(16, "sixteen"),
    new Number(17, "seventeen"),
    new Number(18, "eighteen"),
    new Number(19, "nineteen"),
    new Number(20, "twenty"),
    new Number(20, "twenty"),
    new Number(30, "thirty"),
    new Number(40, "forty"),
    new Number(50, "fifty"),
    new Number(60, "sixty"),
    new Number(70, "seventy"),
    new Number(80, "eighty"),
    new Number(90, "ninety"),
    new Number(100, "hundred"),
    new Number(1000, "thousand")
  );


  public long solve() {
    return 0;
  }

  private record Number(int number, String wordRepresentation) {
  }

  private record NumberResult(String value) {
  }

  private interface NumberRule {
    Optional<NumberResult> evaluate(int number);
  }

  private class SingleDigitNumberRule implements NumberRule {
    @Override
    public Optional<NumberResult> evaluate(int number) {
      if (number >= 1 && number < 10) {
        return numberResultFor(number);
      }
      return Optional.empty();
    }
  }

  private class DoubleDigitNumberUpToTwentyRule implements NumberRule {
    @Override
    public Optional<NumberResult> evaluate(int number) {
      if (number >= 10 && number <= 20) {
        return numberResultFor(number);
      }
      return Optional.empty();
    }
  }

  private class DoubleDigitNumberFromTwentyUpToHundredRule implements NumberRule {
    @Override
    public Optional<NumberResult> evaluate(int number) {
      if (number > 20 && number < 100) {
        var firstDigit = number / 10;
        var lastDigit = number - firstDigit * 10;
        var firstWord = numberResultFor(firstDigit * 10).orElseThrow().value();
        var secondWord = numberResultFor(lastDigit).orElseThrow().value();
        return Optional.of(new NumberResult("%s %s".formatted(firstWord, secondWord)));
      }
      return Optional.empty();
    }
  }

  private Optional<NumberResult> numberResultFor(int number) {
    var result = dictionary.stream()
      .filter(n -> n.number() == number)
      .findFirst()
      .orElseThrow();
    return Optional.of(new NumberResult(result.wordRepresentation()));
  }

  private class TripleDigitNumberRule implements NumberRule {
    @Override
    public Optional<NumberResult> evaluate(int number) {
      if (number >= 100 && number < 1000) {

      }
      return Optional.empty();
    }
  }


}
