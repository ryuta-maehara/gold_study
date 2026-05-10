package chapter03.q04;

import java.util.Optional;

public class Ex {
  public static void main(String[] args) {
    Optional<String> sample = Optional.empty(); // 空のOptionalを作成する

    try {
      System.out.println(
          sample.orElseThrow(
              () -> new Exception("値が存在しません"))); // orElseThrow()を使うと、値が存在しない場合に例外をスローすることができる.
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
