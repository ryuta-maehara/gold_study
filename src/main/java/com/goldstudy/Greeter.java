package com.goldstudy;

public class Greeter {
    public String buildGreeting(String name) {
        if (name == null || name.isBlank()) {
            return "こんにちは、Guestさん! Javaサンプルへようこそ。";
        }

        return "こんにちは、" + name + "さん! Javaサンプルへようこそ。";
    }
}
