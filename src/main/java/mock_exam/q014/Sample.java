package mock_exam.q014;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("C", "B", "A", "D");
    // list.sort((a, b) -> a.compareTo(b)); // 昇順
    Collections.sort(list);
    list.forEach(e -> System.out.printf("%s ", e));
  }
}
