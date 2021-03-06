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

        frame.add(new Strom());
        frame.setSize(300, 300);
        frame.setVisible(true);
        JButton jb1 = new JButton("Strom");
        jb1.addActionListener(new StromTlacidlo(this));
        JButton jb2 = new JButton("Presun");
        jb2.addActionListener(new PresunTlacidlo(this));
        JButton jb3 = new JButton("Ďalšia farba");
        jb3.addActionListener(new FarbaTlacidlo(this));

        JPanel panel = new JPanel();

//        GridBagConstraints c = new GridBagConstraints();

//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.weightx = 0.5;
//        c.gridx = 0;
//        c.gridy = 0;
        panel.add(jb1);

//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.weightx = 0.5;
//        c.gridx = 1;
//        c.gridy = 0;
        panel.add(jb2);

//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.weightx = 0.5;
//        c.gridx = 2;
//        c.gridy = 0;
        panel.add(jb3);

        Label label = new Label("Label");
//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.weightx = 0.5;
//        c.gridx = 3;
//        c.gridy = 0;
        panel.add(label);

        frame.add(panel, BorderLayout.SOUTH);

        frame.setSize(500, 500);

        frame.setVisible(true);
    }

    public List<Shape> getTree() {
        return canvas.getTree();
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
