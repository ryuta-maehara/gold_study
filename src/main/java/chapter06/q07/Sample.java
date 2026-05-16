package chapter06.q07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Sample {
  public static void main(String[] args) throws Exception {
    File file = new File("src/main/java/chapter06/q07"); // 再利用性のため、ファイルパスを変数に格納
    try (BufferedInputStream bis =
        new BufferedInputStream(
            new FileInputStream(
                file.getPath() + "/sample.jpg"))) { // ファイルを読み込むためのBufferedInputStreamを作成

      try (BufferedOutputStream fos =
          new BufferedOutputStream(new FileOutputStream(file.getPath() + "/sample_copy.jpg"))) {
        fos.write(bis.readAllBytes()); // ファイル全体を一度に読み込んで書き込む
        // 1024バイトずつ読み込む方法もあるが、readAllBytes()を使用することでコードが簡潔になる
        // ただし、メモリに大きなファイルを読み込む場合は注意が必要で、readAllBytes()はファイル全体をメモリに読み込むためOutOfMemoryErrorが発生する可能性がある
        // OutOfMemoryErrorを避けるためには、1024バイトずつ読み込む方法を使用することが推奨される
      }

      // while ((data = bis.readNBytes(1024)).length != 0) { // 1024バイトずつ読み込むため、メモリエラーを回避しやすい
      //   fos.write(data); // 読み込んだデータを書き込む
      // }
    }
  }
}
