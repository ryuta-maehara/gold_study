package chapter03.q017;

import java.util.Arrays;
import java.util.List;

public class Ex {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);
    list.stream()
        .sorted(
            (a, b) -> {
              if (a < b) return -1;
              if (b > a) return 1;
              return 0;
            })
        .forEach(System.out::println);

    List<Item> items = Arrays.asList(new Item("B"), new Item("D"), new Item("C"));
    // 自然順序で並べ替えができないクラスの場合、Comparatorをラムダ式で定義して渡すことができる
    items.stream().sorted((i1, i2) -> i1.name().compareTo(i2.name())).forEach(System.out::println);
  }
}

record Item(String name) {}
