package com.goldstudy;

public class App {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        String name = inputReader.askName();

        Greeter greeter = new Greeter();
        System.out.println(greeter.buildGreeting(name));
    }
}
