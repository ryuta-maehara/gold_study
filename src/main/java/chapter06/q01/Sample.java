package chapter06.q01;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Sample {
  public static void main(String[] args) throws IOException {
    File file = new File("src/main/java/chapter06/q01/sample.txt");
    if (file.exists() == false) {
      file.createNewFile();
    }
    System.out.println(file.getAbsolutePath());
    System.out.println(file.getPath());
    System.out.println(file.getName());
    System.out.println(file.exists());

    FileReader reader = new FileReader(file.getPath());
    try (reader) {
      System.out.println((char) reader.read());

    } catch (Exception e) {
    }
  }
}
