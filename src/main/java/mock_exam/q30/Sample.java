package mock_exam.q30;

import java.util.Random;
import java.util.function.Supplier;

public class Sample {

  public static void main(String[] args) {
    Supplier<Integer> s = () -> new Random().nextInt(10);
    System.out.println(s.get());
  }
}
