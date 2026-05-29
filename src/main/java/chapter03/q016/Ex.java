package chapter03.q016;

import java.util.List;

public class Ex {
  public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    list.stream().findAny().ifPresent(System.out::println); // findAnyは1から10のいずれかが出力される。

    list.parallelStream().findAny().ifPresent(System.out::println); // findAnyは1から10のいずれかが出力される。

    list.stream().findFirst().ifPresent(System.out::println); // findFirstは要素の先頭が出力されるため、1が出力される。

    list.parallelStream()
        .findFirst()
        .ifPresent(System.out::println); // findFirstは要素の先頭が出力されるため、1が出力される（ストリームパイプラインで処理した順番ではない。)
  }
}
