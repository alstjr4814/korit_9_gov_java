package com.korit.study.ch34.chat;

import javax.swing.*;
import java.awt.*;

class MainPanel extends JPanel {
    private JPanel topPanel;
    private JPanel centerPanel;
    private JPanel bottomPanel;

    public MainPanel(LayoutManager layout) {
        super(layout);
        this.setSize(600, 500);
        this.setVisible(true);
        topPanel = new TopPanel(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);

        centerPanel = new CenterPanel(new BorderLayout(10, 10));
        add(centerPanel, BorderLayout.CENTER);

        bottomPanel = new BottomPanel(new BorderLayout(10, 10));
        add(bottomPanel, BorderLayout.SOUTH);
    }

    class TopPanel extends JPanel {
        private JLabel titleLabel;

        public TopPanel(LayoutManager layout) {
            super(layout);
            titleLabel = new JLabel("채팅 클라이언트");
            add(titleLabel, BorderLayout.BEFORE_FIRST_LINE);
            setSize(getMaximumSize());
            setVisible(true);
        }

    }

    class CenterPanel extends JPanel {
        private JTextArea chatTextArea;

        public CenterPanel(LayoutManager layout) {
            super(layout);
            chatTextArea = new JTextArea();
            chatTextArea.setEnabled(false);
            chatTextArea.setVisible(true);
            add(chatTextArea, BorderLayout.CENTER);
            setVisible(true);
        }

    }

    class BottomPanel extends JPanel {
        private JTextField messageField;
        private JButton sendButton;

        public BottomPanel(LayoutManager layout) {
            super(layout);
            messageField = new JTextField();
            messageField.setSize(500, 70);
            messageField.setVisible(true);

            sendButton = new JButton("전송");
            sendButton.setSize(80, 70);
            sendButton.setVisible(true);

            add(messageField, BorderLayout.CENTER);
            add(sendButton, BorderLayout.EAST);
            setVisible(true);
        }

    }
}

public class MainForm extends JFrame {
    private JPanel mainPanel;

    public MainForm() {
        mainPanel = new MainPanel(new BorderLayout(5, 5));
        setContentPane(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setVisible(true);

    }

}
