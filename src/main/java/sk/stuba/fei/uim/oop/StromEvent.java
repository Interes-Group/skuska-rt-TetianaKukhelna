package sk.stuba.fei.uim.oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StromEvent implements ActionListener {

    private Graphic graphic;

    StromEvent (Graphic graphic) {
        this.graphic = graphic;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        graphic.getCanvas().removeMouseListener(graphic.getCanvas().getMouseClick());
        graphic.getCanvas().removeMouseMotionListener(graphic.getCanvas().getMouseClick());
        //graphic.getCanvas().setMouseClick(new PlusMouseClickListener(graphic));
        graphic.getCanvas().addMouseMotionListener(graphic.getCanvas().getMouseClick());
        graphic.getCanvas().addMouseListener(graphic.getCanvas().getMouseClick());
    }
}
