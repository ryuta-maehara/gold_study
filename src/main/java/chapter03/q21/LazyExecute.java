package chapter03.q21;

import java.util.function.Consumer;

public class LazyExecute {
  public static void execute(Consumer<String> c) {
    c.accept("Hello");
  }
}
