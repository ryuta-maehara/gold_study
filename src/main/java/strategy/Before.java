package strategy;

public class Before {

  public static void main(String[] args) throws InterruptedException {
    // スレッドを作成して実行する
    Thread thread = new Thread(new Function());
    thread.start();
    thread.join(); // スレッドの終了を待つ
    System.out.println("finish.");
  }
}

// Runnableインターフェースを実装したクラス.このような簡単なクラスでも、わざわざクラスを作成する必要があるため、コードが冗長になってしまう。
class Function implements Runnable {
  @Override
  public void run() {
    // 処理内容
    System.out.println("hello.");
  }
}
