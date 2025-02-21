package com.jad.dogfight.view;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class TextWindow extends JFrame {
    public static final float FONT_SIZE = 6f;
    private static final Dimension SCREEN_DIMENSION = new Dimension(600, 150);
    private final JTextArea textArea = new JTextArea();
    private final JLabel label = new JLabel();

    public TextWindow() {
        this("No title");
    }

    public TextWindow(final String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        final Font font;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT,
                                   Objects.requireNonNull(
                                           TextWindow.class.getResourceAsStream("/CascadiaMono.ttf"))).deriveFont(
                    TextWindow.FONT_SIZE);
        } catch (final FontFormatException | IOException exception) {
            throw new RuntimeException(exception);
        }
        this.setLayout(new BorderLayout());
        this.textArea.setFont(font);
        this.textArea.setEditable(false);
        this.textArea.setForeground(Color.BLACK);
        this.textArea.setBackground(Color.WHITE);
        final JPanel panel = new JPanel();
        this.add(panel, BorderLayout.CENTER);
        panel.add(this.textArea);
        panel.add(this.label);
        this.setVisible(true);
    }

    public void setScreen(final String screen) {
        this.textArea.setText(screen);
    }

    public void close() {
        this.dispose();
    }

    public void showInfo(final String info) {
        this.label.setText(info);
    }
}
