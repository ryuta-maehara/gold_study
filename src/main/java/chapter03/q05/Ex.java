package chapter03.q05;

import java.util.Optional;

public class Ex {
  public static void main(String[] args) {
    Optional<String> optional = Optional.of("Hello, World!");
    optional.ifPresent(System.out::println); // "Hello, World!"が出力される
    System.out.println(optional.isPresent()); // true
    optional.ifPresentOrElse(
        System.out::println, () -> System.out.println("値が存在しません")); // "Hello, World!"が出力される
    optional.map(String::toUpperCase).ifPresent(System.out::println); // "HELLO, WORLD!"が出力される

    Optional<String> emptyOptional = Optional.empty();
    emptyOptional.ifPresent(System.out::println); // 何も出力されない
    System.out.println(emptyOptional.isPresent()); // false
    emptyOptional.ifPresentOrElse(
        System.out::println, () -> System.out.println("値が存在しません")); // "値が存在しません"が出力される
    emptyOptional.map(String::toUpperCase).ifPresent(System.out::println); // 何も出力されない
  }
}
