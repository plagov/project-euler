package net.projecteuler.problems.problems001to025;

import net.projecteuler.util.FileUtil;

import java.util.Arrays;

public class Problem022 {
  public int solve() {
    var sortedNames = Arrays.stream(FileUtil.readInputFile("problem022.txt")
        .split(","))
      .map(s -> s.replaceAll("^\"|\"$", ""))
      .sorted()
      .toList();

    return sortedNames.stream()
      .map(n -> (sortedNames.indexOf(n) + 1) * scoreOfName(n))
      .reduce(0, Math::addExact);
  }

  private int scoreOfName(String name) {
    return name.chars().boxed()
      .map(c -> c - 'A' + 1)
      .reduce(0, Math::addExact);
  }
}
