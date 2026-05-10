package chapter03.q23;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorSample {
  public static void main(String[] args) {
    var list =
        Arrays.asList(
            new Item(1, ItemType.BOOK, "Java Programming", 1000),
            new Item(2, ItemType.BOOK, "Lamda", 1500),
            new Item(3, ItemType.MAGAZINE, "SoftWare", 980));

    // Collectors.toList()を使用して、ストリームの要素をリストに収集する。
    List<Item> book =
        list.stream().filter(i -> i.getType() == ItemType.BOOK).collect(Collectors.toList());
    book.forEach(
        System.out
            ::println); // [Item{id=1, type=BOOK, name='Java Programming', price=1000}, Item{id=2,
    // type=BOOK, name='Lamda', price=1500}]

    // q022のように、複雑な処理を行う場合は、Collectors.groupingBy()を使用して
    // ストリームの要素をグループ化するなどの方法が必要になる。

    /// toList()の他にも、Collectors.toSet()やCollectors.toMap()などのコレクタもある。
  }
}
