package mock_exam.q47;

import java.util.ArrayList;

public class Sample {

  public static void main(String[] args) throws Exception {
    var data = new ArrayList<Long>();
    // data.add(1); // autoboxingにより、int型のIntegerの型に変換されるが、IntegerはLongのサブクラスではないため、コンパイルエラーになる
    data.add(1L); // 1Lのように、明示的にlong型のリテラルを使用する必要がある
    data.add(2L);
    data.add(3L);

    long total = 0;
    for (Long n : data) {
      total += n;
    }

    System.out.println(total);
  }
}
