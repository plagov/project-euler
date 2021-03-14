package net.projectueler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem001Test {

    private final Problem001 problem001 = new Problem001();

    @Test
    void testSample() {
        var sum = problem001.sumOfMultipliersOf3And5BelowNumber(10);
        Assertions.assertEquals(23, sum);
    }

    @Test
    void testReal() {
        var sum = problem001.sumOfMultipliersOf3And5BelowNumber(1_000);
        Assertions.assertEquals(233168, sum);
    }
}
