package chapter06.q03;

import java.io.File;
import java.io.FileReader;

public class Sample {
  public static void main(String[] args) throws Exception {
    File file = new File("src/main/java/chapter06/q06/sample.txt");
    FileReader reader = new FileReader(file.getPath());
    try (reader) {
      int i = 0;
      // reader.read()はEOFになると-1を返す
      while ((i = reader.read()) != -1) {
        char c = (char) i;
        System.out.print(c);
      }
    }
  }
}
