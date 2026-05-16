package chapter06.q09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample {
  public static void main(String[] args) throws FileNotFoundException {
    List<PostCode> list = createList("src/main/java/chapter06/q09/postalcode.csv");
    list.forEach(System.out::println);
  }

  private static List<PostCode> createList(String path) throws FileNotFoundException {

    List<PostCode> list = new ArrayList<>();
    FileInputStream fis = new FileInputStream(path);
    Scanner scanner = new Scanner(fis);
    scanner.useDelimiter(",|\n");

    try (scanner) {
      while (scanner.hasNext()) {
        // String code = scanner.next(); //
        // String prefecture = scanner.next();
        // String district = scanner.next();
        // String town = scanner.next();
        // list.add(new PostCode(code, prefecture, district, town));
        scanner.next(); // 全国地方公共団体コード
        scanner.next(); // 郵便番号(5桁)
        String code = scanner.next().replaceAll("\"", ""); // 郵便番号(7桁)

        scanner.next(); // 都道府県名カナ
        scanner.next(); // 市町村名カナ
        scanner.next(); // 町域名カナ
        String prefecture = scanner.next().replaceAll("\"", ""); // 都道府県名
        String district = scanner.next().replaceAll("\"", ""); // 市町村名
        String town = scanner.next().replaceAll("\"", ""); // 町域名

        list.add(new PostCode(code, prefecture, district, town));
      }
    }

    return list;
  }
}
