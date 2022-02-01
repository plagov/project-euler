package net.projecteuler.util.numbertoword;

import java.util.List;

public class DictionaryProcessing {

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

  protected String wordForNumber(int number) {
    var result = dictionary.stream()
      .filter(n -> n.number() == number)
      .findFirst()
      .orElseThrow(() -> new IllegalArgumentException("No word present for number: " + number));
    return result.wordRepresentation();
  }
}
