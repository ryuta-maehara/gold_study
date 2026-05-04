package mock_exam.q40;

import java.util.List;

public class Sample {

  public static void main(String[] args) throws Exception {
    List<Integer> list = List.of(10, 20, 30, 40, 50);
    var result = list.stream().anyMatch(i -> i > 30);
    System.out.println(result);
  }
}
