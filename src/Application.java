import panels.LogIn;

import javax.swing.*;
import java.awt.*;

/**
 * Created by teemu on 13.4.2016.
 */
public class Application extends JFrame {
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Application() {
        super.setTitle("Smart Home Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(600, 400));
        setContentPane(new LogIn());
        setVisible(true);
    }

    public void setMainPanel(JPanel panel) {

    }

    public static void main(String[] args) {
        setLookAndFeel();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Application app = new Application();
            }
        });
    }

}
