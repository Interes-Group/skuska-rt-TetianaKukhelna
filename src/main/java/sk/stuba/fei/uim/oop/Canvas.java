package sk.stuba.fei.uim.oop;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Canvas extends java.awt.Canvas {
    private java.util.List<Shape> Tree = new ArrayList<>();
    private MouseClick mouseClick;

    public Canvas () {
        setSize(300, 300);
    }

    public void paint (Graphics g) {
        for (int i = 0; i < Tree.size(); i++) {
            g.setColor(Tree.get(i).getColor());
            int min = Math.abs(Tree.get(i).getX1() - Tree.get(i).getX2()) < Math.abs(Tree.get(i).getY1() - Tree.get(i).getY2()) ? Math.abs(Tree.get(i).getX1() - Tree.get(i).getX2()) : Math.abs(Tree.get(i).getY1() - Tree.get(i).getY2());
            int minx = Tree.get(i).getX1() < Tree.get(i).getX2() ? min : -min;
            int miny = Tree.get(i).getY1() < Tree.get(i).getY2() ? min : -min;
            drawRect(Tree.get(i).getX1() + (int)minx/3, Tree.get(i).getY1(), (int)minx/3, (int)miny/3, g);
            drawRect(Tree.get(i).getX1(), Tree.get(i).getY1() + (int)miny/3, (int)minx/3, (int)miny/3, g);
            drawRect(Tree.get(i).getX1() + (int)minx/3, Tree.get(i).getY1() + (int)miny/3, (int)minx/3, (int)miny/3, g);
            drawRect(Tree.get(i).getX1() + (int)minx/3 * 2, Tree.get(i).getY1() + (int)miny/3, (int)minx/3, (int)miny/3, g);
            drawRect(Tree.get(i).getX1() + (int)minx/3, Tree.get(i).getY1() + (int)miny/3 * 2, (int)minx/3, (int)miny/3, g);
        }
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

    public MouseClick getMouseClick() {
        return mouseClick;
    }

    public void setMouseClick(MouseClick mouseClick) {
        this.mouseClick = mouseClick;
    }

    public List<Shape> getTree() {
        return Tree;
    }

}
