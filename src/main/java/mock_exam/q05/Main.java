package q05;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        System.out.println(Locale.JAPAN);
        System.out.println(new Locale.Builder().setLanguage("ja").setRegion("JP").build());
        // System.out.println(Locale.getInstance("ja_JP"));
        // System.out.println(Locale.JAPANSE);

        // System.out.println(Locale.getDefault());
    }
}
