package net.projecteuler.problems;

import net.projecteuler.util.FileUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problem011 {

  public int solve() {
    var input = FileUtil.parseFileTo2dListOfIntegers("problem011.txt");

    var window = 4;

    List<Integer> horizontal = maxProductOfHorizontalRange(input, window);
    List<Integer> vertical = maxProductOfVerticalRange(input, window);
    List<Integer> leftToRight = maxProductOfLeftToRightRange(input, window);
    List<Integer> rightToLeft = maxProductOfRightToLeftRange(input, window);

    return Stream.of(horizontal, vertical, leftToRight, rightToLeft)
      .flatMap(Collection::stream).mapToInt(v -> v).max().orElseThrow();
  }

  private static List<Integer> maxProductOfRightToLeftRange(List<List<Integer>> input, int window) {
    List<Integer> rightToLeft = new ArrayList<>();
    for (var row = 0; row <= input.size() - window; row++) {
      int finalRow = row;
      for (var column = 3; column < input.size(); column++) {
        int finalColumn = column;
        var diagonalRange = IntStream.range(0, 4).map(n -> input.get(finalRow + n).get(finalColumn - n)).boxed().toList();
        var product = diagonalRange.stream().reduce(1, (a, b) -> a * b);
        rightToLeft.add(product);
      }
    }
    return rightToLeft;
  }

  private static List<Integer> maxProductOfLeftToRightRange(List<List<Integer>> input, int window) {
    List<Integer> leftToRight = new ArrayList<>();
    for (var row = 0; row <= input.size() - window; row++) {
      int finalRow = row;
      for (var column = 0; column <= input.size() - window; column++) {
        int finalColumn = column;
        var diagonalRange = IntStream.range(0, 4).map(n -> input.get(finalRow + n).get(finalColumn + n)).boxed().toList();
        var product = diagonalRange.stream().reduce(1, (a, b) -> a * b);
        leftToRight.add(product);
      }
    }
    return leftToRight;
  }

  private static List<Integer> maxProductOfVerticalRange(List<List<Integer>> input, int window) {
    List<Integer> vertical = new ArrayList<>();
    for (var column = 0; column < input.size(); column++) {
      int finalColumn = column;
      for (var row = 0; row <= input.size() - window; row++) {
        var currentColumn = input.stream().mapToInt(integers -> integers.get(finalColumn)).boxed().toList();
        var product = currentColumn.subList(row, row + window).stream().reduce(1, (a, b) -> a * b);
        vertical.add(product);
      }
    }
    return vertical;
  }

  private static List<Integer> maxProductOfHorizontalRange(List<List<Integer>> input, int window) {
    List<Integer> horizontal = new ArrayList<>();
    for (var row = 0; row < input.size(); row++) {
      var line = input.get(row);
      for (var column = 0; column <= input.size() - window; column++) {
        var product = line.subList(column, column + window).stream().reduce(1, (a, b) -> a * b);
        horizontal.add(product);
      }
    }
    return horizontal;
  }
}
