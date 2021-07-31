package net.projecteuler.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import net.projecteuler.util.FileUtil;

public class Problem008 {

  private List<Integer> getListOfDigits() {
    String string = FileUtil.readInputFile("problem008.txt").replace("\n", "");
    return Arrays.stream(string.split("")).map(Integer::valueOf).collect(Collectors.toList());
  }

}
