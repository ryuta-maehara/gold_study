package mock_exam.q38;

import java.util.function.Predicate;

public class Sample {

  public static void main(String[] args) throws Exception {

    Predicate<String> sample = s -> s.length() < 5;
    String testString = "Hello, World!";
    if (sample.test(testString)) {
      System.out.println("The string is longer than 5 characters.");
    } else {
      System.out.println("The string is 5 characters or shorter.");
    }
  }
}
