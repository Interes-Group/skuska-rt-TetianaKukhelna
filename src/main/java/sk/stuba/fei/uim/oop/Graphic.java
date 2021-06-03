package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Graphic {

    private Canvas canvas;
    private Choice ColorChooser;
    private JFrame frame = new JFrame();

    public void Paint() {
        frame = new JFrame("BoxLayout Example X_AXIS");
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

    public List<Shape> getStrom() {
        return canvas.getStrom();
    }

    public void Update() {
        frame.add(canvas, BorderLayout.CENTER);
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public Color getColor() {
        switch (ColorChooser.getSelectedItem()) {
            case "Red":
                return Color.red;
            case "Blue":
                return Color.blue;
            case "Green":
                return Color.green;
        }
        return Color.white;
    }
}