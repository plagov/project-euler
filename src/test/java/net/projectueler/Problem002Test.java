package net.projectueler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem002Test {

	@Test
	void sumOfEvenFibonacciTerms() {
		var sum = new Problem002().sumOfEvenFibonacciTerms();
		Assertions.assertEquals(4_613_732, sum);
	}
}
