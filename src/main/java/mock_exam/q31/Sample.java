package mock_exam.q31;

import java.util.List;

public class Sample {

  public static void main(String[] args) {
    List<Integer> values = List.of(10, 20, 30, 40, 50);
    // double result = values.stream().mapToInt(d -> d).average().getAsDouble();
    double result = values.stream().mapToDouble(d -> d).average().getAsDouble();
    System.out.println(result);
  }
}
