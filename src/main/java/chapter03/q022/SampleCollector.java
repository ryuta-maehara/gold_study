package chapter03.q022;

import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class SampleCollector implements Collector<String, StringBuilder, String> {

  // 1.処理途中の値を保持するためのオブジェクトを生成するラムダ式を提供する
  @Override
  public Supplier<StringBuilder> supplier() {
    return StringBuilder::new;
  }

  // 2.具体的に処理を行うBiConsumerのラムダ式を提供する
  @Override
  public BiConsumer<StringBuilder, String> accumulator() {

    // 例えば、文字列をカンマ区切りで連結する処理を行う場合の例
    return (builder, str) -> {
      if (builder.length() != 0) {
        builder.append(",");
      }
      builder.append(str);
    };
  }

  // 3.並列処理を行う場合に、複数の処理途中の値を結合するためのBinaryOperatorのラムダ式を提供する
  @Override
  public BinaryOperator<StringBuilder> combiner() {
    return (a, b) -> {
      // 例えば、文字列をカンマ区切りで連結する処理を行う場合の例
      if (a.length() != 0) {
        // 既にaに値がある場合は、bを結合する前にカンマを追加する
        a.append(",");
      }
      a.append(b);
      return a;
    };
  }

  // 4.処理結果を戻すラムダ式を提供する
  @Override
  public Function<StringBuilder, String> finisher() {
    return StringBuilder::toString;
  }

  // 5.コレクタの特性を定義する
  @Override
  public Set<Characteristics> characteristics() {
    // この例の場合、特性は定義されていないため、空のセットを返す
    return EnumSet.noneOf(Characteristics.class);
  }
}
