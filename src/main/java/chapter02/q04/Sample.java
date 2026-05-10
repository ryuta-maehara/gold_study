package chapter02.q04;

public class Sample {
  public static void main(String[] args) {
    // int cnt = 0; // ラムダ式はスコープ外の変数を参照できるが、その変数は実質的にfinalでなければならない。変更しようとすると、コンパイルエラーになる。
    Runnable r =
        () -> {
          int cnt = 0; // こちらのスコープならば、Runnable内で使用できる
          for (cnt = 0; cnt < 10; cnt++) { // cntはローカル変数ではないため、Runnable内で使用できない
            System.out.println(cnt++);
          }
        };
    new Thread(r).start();
  }
}
