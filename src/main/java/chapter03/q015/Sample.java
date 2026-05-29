package chapter03.q015;

import java.util.Arrays;
import java.util.List;

public class Sample {
  public static void main(String[] args) {
    List<Value> list =
        Arrays.asList(new Value("A"), new Value("B"), new Value("A"), new Value("C"));

    long size = list.stream().distinct().count(); // distinct()は、hashCode()とequals()を使用して重複を判断する。
    // 常に同じハッシュコードを返し、常に等しいとするため、重複がないとみなされる. AもBもCも同じとみなされるため、結果は1になる.
    // まずはhashCode()が呼び出され、すべての要素が同じハッシュコードを返す
    // 次にequals()が呼び出される。equals()は常にtrueを返すため、すべての要素が等しいとみなされる。したがって、distinct()は1つの要素しか残さない。
    System.out.println(
        "Distinct count: " + size); // 常に等しいとするため、重複がないとみなされる. AもBもCも同じとみなされるため、結果は1になる.
  }
}
