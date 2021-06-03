package sk.stuba.fei.uim.oop;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Canvas extends java.awt.Canvas {
    private java.util.List<Shape> Strom = new ArrayList<>();
    //private List<Figure> LineList = new ArrayList<>();
    private MouseClick mouseClick;

    public Canvas () {
        setSize(300, 300);
    }

    public void paint (Graphics g) {
        for (int i = 0; i < Strom.size(); i++) {
            g.setColor(Strom.get(i).getColor());
            int min = Math.abs(Strom.get(i).getX() - Strom.get(i).getX2()) < Math.abs(Strom.get(i).getY() - Strom.get(i).getY2()) ? Math.abs(Strom.get(i).getX() - Strom.get(i).getX2()) : Math.abs(Strom.get(i).getY() - Strom.get(i).getY2());
            int minx = Strom.get(i).getX() < Strom.get(i).getX2() ? min : -min;
            int miny = Strom.get(i).getY() < Strom.get(i).getY2() ? min : -min;
            drawRect(Strom.get(i).getX() + (int)minx/3, Strom.get(i).getY(), (int)minx/3, (int)miny/3, g);
            drawRect(Strom.get(i).getX(), Strom.get(i).getY() + (int)miny/3, (int)minx/3, (int)miny/3, g);
            drawRect(Strom.get(i).getX() + (int)minx/3, Strom.get(i).getY() + (int)miny/3, (int)minx/3, (int)miny/3, g);
            drawRect(Strom.get(i).getX() + (int)minx/3 * 2, Strom.get(i).getY() + (int)miny/3, (int)minx/3, (int)miny/3, g);
            drawRect(Strom.get(i).getX() + (int)minx/3, Strom.get(i).getY() + (int)miny/3 * 2, (int)minx/3, (int)miny/3, g);
        }
//        for (int i = 0; i < LineList.size(); i++) {
//            g.setColor(LineList.get(i).getColor());
//            g.drawLine(LineList.get(i).getX(), LineList.get(i).getY(), LineList.get(i).getxEnd(), LineList.get(i).getyEnd());
//        }
    }

    private void drawRect(int x, int y, int width, int height, Graphics g) {
        if (width < 0) {
            x += width;
            width = -width;
        }
        if (height < 0) {
            y += height;
            height = -height;
        }
        g.fillRect(x, y, width, height);
    }

    public void setMouseClick(MouseClick mouseClick) {
        this.mouseClick = mouseClick;
    }

    public MouseClick getMouseClick() {
        return mouseClick;
    }

    public List<Shape> getStrom() {
        return Strom;
    }

//    public List<Figure> getLineList() {
//        return LineList;
//    }
}
