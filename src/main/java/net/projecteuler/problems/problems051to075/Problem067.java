package net.projecteuler.problems.problems051to075;

import net.projecteuler.util.FileUtil;
import net.projecteuler.util.MaximumPathSum;

public class Problem067 {
  public int solve() {
    var input = FileUtil.parseFileTo2dListOfIntegers("problem067.txt");
    return MaximumPathSum.maximumPathSum(input);
  }
}
