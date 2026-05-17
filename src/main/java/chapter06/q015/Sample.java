package chapter06.q015;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Sample {
  public static void main(String[] args) throws Exception {
    Path path = Paths.get("src/main/java/chapter06/q015/sample.txt");
    if (Files.exists(path) == false) { // ファイルが存在しない場合は作成
      Files.createFile(path);
    }

    Path outFile = Paths.get("src/main/java/chapter06/q015/sample_bk.txt");
    Files.copy(path, outFile, StandardCopyOption.REPLACE_EXISTING); // ファイルをコピー（既に存在する場合は上書き）

    Path dir = Paths.get("src/main/java/chapter06/q015/subdir/sample_bk.txt");
    Files.move(path, dir, StandardCopyOption.REPLACE_EXISTING); // ファイルを移動（既に存在する場合は上書き）
  }
}
