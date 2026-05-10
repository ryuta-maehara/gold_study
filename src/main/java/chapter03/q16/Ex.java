package chapter03.q16;

import java.util.List;

public class Ex {
  public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    list.stream().findAny().ifPresent(System.out::println); // 1が出力される（シーケンシャルストリームの場合、最初の要素が返されるため）

    list.parallelStream()
        .findAny()
        .ifPresent(System.out::println); // 1から10のいずれかが出力される（並列ストリームの場合、どの要素が返されるかは保証されないため）

    list.stream()
        .findFirst()
        .ifPresent(System.out::println); // 1が出力される（シーケンシャルストリームの場合、最初の要素が返されるため）

    list.parallelStream()
        .findFirst()
        .ifPresent(System.out::println); // 1が出力される（並列ストリームの場合も、最初の要素が返されるため）
  }
}
