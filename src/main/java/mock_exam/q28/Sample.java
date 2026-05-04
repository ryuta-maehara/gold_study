package mock_exam.q28;

import java.io.FileOutputStream;
import java.io.IOException;

public class Sample {

  public static void main(String[] args) throws IOException {
    String filePath = "src/main/java/mock_exam/q28/";
    String fileName = "sample.txt";
    try (FileOutputStream fos = new FileOutputStream(filePath + fileName, false)) {
      fos.write("Hello, World!".getBytes());
    }
  }
}
