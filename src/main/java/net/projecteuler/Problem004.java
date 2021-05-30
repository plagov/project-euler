package net.projecteuler;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Problem004 {

  private boolean isPalindrome(Long number) {
    var original = number.toString();
    var reversed = new StringBuilder(original).reverse().toString();
    return original.equals(reversed);
  }

  public Set<Long> palindromeNumbers() {

    Set<Long> palindromes = new HashSet<>();

    LongStream.range(100, 1000).forEach(first -> {
      LongStream.range(100, 1000).forEach(second -> {
        var product = first * second;
        if (isPalindrome(product)) {
          palindromes.add(product);
        }
      });
    } );

    return palindromes;
  }

}
