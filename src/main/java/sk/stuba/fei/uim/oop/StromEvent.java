package sk.stuba.fei.uim.oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class StromEvent extends MouseClick {

    private int Start = -1;

    StromEvent(Graphic graphic) {
        super(graphic);
    }

    @Override
    public void mouseClicked(MouseEvent event) {
        if (Start == -1) {
            graphic.getTree().add(new Shape(event.getX(), event.getY(), graphic.getColor()));
            Start = 1;
        } else {
            Start = -1;
        }
    }

    @Override
    public void mouseMoved(MouseEvent event){
        if (Start == 1) {
            graphic.getTree().get(graphic.getTree().size() - 1).setX2(event.getX());
            graphic.getTree().get(graphic.getTree().size() - 1).setY2(event.getY());
            graphic.Update();
        }
    }
}
