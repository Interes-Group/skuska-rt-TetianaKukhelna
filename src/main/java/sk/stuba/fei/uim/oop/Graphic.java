package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Graphic {

    private Canvas canvas;
    private Choice ColorChooser = new Choice();
    private JFrame frame = new JFrame();

    public void Paint() {
        frame = new JFrame("BoxLayout Example X_AXIS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ColorChooser.add("RED");
        ColorChooser.add("GREEN");
        ColorChooser.add("BLUE");
        Strom s = new Strom();
        frame.setContentPane(s);
        frame.setSize(300, 300);
        frame.setVisible(true);
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

//        Label label = new Label("Label");
//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.weightx = 0.5;
//        c.gridx = 3;
//        c.gridy = 0;
//        panel.add(label, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 0;
        panel.add(ColorChooser, c);



        frame.getContentPane().add(BorderLayout.SOUTH, panel);

        frame.setSize(500, 500);

        frame.setVisible(true);

        jb3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                s.setFarba(getColor());
            }
        });
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
            case "RED":
                return Color.red;
            case "GREEN":
                return Color.green;
            case "BLUE":
                return Color.blue;
        }
        return Color.black;
    }
}
