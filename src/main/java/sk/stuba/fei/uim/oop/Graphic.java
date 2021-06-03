package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Graphic {

    public void Paint() {
        JFrame frame = new JFrame("BoxLayout Example X_AXIS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb1 = new JButton("Strom");
        JButton jb2 = new JButton("Presun");
        JButton jb3 = new JButton("Ďalšia farba");

        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(jb1, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        panel.add(jb2, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        panel.add(jb3, c);

        Label label = new Label("Label");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 0;
        panel.add(label, c);

        frame.getContentPane().add(BorderLayout.SOUTH, panel);

        frame.setSize(500, 500);

        frame.setVisible(true);
    }
}
