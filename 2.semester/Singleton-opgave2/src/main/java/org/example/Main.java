package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FileLogger logger = FileLogger.getInstance();

        if (logger != null) {
            for (int i = 1; i <= 10; i++) {
                logger.register("Hændelses nummer " + i);
            }
            logger.close();
        }
        FileLogger loggerAfterClose = FileLogger.getInstance();
        if (loggerAfterClose == null) {
            System.out.println("It is closed correctly.");
        }

    }
}
