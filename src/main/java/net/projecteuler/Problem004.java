package net.projecteuler;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Problem004 {

  private boolean isPalindrome(Long number) {
    var original = number.toString();
    var reversed = new StringBuilder(original).reverse().toString();
    return original.equals(reversed);
  }

  public Long maxPalindrome(Long maxNumber) {

    Set<Long> palindromes = new HashSet<>();

    LongStream.rangeClosed(1, maxNumber).forEach(first ->
        LongStream.rangeClosed(1, maxNumber).forEach(second -> {
          var product = first * second;
          if (isPalindrome(product)) {
            palindromes.add(product);
          }
        })
    );

    return Collections.max(palindromes);
  }

}
