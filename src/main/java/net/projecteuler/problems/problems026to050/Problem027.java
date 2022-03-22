package net.projecteuler.problems.problems026to050;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Problem027 {
  public long solve() {

    long n = 0;
    List<Data> datas = new ArrayList<>();

    for (var a = -999; a < 1000; a++) {
      for (var b = -1000; b <= 1000; b++) {
        while (true) {
          long number = (n * n) + (a * n) + b;
          if (number % 2 == 0 || number % 3 == 0) {
            var data = new Data(a, b, n - 1);
            datas.add(data);
            break;
          }
          n++;
        }
      }
    }

    var dataObject = datas.stream().max(Comparator.comparing(d -> d.n)).orElseThrow();

    return dataObject.a * dataObject.b;
  }

  private record Data(
    long a,
    long b,
    long n
  ) {
  }
}
