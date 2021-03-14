package net.projectueler;

import java.util.stream.IntStream;

public class Problem001 {

    public int sumOfMultipliersOf3And5Below(int belowNumber) {
        return IntStream.range(0, belowNumber)
                .filter(number -> number % 3 == 0 || number % 5 == 0)
                .sum();
    }
}
