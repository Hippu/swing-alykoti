package panels;

import javax.swing.*;
import java.awt.*;

/**
 * Created by teemu on 13.4.2016.
 */
public class LogIn extends JPanel {
    private JPasswordField passwordField;
    private JTextField userField;
    private JButton loginButton;

    public LogIn() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        userField = new JTextField("Username", 16);
        passwordField = new JPasswordField("Password", 16);
        loginButton = new JButton("Log In");
        add(userField);
        add(passwordField);
        add(loginButton);
    }
}
