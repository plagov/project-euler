package net.projecteuler;

import java.util.stream.IntStream;

/**
 * https://projecteuler.net/problem=1
 */
public class Problem001 {

    public int sumOfMultipliersOf3And5BelowNumber(int upperNumber) {
        return IntStream.range(0, upperNumber)
                .filter(number -> number % 3 == 0 || number % 5 == 0)
                .sum();
    }
}
