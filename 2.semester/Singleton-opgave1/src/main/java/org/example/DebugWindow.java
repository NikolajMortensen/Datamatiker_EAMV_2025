package org.example;

import javax.swing.*;

public class DebugWindow extends JFrame {
    private static DebugWindow instance;
    private JTextArea jTextArea;

    private DebugWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(jTextArea);
        this.add(scrollPane);
        this.setSize(400, 500);
        this.setVisible(true);
    }

    public static DebugWindow getInstance() {
        if (instance == null) {
            instance = new DebugWindow();
        }
        return instance;
    }

    public void message(String text) {
        jTextArea.append(text + "\n");
    }

}
