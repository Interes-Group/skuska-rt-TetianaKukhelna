package sk.stuba.fei.uim.oop;

import java.awt.*;

public class TreeShape  {
    private Color farba;

    public Color getFarba() {
        return farba;
    }

    public void setFarba(Color farba) {
        this.farba = farba;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private int x;
    private int y;
    private int height;
    private int width;

    public TreeShape(int x, int y, int height, int width)
    {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }
}
