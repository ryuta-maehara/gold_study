package chapter06.q010;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Sample2 {
  public static void main(String[] args) throws Exception {

    FileInputStream fis = new FileInputStream("src/main/java/chapter06/q010/sample.ser");
    ObjectInputStream in = new ObjectInputStream(fis);

    try (in) {
      Object obj = in.readObject();
      Item item = (Item) obj; // ファイルから読み込んだオブジェクトをItemクラスのインスタンスにキャストする必要がある
      System.out.println(item);
    }
  }
}
