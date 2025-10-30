package com.korit.study.ch34.chat;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JPanel textFiledPanel = new JPanel(new GridLayout(1, 2, 5, 5));
        JTextField ipFiled = new JTextField();
        ipFiled.setSize(150, 50);

        JTextField portFiled = new JTextField();
        portFiled.setSize(150, 50);
        textFiledPanel.add(ipFiled);
        textFiledPanel.add(portFiled);

        JButton connectButton = new JButton("접속");

        JDialog connectionDialog = new JDialog();
        connectionDialog.setContentPane(new JPanel(new BorderLayout(5, 5)));
        connectionDialog.setName("클라이언트 접속");
        connectionDialog.add(textFiledPanel, BorderLayout.CENTER);
        connectionDialog.add(connectButton, BorderLayout.SOUTH);
        connectionDialog.setSize(300, 100);
        connectionDialog.setVisible(true);

        new MainForm();

    }
}
