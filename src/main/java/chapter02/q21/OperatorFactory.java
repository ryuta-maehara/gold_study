package chapter02.q21;

import java.util.function.BinaryOperator;

public class OperatorFactory {
  public static BinaryOperator<Integer> add() {
    return (a, b) -> a + b;
  }

  public static BinaryOperator<Integer> minus() {
    return (a, b) -> a - b;
  }
}
