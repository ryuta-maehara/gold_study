package chapter03.q06;

import java.util.Optional;

public class Sample {
  public static void main(String[] args) {
    Optional<String> sample = Optional.empty();
    sample.ifPresentOrElse( // Optionalが値を持っている場合と持っていない場合の処理を定義
        // Consumer<String>とRunnableを引数に取る
        // 値を持っている場合の処理はConsumer<String>で、引数のstrを出力する
        // 値を持っていない場合の処理はRunnableで、"empty"を出力する
        (str) -> System.out.println(str), () -> System.out.println("empty"));
  }
}
