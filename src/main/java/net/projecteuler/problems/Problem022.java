package net.projecteuler.problems;

import net.projecteuler.util.FileUtil;

import java.util.Arrays;

public class Problem022 {
  public int solve() {
    var sortedName = Arrays.stream(FileUtil.readInputFile("problem022.txt")
        .split(","))
      .map(s -> s.replaceAll("^\"|\"$", ""))
      .sorted()
      .toList();

    return sortedName.stream()
      .map(n -> (sortedName.indexOf(n) + 1) * scoreOfName(n))
      .reduce(0, Integer::sum);
  }

  private int scoreOfName(String name) {
    return name.chars().boxed()
      .map(c -> c - 'A' + 1)
      .reduce(0, Math::addExact);
  }
}
