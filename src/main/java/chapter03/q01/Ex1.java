package chapter03.q01;

import java.util.Optional;

public class Ex1 {
  public static void main(String[] args) {
    // Optional<String> sample = Optional.of(null); // of()はnullを許容しないため、NullPointerExceptionが発生する
    // System.out.println(sample);

    Optional<String> sample2 =
        Optional.ofNullable(null); // ofNullable()はnullを許容するため、空のOptionalが返される
    // System.out.println(sample2.get()); // get()は値が存在しない場合にNoSuchElementExceptionが発生するため、注意が必要
    System.out.println(sample2.orElse("default")); // orElse()を使うと、値が存在しない場合にデフォルト値を返すことができる

    Optional<String> sample3 =
        Optional.ofNullable("test"); // ofNullable()に値を渡すと、その値を持つOptionalが返される
    System.out.println(sample3.get());

    Optional<String> sample4 = Optional.empty(); // 空のOptionalを作成する
    System.out.println(sample4);
  }
}
