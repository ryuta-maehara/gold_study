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
            subscription.request(1); // 最初のリクエストを1に設定しているため、データが受信される
            // subscription.request(0); // 最初のリクエストを0に設定しているため、データが受信されない
          }

          @Override
          public void onNext(Integer item) {
            System.out.println("Received: " + item);
          }

          @Override
          public void onError(Throwable throwable) {
            System.err.println("Error: " + throwable.getMessage());
          }

          @Override
          public void onComplete() {
            System.out.println("Done");
          }
        });

    publisher.submit(1);
    publisher.close();
    Thread.sleep(500); // メインスレッドが終了する前に、非同期で処理される可能性のあるデータを待機
  }
}
