package mock_exam.q23;

import java.time.LocalDate;
import java.time.chrono.JapaneseChronology;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Sample {

  public static void main(String[] args) throws InterruptedException {

    DateTimeFormatter dtf =
        DateTimeFormatter.ofPattern("GGGGyy年MM月dd日EEEE")
            .withChronology(JapaneseChronology.INSTANCE)
            .withLocale(Locale.JAPANESE);
    System.out.println(dtf.format(LocalDate.now()));
  }
}
