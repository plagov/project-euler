package net.projecteuler;

public class Problem004 {

  private boolean isPalindrome(Long number) {
    var original = number.toString();
    var reversed = new StringBuilder(original).reverse().toString();
    return original.equals(reversed);
  }

}
