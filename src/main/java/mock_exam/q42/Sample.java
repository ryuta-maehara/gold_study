package mock_exam.q42;

import java.util.stream.Stream;

public class Sample {

  public static void main(String[] args) throws Exception {
    Stream<Item> stream =
        Stream.of(new Item("apple", 100), new Item("banana", 80), new Item("orange", 120));

    Integer result =
        stream
            .filter(item -> item.price() >= 100)
            .map(item -> item.price())
            .reduce(0, Integer::sum);

    System.out.println(result);
  }
}
