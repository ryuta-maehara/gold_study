package chapter05.q03;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    BankAccount account = new BankAccount();

    Thread t1 =
        new Thread(
            () -> {
              for (int i = 0; i < 1000; i++) {
                account.deposit(1);
              }
            });

    Thread t2 =
        new Thread(
            () -> {
              for (int i = 0; i < 1000; i++) {
                account.deposit(1);
              }
            });

    t1.start();
    t2.start();

    t1.join(); // t1を待機する
    t2.join(); // t2を待機する

    System.out.println("最高残高: " + account.getBalance());
  }
}

class BankAccount {
  private int balance;

  // synchroniszedされていないため、複数のスレッドから同時に呼び出されると、正しい結果が得られない可能性がある
  // 　今回の場合、1000から2000の値が出力される可能性がある
  public void deposit(int amount) {
    balance = balance + amount;
  }

  // synchronizedを付与することで、複数のスレッドから同時に呼び出されても、正しい結果が得られるようになる
  // 今回の場合、必ず2000が出力されるようになる
  //   public synchronized void deposit(int amount) {
  //     balance = balance + amount;
  //   }

  public int getBalance() {
    return balance;
  }
}
