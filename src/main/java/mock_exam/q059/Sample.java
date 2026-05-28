package mock_exam.q059;

import java.util.HashMap;
import java.util.Map;

public class Sample {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "A");
    map.put(2, "B");
    map.put(1, "C");
    System.out.println(map);
    map.put(3, "D");
    System.out.println(map);
  }
}
