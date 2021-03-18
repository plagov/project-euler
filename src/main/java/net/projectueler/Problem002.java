package net.projectueler;

import java.util.HashSet;
import java.util.Set;

/**
 * https://projecteuler.net/problem=2
 */
public class Problem002 {

	private Set<Long> fibonacciSequenceUntil() {
		long limit = 4_000_000;
		long first = 1;
		long second = 2;
		long next;
		Set<Long> set = new HashSet<>(Set.of(first, second));
		while (first + second < limit) {
			next = first + second;
			first = second;
			second = next;
			set.addAll(Set.of(first, second));
		}
		return set;
	}

	public Long sumOfEvenFibonacciTerms() {
		return fibonacciSequenceUntil()
				.stream()
				.filter(term -> term % 2 == 0)
				.mapToLong(Long::longValue)
				.sum();
	}
}
