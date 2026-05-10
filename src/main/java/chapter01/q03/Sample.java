package chapter01.q03;

import java.util.ArrayList;
import java.util.List;

public class Sample {

  public static void main(String[] args) {

    // 変数への代入
    List<String> list = new ArrayList<>();

    // メソッド呼び出しの引数
    execute(new ArrayList<>());
  }

  private static List<String> test() {
    // return文
    return new ArrayList<>();
  }

  private static void execute(List<String> list) {
    // do something
  }
}
