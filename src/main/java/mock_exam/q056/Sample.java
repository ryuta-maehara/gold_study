package mock_exam.q056;

import java.util.stream.Stream;

public class Sample {
  public static void main(String[] args) {

    // Stream a = Stream.of(1, 2, 3);
    // Stream<Integer> b = a.map(n -> n + 1); // Stream<Integer>にしていないため、コンパイルエラーになる。
    // b.forEach(n -> System.out.println(n));

    Stream b =
        Stream.of(
            1, 2, 3); // 型を指定しないと、warningが発生する。Streamはジェネリクスを使用しているため、型を指定しないと、コンパイル時に型安全性が保証されない。
    Stream<Integer> stream = b.map(n -> (Integer) n + 1); //  Integer型にキャストすることで、コンパイルエラーを解消するパターン.
    stream.forEach(n -> System.out.println(n));

    Stream<Integer> c = Stream.of(1, 2, 3);
    stream = c.map(n -> (n + 1)); // 型が明示されているため、キャストは不要。
    stream.forEach(n -> System.out.println(n));
  }
}
