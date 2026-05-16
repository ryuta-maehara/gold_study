package chapter06.q011;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sample {
  public static void main(String[] args) throws Exception {
    ObjectOutputStream out =
        new ObjectOutputStream(new FileOutputStream("src/main/java/chapter06/q011/emp.ser"));
    try (out) {
      Employee employee = new Employee("John Doe", "123-456-7890");
      out.writeObject(
          employee); // Employeeクラスのインスタンスをファイルに保存するためにwriteObjectメソッドを使用.Serializableインターフェースを実装している必要がある.
    }
  }
}
