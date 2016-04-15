package panels;

import javax.swing.*;
import java.awt.*;
import app.Application;

/**
 * Created by teemu on 13.4.2016.
 */
public class LogIn extends JPanel {
    private JPasswordField passwordField;
    private JTextField userField;
    private JButton loginButton;

    public LogIn(Application app) {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        userField = new JTextField("Username", 16);
        passwordField = new JPasswordField("Password", 16);
        loginButton = new JButton("Log In");
        add(userField);
        add(passwordField);
        add(loginButton);

        loginButton.addActionListener(e -> {
            String password = String.valueOf(passwordField.getPassword());
            logIn(userField.getText(), password);
            app.setContentPane(new UserPanel());
            app.revalidate();
        });
    }

    public void logIn(String user, String password) {
        System.out.println("Logged in as " + user);
    }
}
