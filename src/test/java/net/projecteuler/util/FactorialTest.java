package net.projecteuler.util;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

  @Test
  void factorialOf25() {
    assertEquals(
      new BigInteger("15511210043330985984000000"),
      Factorial.factorialOfNumber(25)
    );
  }
}
