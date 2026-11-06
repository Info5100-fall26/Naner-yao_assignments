package hw13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class ChatApp {
    static HashMap<String, String> users = new HashMap<String, String>();
    static HashMap<String, ChatWindow> online = new HashMap<String, ChatWindow>();

    public static void main(String args[]) {
        new LoginWindow();
    }
}

class LoginWindow implements ActionListener {
    JFrame frame;
    JTextField userField, passField;
    JButton loginBtn, signupBtn;
    JLabel status;

    LoginWindow() {
        frame = new JFrame("Sign Up / Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel form = new JPanel(new GridLayout(2, 2, 5, 5));
        userField = new JTextField(15);
        passField = new JTextField(15);
        form.add(new JLabel("Username:"));
        form.add(userField);
        form.add(new JLabel("Password:"));
        form.add(passField);

        JPanel buttons = new JPanel();
        signupBtn = new JButton("Sign Up");
        loginBtn = new JButton("Login");
        buttons.add(signupBtn);
        buttons.add(loginBtn);

        status = new JLabel("Sign up first, then login");

        signupBtn.addActionListener(this);
        loginBtn.addActionListener(this);

        frame.getContentPane().add(BorderLayout.NORTH, form);
        frame.getContentPane().add(BorderLayout.CENTER, buttons);
        frame.getContentPane().add(BorderLayout.SOUTH, status);

        frame.setSize(300, 180);
        frame.setLocation(50, 50);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String user = userField.getText().trim();
        String pass = passField.getText().trim();

        if (user.equals("") || pass.equals("")) {
            status.setText("Enter username and password");
            return;
        }

        if (e.getSource() == signupBtn) {
            if (ChatApp.users.containsKey(user)) {
                status.setText("Username already taken");
            } else {
                ChatApp.users.put(user, pass);
                status.setText("Account created. Now click Login.");
            }
        }

        if (e.getSource() == loginBtn) {
            if (!pass.equals(ChatApp.users.get(user))) {
                status.setText("Wrong username or password");
            } else if (ChatApp.online.containsKey(user)) {
                status.setText(user + " is already logged in");
            } else if (ChatApp.online.size() >= 2) {
                status.setText("Only two participants are allowed");
            } else {
                new ChatWindow(user);
                status.setText(user + " logged in");
                userField.setText("");
                passField.setText("");
            }
        }
    }
}

class ChatWindow implements ActionListener {
    JFrame frame;
    JTextArea area;
    JTextField msgField;
    JButton sendBtn;
    String name;

    ChatWindow(String name) {
        this.name = name;
        ChatApp.online.put(name, this);

        frame = new JFrame("Chat - " + name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        area = new JTextArea();
        area.setEditable(false);

        JPanel bottom = new JPanel(new BorderLayout());
        msgField = new JTextField();
        sendBtn = new JButton("Send");
        bottom.add(BorderLayout.CENTER, msgField);
        bottom.add(BorderLayout.EAST, sendBtn);

        sendBtn.addActionListener(this);
        msgField.addActionListener(this);

        frame.getContentPane().add(BorderLayout.CENTER, new JScrollPane(area));
        frame.getContentPane().add(BorderLayout.SOUTH, bottom);

        frame.setSize(300, 350);
        frame.setLocation(400 + (ChatApp.online.size() - 1) * 320, 50);
        frame.setVisible(true);
    }

    void receive(String from, String text) {
        area.append(from + ": " + text + "\n");
    }

    public void actionPerformed(ActionEvent e) {
        String text = msgField.getText().trim();
        if (text.equals("")) {
            return;
        }

        boolean sent = false;
        for (String other : ChatApp.online.keySet()) {
            if (!other.equals(name)) {
                ChatApp.online.get(other).receive(name, text);
                sent = true;
            }
        }

        if (sent) {
            area.append("Me: " + text + "\n");
            msgField.setText("");
        } else {
            area.append("[System] The other person is not online yet\n");
        }
    }
}