package net.projecteuler.util.numbertoword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberToWordTest {

  private final NumberToWordRuleEngine ruleEngine = new NumberToWordRuleEngine();

  @Test
  void testSingleDigitNumber() {
    assertEquals("six", ruleEngine.process(6).value());
  }

  @Test
  void testDoubleDigitUpToTwenty() {
    assertEquals("fifteen", ruleEngine.process(15).value());
  }

  @Test
  void testDoubleDigitFromTwenty() {
    assertEquals("fifty three", ruleEngine.process(53).value());
  }

  @Test
  void testDoubleDigitRoundNumber() {
    assertEquals("fifty", ruleEngine.process(50).value());
  }

  @Test
  void testThreeDigitNumber() {
    assertEquals("three hundred and forty-two", ruleEngine.process(342).value());
  }

  @Test
  void testThreeDigitRoundNumber() {
    assertEquals("three hundred", ruleEngine.process(300).value());
  }

  @Test
  void testOneThousand() {
    assertEquals("one thousand", ruleEngine.process(1000).value());
  }

}
