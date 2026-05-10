package chapter03.q03;

import java.util.Optional;

public class Ex {
  public static void main(String[] args) {
    Optional<String> sample = Optional.of("A");
    System.out.println(sample.orElse("B")); // orElseは値が存在する場合はその値を返し、存在しない場合は引数の値を返す
  }
}
