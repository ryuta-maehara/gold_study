package chapter06.q010;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sample {
  public static void main(String[] args) throws Exception {
    FileOutputStream fos =
        new FileOutputStream(
            "src/main/java/chapter06/q010/sample.ser"); // ファイルにオブジェクトを保存するためのFileOutputStreamを作成
    ObjectOutputStream out = new ObjectOutputStream(fos);
    try (out) {
      Item item = new Item("Book", 1000);
      out.writeObject(
          item); // Itemクラスのインスタンスをファイルに保存するためにwriteObjectメソッドを使用.Serializableインターフェースを実装している必要がある.
    }
  }
}
