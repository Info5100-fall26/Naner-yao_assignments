package com.example;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    private Color circleColor = null;
    private JTextField output = new JTextField(20);

    public App() {
        setTitle("Color Circle");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] colors = {"Red", "Blue", "Green"};
        JComboBox<String> dropdown = new JComboBox<>(colors);
        dropdown.setSelectedIndex(-1);

        JPanel circlePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int x = getWidth() / 2 - 90;
                int y = getHeight() / 2 - 90;
                if (circleColor != null) {
                    g.setColor(circleColor);
                    g.fillOval(x, y, 180, 180);
                }
                g.setColor(Color.BLACK);
                g.drawOval(x, y, 180, 180);
            }
        };

        output.setEditable(false);

        dropdown.addActionListener(e -> {
            String name = (String) dropdown.getSelectedItem();
            if (name.equals("Red")) {
                circleColor = Color.RED;
            } else if (name.equals("Blue")) {
                circleColor = Color.BLUE;
            } else {
                circleColor = Color.GREEN;
            }
            output.setText(name);
            circlePanel.repaint();
        });

        JPanel top = new JPanel();
        top.add(new JLabel("Choose a color:"));
        top.add(dropdown);

        JPanel bottom = new JPanel();
        bottom.add(output);

        add(top, BorderLayout.NORTH);
        add(circlePanel, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}