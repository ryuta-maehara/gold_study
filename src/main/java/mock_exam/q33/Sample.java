package mock_exam.q33;

import java.util.ArrayList;
import java.util.List;

public class Sample {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>(); // ジェネリクスを指定していないため、Object型のリストとなる
    // List list = new ArrayList<Integer>(); // ジェネリクスを指定していないため、Object型のリストとなる
    list.add(Integer.valueOf(1));
    list.add(Integer.valueOf(2));
    list.add(Integer.valueOf(3));

    // list.forEach(
    //     n -> System.out.println(n.x())); // Object型のリストなので、nはObject型となり、x()メソッドは存在しないためコンパイルエラー
  }
}
