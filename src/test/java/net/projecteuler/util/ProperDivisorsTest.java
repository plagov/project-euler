package net.projecteuler.util;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProperDivisorsTest {

  @Test
  void shouldFindProperDivisorsOfNumber() {
    assertEquals(
      List.of(1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110),
      ProperDivisors.properDivisorsOfNumber(220)
    );
  }
}
