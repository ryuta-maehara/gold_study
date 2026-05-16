package chapter05.q11;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Sample {
  private static final ReentrantLock lock = new ReentrantLock();

  public static void main(String[] args) {
    Thread t1 = new Thread(() -> doWork("T1"));
    Thread t2 = new Thread(() -> doWork("T2"));

    t1.start();
    t2.start();
  }

  private static void doWork(String name) {
    try {
      // 最大100ミリ秒だけロックを試みる
      if (lock.tryLock(100, TimeUnit.MILLISECONDS)) {
        try {
          System.out.println(name + " got the lock.");
          // ロックを獲得した場合の処理
          Thread.sleep(200); // ロックを保持する時間. この例では200ミリ秒に設定しているため、必ずロックを獲得できないスレッドが発生する
          System.err.println(name + " finished the work.");

        } finally {
          lock.unlock();
        }

      } else {
        // ロックを獲得できなかった場合の処理
        System.out.println(name + " could not get the lock.");
      }
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt(); // 現在のスレッドを割り込まれた状態にする
    }
  }
}
