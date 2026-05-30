package mock_exam.q043;

import java.util.stream.Stream;

public class Sample {
  public static void main(String[] args) {
    Stream<Item> stream =
        Stream.of(new Item("apple", 100), new Item("banana", 80), new Item("orange", 120));

    Integer result =
        stream
            .filter(item -> item.price() >= 100)
            .map(item -> item.price())
            .reduce(0, Integer::sum); // 0は初期値、Integer::sumは合計を求めるためのメソッド参照
    System.out.println(result);
  }
}

record Item(String name, int price) {}
