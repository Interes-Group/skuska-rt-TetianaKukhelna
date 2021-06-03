package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Strom extends JPanel {
    private Color farba;
    private int x;
    private int y;
    private int height;
    private int width;

    public Strom() {

        x = 0;
        y = 200;
        height = 100;
        width = 100;
        MyMouseListener listener = new MyMouseListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);
    }

    public void setStartPoint(int x, int y) {
        this.x = x; this.y = y;
    }

    public void setEndPoint(int x, int y) {
        width = Math.abs(this.x - x);
        height = Math.abs(this.y - y);
    }

    class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            setStartPoint(e.getX(), e.getY());
        }
        public void mouseDragged(MouseEvent e) {
            setEndPoint(e.getX(), e.getY()); repaint();
        }
        public void mouseReleased(MouseEvent e) {
            setEndPoint(e.getX(), e.getY()); repaint();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(this.x+this.width/3,this.y+this.height/3,width/3,2*height/3);
        g.fillOval(this.x,this.y,this.width,2*this.height/3);

    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

}