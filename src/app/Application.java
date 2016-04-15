package app;

import components.ComponentManager;
import panels.LogIn;

import javax.swing.*;
import java.awt.*;

/**
 * Created by teemu on 13.4.2016.
 */
public class Application extends JFrame {

    private ComponentManager componentManager = new ComponentManager();

    private Application() {
        super.setTitle("Smart Home Application");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(800, 400));
        setContentPane(new LogIn(this));
        setVisible(true);

    }


    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (IllegalAccessException | InstantiationException |
                ClassNotFoundException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        setLookAndFeel();
        SwingUtilities.invokeLater(() -> {
            Application app = new Application();
        });
    }

}
