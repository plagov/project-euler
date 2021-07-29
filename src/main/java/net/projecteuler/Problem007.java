package net.projecteuler;

public class Problem007 {

  private boolean isPrimeNumber(int number) {
    int divisibleNumber = 2;
    while (number != divisibleNumber) { // можно сократь условие до квадрат divisibleNumber не больше number
      if (number % divisibleNumber == 0) {
        return false;
      }
      divisibleNumber++;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(new Problem007().isPrimeNumber(107));
  }
}
