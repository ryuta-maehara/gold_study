package mock_exam.q44;

import java.util.List;

public class Sample {

  public static void main(String[] args) throws Exception {
    List<String> list = List.of("apple", "banana", "orange");
    list.add(2, "Dragonfruit"); // Immutable Listなので実行時にUnsupportedOperationExceptionが発生する
    list.stream().forEach(s -> System.out.println(s));
  }
}
