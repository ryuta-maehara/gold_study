package mock_exam.q18;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {

  public static void main(String[] args) {
    List<Integer> a = List.of(50, 60, 70, 80);
    List<Integer> b = List.of(40, 50, 60, 70);

    double avg =
        Stream.of(a, b) // Stream<List<Integer>>を生成する
            .flatMap(List::stream) // Stream<List<Integer>>の要素を１つのストリームとして生成する
            .collect(
                Collectors.averagingDouble(d -> d) // Stream<Integer>の要素をdoubleに変換して平均値を求める
                // 入力要素はToDoubleFunction<Integer>で定義されているため、d -> dのようにそのまま返すラムダ式を使用することができます.
                // もしくは以下のように、Collectors.averagingInt(d -> d)を使用することもできます。
                // Collectors.averagingInt(d -> d)
                );

    System.out.println(avg);
  }
}
