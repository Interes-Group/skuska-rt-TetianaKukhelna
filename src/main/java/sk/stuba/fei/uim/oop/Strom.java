package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Strom extends JPanel {
    private Color farba;
    private int x;
    private int y;
    private int height;
    private int width;
    private ArrayList<TreeShape> shapes;
    public Strom() {
        MyMouseListener listener = new MyMouseListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);
        shapes = new ArrayList<TreeShape>();
    }

    public void setStartPoint(int x, int y) {
        this.x = x; this.y = y;
    }

    public void setEndPoint(int x, int y) {
        this.width = Math.abs(this.x - x);
        this.height = Math.abs(this.y - y);
    }

    public void addShape()
    {
        shapes.add(new TreeShape(this.x, this.y, this.width, this.height));
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
            addShape();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(TreeShape t : shapes)
        {
            g.setColor(t.getFarba());
            g.fillRect(t.getX()+t.getWidth()/3,t.getY()+t.getHeight()/3,t.getWidth()/3,2*t.getHeight()/3);
            g.fillOval(t.getX(),t.getY(),t.getWidth(),2*t.getHeight()/3);

            g.setColor(Color.RED);
            g.fillRect(this.x+this.width/3,this.y+this.height/3,width/3,2*height/3);
            g.fillOval(this.x,this.y,this.width,2*this.height/3);
        }
        repaint();
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }
}
