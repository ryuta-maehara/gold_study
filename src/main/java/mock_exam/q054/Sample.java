package mock_exam.q054;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.IntStream;

public class Sample {
  public static void main(String[] args) {
    // CopyOnWriteArrayListはスレッドセーフなリスト。
    // 要素の追加や削除が行われるたびに内部的に新しい配列を作成する。
    // そのため、イテレーション中に要素が変更されてもConcurrentModificationExceptionが発生しない。
    List<Integer> data = new CopyOnWriteArrayList<>();
    try (ExecutorService executor =
        Executors.newFixedThreadPool(2)) { // スレッドプールを作成する。ここでは、2つのスレッドを使用する固定サイズのスレッドプールを作成している。

      CyclicBarrier barrier =
          new CyclicBarrier(
              3,
              () ->
                  System.out.println(
                      "All threads"
                          + " have"
                          + " reached"
                          + " the barrier.")); // 3つのスレッドが待機するためのCyclicBarrierを作成する。すべてのスレッドが待機状態になると、指定されたRunnableが実行される。

      IntStream.range(0, 6) // 0から5までの整数を生成する。returnはIntStream。
          .parallel() // IntStreamの要素を並列に処理する。
          .forEach(
              n -> // 各整数に対して、スレッドプールのスレッドを使用して処理を実行する。
              executor.execute(
                      () -> {
                        try {
                          data.add(n); // 0から5までの整数をリストに追加する。
                          barrier.await(
                              3,
                              TimeUnit
                                  .SECONDS); // 3秒間バリアで待機する。すべてのスレッドがこのポイントに到達するまで、各スレッドは待機状態になる。
                          // このサンプルの場合、CycleBarrierは3つのスレッドが待機するように設定されているため、3つのスレッドがこのポイントに到達するまで、各スレッドは待機状態になり、意図的にTimeoutExceptionが発生するようになっている。
                        } catch (InterruptedException
                            | BrokenBarrierException
                            | TimeoutException e) {
                          System.err.println(
                              "Exception occurred: "
                                  + e.getClass().getName()
                                  + " - "
                                  + e.getMessage());
                        }
                      }));
    }
  }
}
