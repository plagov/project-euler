package net.projecteuler.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MaximumPathSum {

  public static int maximumPathSum(List<List<Integer>> listOfRows) {
    var finalList = new ArrayList<>(listOfRows);

    for (var i = listOfRows.size() - 1; i-- > 0; ) {
      List<Integer> listOfSums = new ArrayList<>();
      for (var k = 0; k < listOfRows.get(i).size(); k++) {
        var currentLine = listOfRows.get(i);
        var belowLine = finalList.get(finalList.size() - 1);
        var firstSum = currentLine.get(k) + belowLine.get(k);
        var secondSum = currentLine.get(k) + belowLine.get(k + 1);
        listOfSums.add(Math.max(firstSum, secondSum));
      }
      finalList.remove(finalList.size() - 2);
      finalList.remove(finalList.size() - 1);
      finalList.add(listOfSums);
    }

    var flattenList = finalList.stream().flatMap(Collection::stream).toList();
    if (flattenList.size() != 1) {
      throw new IllegalArgumentException("Final list should contain only one element, but has: " + flattenList);
    }

    return flattenList.get(0);
  }
}
