package org.example;

public class Main {
    public static void main(String[] args) {
        DebugWindow debugWindow = DebugWindow.getInstance();

        for (int i = 0; i < 100; i++) {
            debugWindow.message("Hej");
        }
    }

}
