package chapter06.q06;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Sample {
  public static void main(String[] args) throws Exception {
    File file = new File("src/main/java/chapter06/q06/sample.txt");
    try (BufferedWriter writer =
        new BufferedWriter(new FileWriter(file.getPath(), true))) { // 追記モードでファイルを開く
      writer.write("Hello, World!");
      writer.newLine(); // 改行を追加
      writer.flush(); // バッファをフラッシュして内容をファイルに書き込む

      writer.write("Hello, World2!"); // バッファに書き込むが、この時点ではファイルには反映されない
      // flushを呼び出さなくても、最終的にはHello, World2!もファイルに書き込まれるが、flushを呼び出すことで即座に反映される
    }

    // try (BufferedWriter writer =
    //     new BufferedWriter(new FileWriter(file.getPath(), false))) { // 上書きモードでファイルを開く
    //   writer.write("Overwrite mode");
    //   writer.newLine(); // 改行を追加
    // }
  }
}
