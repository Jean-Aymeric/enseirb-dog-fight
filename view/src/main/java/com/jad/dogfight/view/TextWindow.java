package com.jad.dogfight.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Objects;

public class TextWindow extends JFrame {
    public static final float FONT_SIZE = 6f;
    private static final Dimension SCREEN_DIMENSION = new Dimension(600, 150);
    private final JTextArea textArea = new JTextArea();
    private final JLabel label = new JLabel();

    public TextWindow() {
        this("No title");
        this.createActionPerformers();
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

    private void createActionPerformers() {
        final ActionMap actionMap = this.textArea.getActionMap();
        for (final ActionStates actionState : ActionStates.values()) {
            actionMap.put(actionState.getKey() + "-pressed",
                          new AbstractAction(actionState.getKey() + "-pressed") {
                              @Override
                              public void actionPerformed(final ActionEvent event) {
                                  actionState.pressed();
                              }
                          });
            actionMap.put(actionState.getKey() + "-released",
                          new AbstractAction(actionState.getKey() + "-released") {
                              @Override
                              public void actionPerformed(final ActionEvent event) {
                                  actionState.released();
                              }
                          });
        }
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

    private void createActionListeners() {
        final InputMap inputMap = this.textArea.getInputMap();
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0, false), "left-p1-pressed");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0, false), "right-p1-pressed");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q, 0, false), "left-p2-pressed");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_D, 0, false), "right-p2-pressed");
    }
}
