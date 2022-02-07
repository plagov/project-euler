package net.projecteuler.problems;

import net.projecteuler.util.FileUtil;
import net.projecteuler.util.MaximumPathSum;

import java.util.Arrays;

public class Problem067 {
  public Long solve() {
    var input = Arrays.stream(FileUtil.readInputFile("problem067.txt").split("\n"))
      .map(line -> Arrays.stream(line.split(" ")).map(Long::valueOf).toList()).toList();

    return MaximumPathSum.maximumPathSum(input);
  }
}
