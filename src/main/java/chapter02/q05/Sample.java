package chapter02.q05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Sample {
  public static void main(String[] args) {

    List<PredicateSample> list =
        Arrays.asList(new PredicateSample(10), new PredicateSample(20), new PredicateSample(30));

    Predicate<PredicateSample> x = s -> list.contains(s); // list.contains()はequals()を呼び出すため、PredicateSampleクラスでequals()をオーバーライドする必要がある

    if (x.test(new PredicateSample(20))) { // equals()をオーバーライドしていないため、別のオブジェクトを渡してもfalseが返される
      System.out.println("true");
    }
  }
}
