package mock_exam.q31;

import java.util.List;

public class Sample {

  public static void main(String[] args) {
    List<Integer> values = List.of(10, 20, 30, 40, 50);
    // double result = values.stream().mapToInt(d -> d).average().getAsDouble();
    double result =
        values.stream()
            .mapToDouble(d -> d)
            // mapToDoubleは、ToDoubleFunction<? super T>の引数を持ち、ストリームの要素をdoubleに変換するためのメソッドです。
            // ここでは、d -> dのようにそのまま返すラムダ式を使用することができます。

            // ? super Tは、下限境界ワイルドカードを表します。
            // 下限境界ワイルドカードとは、ジェネリクスの型パラメータを継承関係の下位にある型であっても受け入れることができることを意味します。
            // 例えば、ToDoubleFunction<? super Integer>とした場合、Integer型の要素をdoubleに変換するための関数を受け入れることができます。

            .average() // average()は、DoubleStreamの要素の平均値を求めるためのメソッドです。結果はOptionalDouble型で返されます。
            .getAsDouble(); // getAsDouble()は、OptionalDoubleから平均値を取得するためのメソッドです。リストが空の場合はNoSuchElementExceptionがスローされます。
    System.out.println(result);
  }
}
