package chapter06.q04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Sample {
  public static void main(String[] args) throws Exception {
    File file = new File("src/main/java/chapter06/q04/sample.txt");
    BufferedReader reader = new BufferedReader(new FileReader(file.getPath()));
    try (reader) {
      reader.lines().forEach(System.out::println);
    }
  }
}
