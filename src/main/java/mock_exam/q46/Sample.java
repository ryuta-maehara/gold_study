package mock_exam.q46;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {

  public static void main(String[] args) throws Exception {
    String filePath = "src/main/java/mock_exam/q46/";
    String fileName = "sample.txt";
    try (Stream<String> data = Files.lines(Paths.get(filePath + fileName))) {
      Map<String, Long> result =
          data.flatMap(line -> Arrays.stream(line.split("\\W+")))
              .filter(word -> !word.isEmpty())
              .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

      result.forEach((word, count) -> System.out.println(word + ":" + count));

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
