package net.projecteuler.problems.problems001to025;

import net.projecteuler.util.FileUtil;
import net.projecteuler.util.MaximumPathSum;

public class Problem018 {
  public int solve() {
    var input = FileUtil.parseFileTo2dListOfIntegers("problem018.txt");
    return MaximumPathSum.maximumPathSum(input);
  }
}
