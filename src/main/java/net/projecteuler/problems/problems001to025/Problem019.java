package net.projecteuler.problems.problems001to025;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Problem019 {

  public long solve() {
    var startDate = LocalDate.of(1901, 1, 1);
    var endDate = LocalDate.of(2000, 12, 31);

    return startDate.datesUntil(endDate)
      .filter(day -> day.getDayOfWeek() == DayOfWeek.SUNDAY)
      .filter(sunday -> sunday.getDayOfMonth() == 1)
      .count();
  }
}
