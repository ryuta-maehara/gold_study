package com.goldstudy;

import java.util.Scanner;
import java.util.NoSuchElementException;

public class InputReader {
    public String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前を入力してください: ");
        String input;

        try {
            input = scanner.nextLine();
        } catch (NoSuchElementException ex) {
            return "Guest";
        }

        if (input == null || input.isBlank()) {
            return "Guest";
        }

        return input.trim();
    }
}
