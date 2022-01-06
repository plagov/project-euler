package net.projecteuler.util;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorizationTest {

  @Test
  void primeFactorizationOfTheNumber() {
    assertEquals(
      List.of(2, 2, 2, 2, 3, 3),
      PrimeFactorization.primeFactorizationOfTheNumber(144)
    );
  }
}
