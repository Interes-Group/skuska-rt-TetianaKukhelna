package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Tree extends JPanel {

    public Tree() {
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        int width = getWidth();
        int height = getHeight();

        g2d.setColor(new Color(139, 69, 19));
        g2d.fillRect((width / 2) - 20, height / 2, 40, height / 2);

        g2d.setColor(Color.GREEN);
        int radius = 60;
        g2d.fillOval((width / 2) - radius, (height / 2) - (radius), radius * 2, radius * 2);
        g2d.dispose();
    }

}