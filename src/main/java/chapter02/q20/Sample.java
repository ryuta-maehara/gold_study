package chapter02.q20;

import java.util.function.UnaryOperator;

public class Sample {
  public static void main(String[] args) {

    // UnaryOperatorは引数と戻り値の型が同じ関数型インターフェース
    UnaryOperator<Integer> increment = x -> x + 1; // 引数に1を加算するUnaryOperatorを作成
    System.out.println(increment.apply(5)); // 6が出力される

    UnaryOperator<Integer> twice = x -> x * 2; // 引数を2倍するUnaryOperatorを作成
    System.out.println(twice.apply(10)); // 20が出力される
  }
}
