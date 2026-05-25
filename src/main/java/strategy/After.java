package strategy;

public class After {

  public static void main(String[] args) throws InterruptedException {
    // スレッドを作成して実行する. ラムダ式を使用することで、Runnableインターフェースを実装したクラスを作成する必要がなくなり、コードが簡潔になります。
    Runnable r =
        () -> {
          // 処理内容
          System.out.println("hello.");
        };
    Thread thread = new Thread(r);
    thread.start();
    thread.join(); // スレッドの終了を待つ
    System.out.println("finish.");
  }
}
