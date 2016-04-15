package panels;

import components.TestComponent;

import javax.swing.*;

/**
 * Created by teemu on 15.4.2016.
 */
public class UserPanel extends JPanel {

    public UserPanel() {
        this.add(new TestComponent().getPanel());
        this.add(new TestComponent().getPanel());
        this.add(new TestComponent().getPanel());
    }
}
