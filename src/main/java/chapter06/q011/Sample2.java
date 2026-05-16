package chapter06.q011;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Sample2 {
  public static void main(String[] args) throws Exception {

    ObjectInputStream in =
        new ObjectInputStream(new FileInputStream("src/main/java/chapter06/q011/emp.ser"));

    try (in) {
      // ファイルからEmployeeクラスのインスタンスを読み込むためにreadObjectメソッドを使用.
      // 戻り値はObject型なので、Employeeクラスのインスタンスにキャストする必要がある.
      Employee emp = (Employee) in.readObject();
      System.out.println(emp);
    }
  }
}
