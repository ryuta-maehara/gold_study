package mock_exam.q056;

import java.util.stream.Stream;

public class Sample {
  public static void main(String[] args) {

    // Stream a = Stream.of(1, 2, 3);
    // Stream<Integer> b = a.map(n -> n + 1); // Stream<Integer>にしていないため、コンパイルエラーになる。
    // b.forEach(n -> System.out.println(n));

    Stream b = Stream.of(1, 2, 3); // ジェネリクスを使用していないため、Streamはどんな型でも扱えるraw typeになる。
    Stream<Integer> stream = b.map(n -> (Integer) n + 1); //
    // raw typeのmapで引数の関数型もraw typeのFunctionになる.
    // raw typetとはつまり、nはObject型になる。
    // そのため、キャストが必要になる。
    // キャストしないとコンパイルエラーになる。
    stream.forEach(n -> System.out.println(n));

    Stream<Integer> c = Stream.of(1, 2, 3);
    stream = c.map(n -> (n + 1)); // 型が明示されているため、キャストは不要。
    stream.forEach(n -> System.out.println(n));
  }
}
