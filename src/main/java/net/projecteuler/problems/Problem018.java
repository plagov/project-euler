package net.projecteuler.problems;

import net.projecteuler.util.FileUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Problem018 {
  public Long solve() {
    var listOfLists = Arrays.stream(FileUtil.readInputFile("problem018.txt").split("\n"))
      .map(line -> Arrays.stream(line.split(" ")).map(Long::valueOf).toList()).toList();

    var finalList = new ArrayList<>(listOfLists);

    for (var i = listOfLists.size() - 1; i-- > 0; ) {
      List<Long> listOfSums = new ArrayList<>();
      for (var k = 0; k < listOfLists.get(i).size(); k++) {
        var currentLine = listOfLists.get(i);
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
      throw new IllegalArgumentException("Final list should contain only one element, but have: " + flattenList);
    }

    return flattenList.get(0);
  }
}
