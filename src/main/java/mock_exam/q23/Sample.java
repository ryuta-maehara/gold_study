package mock_exam.q23;

import java.time.LocalDate;
import java.time.chrono.JapaneseChronology;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Sample {

  public static void main(String[] args) throws InterruptedException {

    DateTimeFormatter dtf =
        DateTimeFormatter.ofPattern("GGGGyy年MM月dd日EEE")
            // GGGGの場合は、紀元を表します。西暦の場合は西暦と表示されます。ja_JPの場合は、和暦(令和など)と表示されます。
            // GGGは、紀元を表します。西暦の場合はADと表示されます。ja_JPの場合は、和暦(令和など)と表示されます。

            // EEEEの場合は、曜日を表現します。水曜日の場合は水曜日と表示されます。
            // EEEは、曜日を表現します。水曜日の場合は水と表示されます。
            .withChronology(JapaneseChronology.INSTANCE)
            .withLocale(Locale.JAPANESE);
    System.out.println(dtf.format(LocalDate.now()));
  }
}
