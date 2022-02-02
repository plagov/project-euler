package net.projecteuler.util.numbertoword;

import java.util.Optional;

public interface NumberRule {
  Optional<NumberResult> evaluate(int number);
}
