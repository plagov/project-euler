package net.projecteuler.util;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NaturalNumberTest {

  @ParameterizedTest
  @ValueSource(ints = {12, 18, 20, 24, 30})
  void isAbundant(int number) {
    assertTrue(NaturalNumber.isAbundant(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {6, 28, 15, 16, 17})
  void isNotAbundant(int number) {
    assertFalse(NaturalNumber.isAbundant(number));
  }
}
