package chapter03.q018;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(5, 4, 2, 3, 1);
    // mapは、ストリームの要素を別の要素に変換するためのメソッド
    // この例では、IntegerをStringのStreamに変換している
    Stream<String> stringList = list.stream().map(n -> String.valueOf(n));
    stringList.forEach(System.out::println);
  }
}
