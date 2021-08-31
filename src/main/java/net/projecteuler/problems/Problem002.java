package net.projecteuler.problems;

import java.util.HashSet;
import java.util.Set;

public class Problem002 {

	private static Set<Long> fibonacciSequenceUntil(long limit) {
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

	public Long sumOfEvenFibonacciTermsUntil(int limit) {
		return fibonacciSequenceUntil(limit)
				.stream()
				.filter(term -> term % 2 == 0)
				.mapToLong(Long::longValue)
				.sum();
	}
}
