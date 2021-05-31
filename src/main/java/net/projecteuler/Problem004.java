package net.projecteuler;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.LongStream;

public class Problem004 {

  private boolean isPalindrome(Long number) {
    var original = number.toString();
    var reversed = new StringBuilder(original).reverse().toString();
    return original.equals(reversed);
  }

  public Long maxPalindromeProductOfTwoNumbersWithNumberOfDigits(int numberOfDigits) {

    Set<Long> palindromes = new HashSet<>();

    var from = rangeLimits(numberOfDigits).start;
    var to = rangeLimits(numberOfDigits).end;

    LongStream.rangeClosed(from, to).forEach(first ->
        LongStream.rangeClosed(from, to).forEach(second -> {
          var product = first * second;
          if (isPalindrome(product)) {
            palindromes.add(product);
          }
        })
    );

    return Collections.max(palindromes);
  }

  private RangeLimits rangeLimits(int numberOfDigits) {
    var stringFrom = "1" + "0".repeat(numberOfDigits - 1);
    var from = Integer.parseInt(stringFrom);
    var to = from * 10 - 1;
    return new RangeLimits(from, to);
  }

}

class RangeLimits {
  int start;
  int end;

  public RangeLimits(int start, int end) {
    this.start = start;
    this.end = end;
  }
}
