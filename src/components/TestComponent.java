package components;

import javax.jws.Oneway;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Created by teemu on 15.4.2016.
 */
public class TestComponent extends BaseComponent {

    JPanel panel;

    public TestComponent() {
        buildPanel();
    }

    @Override
    protected void buildPanel() {
        panel = new JPanel();
        panel.add(new JLabel("TestComponent"));
        panel.add(new JButton("TestButton"));
        JSlider slider = new JSlider();
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.setMinimum(15);
        slider.setMaximum(25);
        slider.addChangeListener(e -> System.out.println(slider.getValue()));
        panel.add(slider);
    }

    public JPanel getPanel() {
        return panel;
    }
}
