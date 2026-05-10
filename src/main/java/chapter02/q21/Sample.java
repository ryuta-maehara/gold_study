package chapter02.q21;

import java.util.function.BinaryOperator;

public class Sample {
  public static void main(String[] args) {
    BinaryOperator<String> b = (s1, s2) -> s1.concat(s2);
    System.out.println(b.apply("Hello, ", "World!"));

    // ファクトリクラスを使って処理を隠蔽し、関数型インターフェースを返すメソッドを呼び出す
    // これにより、可読性が向上し、コードの再利用性も高まる
    BinaryOperator<Integer> addOperator = OperatorFactory.add();
    System.out.println(addOperator.apply(10, 20));
  }
}
