package chapter03.q21;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SampleCollector {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    Consumer<String> c =
        str -> {
          list.add(str);
        };
    LazyExecute.execute(c);
    System.out.println(list.size());
  }
}
