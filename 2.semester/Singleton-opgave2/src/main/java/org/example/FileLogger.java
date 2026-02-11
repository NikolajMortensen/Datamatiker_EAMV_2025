package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class FileLogger {
    private static FileLogger instance;
    private PrintWriter writer;
    private static boolean isClosed = false;

    private FileLogger() {
        try {
            writer = new PrintWriter(new FileWriter("log.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static FileLogger getInstance() {
        if (isClosed == true) {
            return null;
        } else if (instance == null){
            instance = new FileLogger();
        }
        return instance;
    }

    public boolean register(String message) {
        if (isClosed) return false;

        try {
            LocalDateTime time = LocalDateTime.now();
            writer.println(time + ": " + message);
            writer.flush();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean close() {
        isClosed = true;

        if (writer != null) {
            writer.close();
        }
        return true;
    }

}
