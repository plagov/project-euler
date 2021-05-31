package net.projecteuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem004Test {

  private final Problem004 problem004 = new Problem004();

  @Test
  void maxPalindromeSampleInput() {
    var maxPalindrome = problem004.maxPalindrome(99L);
    Assertions.assertEquals(9009, maxPalindrome);
  }

  @Test
  void maxPalindromeTaskInput() {
    var maxPalindrome = problem004.maxPalindrome(999L);
    Assertions.assertEquals(906609, maxPalindrome);
  }
}
