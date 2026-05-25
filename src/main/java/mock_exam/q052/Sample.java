package mock_exam.q052;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class Sample {
  public static void main(String[] args) throws IOException {
    int c = 0;
    StringBuilder sb = new StringBuilder();

    Path path = Path.of("src/main/java/mock_exam/q052/data.txt");
    try (FileReader reader = new FileReader(path.toFile())) {
      while ((c = reader.read()) != -1) {
        sb.append((char) c);
      }
    }
    System.out.println(sb.toString());
  }
}
