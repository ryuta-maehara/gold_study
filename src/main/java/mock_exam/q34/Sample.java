package mock_exam.q34;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class Sample {

  public static void main(String[] args) throws Exception {

    SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();

    publisher.subscribe(
        new Flow.Subscriber<>() {
          private Flow.Subscription subscription;

          @Override
          public void onSubscribe(Flow.Subscription subscription) {
            this.subscription = subscription;
            // 1.リクエストの数を設定
            subscription.request(2); // 最初のリクエストを2に設定しているため、データが受信される
            // subscription.request(0); //
            // 最初のリクエストを0に設定しているため、データが受信されない.この場合、orErrrorメソッドの引数にIllegalArgumentExceptionが渡される.
          }

          @Override
          public void onNext(Integer item) {
            // 3.データを受信した際の処理
            System.out.println("Received: " + item);
            subscription.request(
                1); // 次の1件のデータをリクエストするため、3件目のデータも受信されるようになる。subscription.request(0)を呼び出すと、次のデータは受信されない。
          }

          @Override
          public void onError(Throwable throwable) {
            // 4.エラーが発生した際の処理
            System.err.println(
                "Error Type: "
                    + throwable.getClass().getName()
                    + ", Message: "
                    + throwable.getMessage());
          }

          @Override
          public void onComplete() {
            // 5.データの送信が完了した際の処理
            // request以上のデータが送信された場合、onCompleteは呼び出されない。
            // onNextで都度requestを呼び出せば、onSubscribeで設定したrequestの数以上のデータが送信されても、onCompleteは呼び出される。
            System.out.println("Done");
          }
        });

    // 2.データを送信するが、subscritonのrequest受付が2に設定されているため、3は受信されない
    publisher.submit(1);
    publisher.submit(2);
    publisher.submit(3);
    publisher.close(); // 6.データの送信を完了

    Thread.sleep(500); // メインスレッドが終了する前に、非同期で処理される可能性のあるデータを待機
  }
}
