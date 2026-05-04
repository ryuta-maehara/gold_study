package mock_exam.q50;

import java.util.List;

public class Sample {

  public static void main(String[] args) throws Exception {
    List<Item> list =
        List.of(new Item("apple", 100), new Item("banana", 200), new Item("orange", 300));
    list.stream().takeWhile(e -> e.name().contains("e")).forEach(System.out::print);
  }
}
