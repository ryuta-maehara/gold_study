package mock_exam.q41;

import java.util.ArrayList;
import java.util.List;

public class Sample {

  public static void main(String[] args) throws Exception {
    List<Item> items =
        List.of(new Item("apple", 100), new Item("banana", 80), new Item("orange", 120));

    List<String> names = new ArrayList<String>();
    for (Item item : items) {
      names.add(item.name());
    }
    names.replaceAll(n -> n.toUpperCase());

    System.out.println(names);
  }
}
