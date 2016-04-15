import javax.swing.*;
import java.awt.*;

/**
 * Created by teemu on 13.4.2016.
 */
public class HelloWorld {
    private static void createAndShowGui() {
        JFrame frame = new JFrame("Hello World!");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World!");
        frame.getContentPane().add(label);

        frame.setMinimumSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (IllegalAccessException | InstantiationException |
                ClassNotFoundException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGui();
            }
        });
    }
}
