package net.projecteuler.util.numbertoword;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberToWordTest {

  private final NumberToWordRuleEngine ruleEngine = new NumberToWordRuleEngine();

  @Test
  void testSingleDigitNumber() {
    assertEquals("six", ruleEngine.process(6).value());
  }

  @ParameterizedTest
  @MethodSource("twoDigitsNumbers")
  void testTwoDigitNumber(int input, String expectedWord) {
    assertEquals(expectedWord, ruleEngine.process(input).value());
  }

  private static Stream<Arguments> twoDigitsNumbers() {
    return Stream.of(
      Arguments.of(15, "fifteen"),
      Arguments.of(53, "fifty three"),
      Arguments.of(50, "fifty")
    );
  }

  @ParameterizedTest
  @MethodSource("threeDigitNumbers")
  void testThreeDigitNumber(int input, String expectedWord) {
    assertEquals(expectedWord, ruleEngine.process(input).value());
  }

  private static Stream<Arguments> threeDigitNumbers() {
    return Stream.of(
      Arguments.of(342, "three hundred and forty-two"),
      Arguments.of(300, "three hundred"),
      Arguments.of(301, "three hundred and one"),
      Arguments.of(310, "three hundred and ten"),
      Arguments.of(113, "one hundred and thirteen")
    );
  }

  @Test
  void testOneThousand() {
    assertEquals("one thousand", ruleEngine.process(1000).value());
  }

}
