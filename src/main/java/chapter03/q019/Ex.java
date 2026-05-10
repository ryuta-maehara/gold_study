package chapter03.q019;

import java.util.Arrays;
import java.util.List;

public class Ex {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);
    // リダクションの結果を出力
    Integer sum = list.stream().reduce(0, (a, b) -> a + b);
    System.out.println(sum);
  }
}
