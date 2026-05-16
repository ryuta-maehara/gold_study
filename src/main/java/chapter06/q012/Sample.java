package chapter06.q012;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample {
  public static void main(String[] args) throws Exception {
    // gradleだとプロジェクトルートがカレントディレクトリになるため、src/main/java/chapter06/q012/sample.txtを指す必要がある。
    // Path path = Paths.get("sample.txt"); //

    String pathStr = "src/main/java/chapter06/q012/sample.txt";
    Path path =
        Paths.get(
            pathStr); // gradleだとプロジェクトルートがカレントディレクトリになるため、src/main/java/chapter06/q012/sample.txtを指す必要がある。
    System.out.println(path.toAbsolutePath());

    Path path2 =
        Paths.get(
            "src",
            "main",
            "java",
            "chapter06",
            "q012",
            "sample.txt"); // getメソッドはOSに依存しないパス区切り文字を自動で使用してPathオブジェクトを取得することもできる。
    System.out.println(path2.toAbsolutePath());

    path = new File(pathStr).toPath(); // java.io.FileクラスのtoPath()メソッドを使用してPathオブジェクトを取得することもできる。
    System.out.println(path.toAbsolutePath());

    File file = path.toFile(); // Pathオブジェクトからjava.io.Fileオブジェクトを取得することもできる。
    System.out.println(file.getAbsolutePath());
  }
}
