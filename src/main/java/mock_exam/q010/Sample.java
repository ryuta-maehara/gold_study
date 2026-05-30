package mock_exam.q010;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Sample {
  public static void main(String[] args) throws Exception {
    Path a = Path.of("src/main/java/mock_exam/q010/source.txt");
    Path b = Path.of("src/main/java/mock_exam/q010/target.txt");

    // Files.setAttribute(
    //     a, "dos:readonly", true, LinkOption.NOFOLLOW_LINKS); // ファイルを読み取り専用にする。シンボリックリンクをたどらない。
    Files.setAttribute(
        a, "dos:readonly", false, LinkOption.NOFOLLOW_LINKS); // ファイルを読み取り専用でなくする。シンボリックリンクをたどらない。

    Files.copy(a, b, StandardCopyOption.REPLACE_EXISTING); // ファイルが存在する場合は上書きする。

    // Files.copy(
    //     a,
    //     b,
    //     StandardCopyOption
    //         .COPY_ATTRIBUTES); // ファイルの属性もコピーする。ファイルが存在する場合はFileAlreadyExistsExceptionがスローされる。

    // Files.copy(a, b, StandardCopyOption.ATOMIC_MOVE); // 原始的なファイルシステム操作として、ファイルを移動する。

    // Files.readAttributes(
    //     b, PosixFileAttributes.class, LinkOption.NOFOLLOW_LINKS); //
    // ファイルの属性を読み取る。シンボリックリンクをたどらない。
  }
}
