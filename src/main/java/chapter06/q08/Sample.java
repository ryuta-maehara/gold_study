package chapter06.q08;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

public class Sample {
  public static void main(String[] args) throws Exception {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.print("Enter something by System.in : ");
      String input = br.readLine();
      System.out.println("your entered: " + input);
    }

    Console console = System.console();
    String input = console.readLine("Enter something by Console: ");
    System.out.println("your entered: " + input);
  }
}
