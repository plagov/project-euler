package net.projecteuler.problems.problems001to025;

public class Problem015 {

  public long solve() {
    long[][] grid = new long[21][21];
    for (var i = 0; i < grid.length; i++) {
      grid[0][i] = 1;
      grid[i][0] = 1;
    }
    for (var i = 1; i < grid.length; i++) {
      for (var k = 1; k < grid.length; k++) {
        grid[i][k] = grid[i][k - 1] + grid[i - 1][k];
      }
    }
    return grid[20][20];
  }
}
