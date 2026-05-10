package chapter03.q026;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("banana", "apple", "orange");
    Stream<String> stream = list.stream();
    Set keys =
        stream
            .collect(
                Collectors.partitioningBy(
                    str -> str.length() > 5) // 文字列の長さが5より大きいかどうかで分割する。returnはMap<Boolean,
                // List<String>。この場合bananaはtrue、appleとorangeはfalseになる。
                )
            .keySet(); // partitioningByはMapを返すため、keySet()でキーのセットを取得する。この場合、キーはtrueとfalseの2つになる。
    keys.forEach(System.out::println);

    list.stream()
        .collect(
            Collectors.partitioningBy(
                str ->
                    str.length()
                        > 5)) // partitioningByはMapを返すため、keySet()でキーのセットを取得する。この場合、キーはtrueとfalseの2つになる。
        .forEach(
            (key, value) ->
                System.out.println(
                    key + ": " + value)); // partitioningByはMapを返すため、forEachでキーと値を出力する。この場合、true:
    // [banana]、false: [apple, orange]となる。

    Stream<String> peekSample = list.stream();
    peekSample
        .filter(
            str ->
                str.length()
                    > 5) // filter()はストリームの要素をフィルタリングするためのメソッドで、引数にPredicateを取る。ここでは、文字列の長さが5より大きいものだけを残すためにstr -> str.length() > 5を渡している。
        .peek(
            str ->
                System.out.println(
                    "filter: "
                        + str)) // peek()はストリームの要素を処理するためのメソッドで、引数にConsumerを取る。ここでは、ストリームの要素を出力するためにSystem.out::printlnを渡している。
        .map(str -> str.toUpperCase())
        .peek(
            str ->
                System.out.println(
                    "upper: "
                        + str)) // map()はストリームの要素を変換するためのメソッドで、引数にFunctionを取る。ここでは、文字列を大文字に変換するためにstr -> str.toUpperCase()を渡している。
        .forEach(
            str ->
                System.out.println(
                    "result: "
                        + str)); // forEach()はストリームの要素を処理するためのメソッドで、引数にConsumerを取る。ここでは、ストリームの要素を出力するためにSystem.out::printlnを渡している。
  }
}
