package net.projecteuler.problems;

import net.projecteuler.util.FileUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Problem008 {

  private List<Integer> getListOfDigits() {
    String string = FileUtil.readInputFile("problem008.txt").replace("\n", "");
    return Arrays.stream(string.split("")).map(Integer::valueOf).collect(Collectors.toList());
  }

  public long highestProductOfAdjacentDigits(int numberOfAdjacentDigits) {
    var allDigits = getListOfDigits();
    var startIndex = 0;
    var endIndex = numberOfAdjacentDigits;
    List<Long> products = new ArrayList<>();
    while (endIndex != allDigits.size()) {
      var adjacentDigits = allDigits.subList(startIndex, endIndex);
      if (!adjacentDigits.contains(0)) {
        var product = adjacentDigits.stream().mapToLong(a -> a).reduce(1, (a, b) -> a * b);
        products.add(product);
      }
      startIndex++;
      endIndex++;
    }
    return Collections.max(products);
  }

}
